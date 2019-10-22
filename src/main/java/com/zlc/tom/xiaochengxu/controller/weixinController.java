package com.zlc.tom.xiaochengxu.controller;


import com.zlc.tom.xiaochengxu.entity.Address;
import com.zlc.tom.xiaochengxu.entity.User;
import com.zlc.tom.xiaochengxu.service.AddressService;
import com.zlc.tom.xiaochengxu.service.AreaService;
import com.zlc.tom.xiaochengxu.service.UserService;
import com.zlc.tom.xiaochengxu.utils.JsonUtil;
import com.zlc.tom.xiaochengxu.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController()
@RequestMapping("/user")
public class weixinController {

    @Autowired
    UserService userService;

    @Autowired
    AddressService addressService;

    @Autowired
    AreaService areaService;

    @Resource
    RedisUtil redisUtil;


    @RequestMapping(value = "/queryUserById" , produces = "application/json;charset=UTF-8")
    public User selectUserById(int id) {
        System.out.println("id:" + id);
        User userInfo = userService.selectByPrimaryKey(id);
        System.out.println(userInfo.toString());
        return userInfo;
    }

    @RequestMapping(value = "/queryUserByOpenId" , produces = "application/json;charset=UTF-8")
    public String selectUserByOpenId(String openId) {
        System.out.println("openId:" + openId);
        User userInfo = userService.selectByOpenId(openId);
        if(null==userInfo){
            return null;
        }

        System.out.println(userInfo.toString());

        Map<String, Object> resultmap = new HashMap<>();

        resultmap.put("userInfo",userInfo);


        //接着查询用户的地址信息
        List<Address> addressesList=addressService.getAddressListByUserId(Integer.parseInt(userInfo.getId()+""));

        for (int i = 0; i < addressesList.size(); i++) {
            Address address=addressesList.get(i);
            address.setLinkProvince( areaService.getProvinceName(address.getLinkProvince()));
            address.setLinkCity( areaService.getProvinceName(address.getLinkCity()));

        }

        resultmap.put("addressesList",addressesList);

        System.out.println("方法selectUserByOpenId即将返回:"+JsonUtil.toJsonStr(resultmap));
        return JsonUtil.toJsonStr(resultmap);
    }


    @ResponseBody
    @RequestMapping(value = "/bindPhone" , produces = "application/json;charset=UTF-8")
    public String bindPhone(String openId,String phone,String userName,String wxAccount) {
        System.out.println("接收到的参数：openId:" + openId+",phone:"+phone);
        Map<String, Object> resultmap = new HashMap<>();
        if(StringUtils.isEmpty(openId) || StringUtils.isEmpty(phone)){
            resultmap.put("code","200");
            resultmap.put("message","参数为空，请重试！");
        }
        //开发保存信息
        User info=new User();
        info.setOpenid(openId);
        info.setPhone(phone);
        info.setUsername("");
        info.setPassword("123456");

        info.setAvatar(wxAccount);
        int re= userService.insert(info);
        System.out.println("bindPhone保存返回结果："+re);
        //获取保存的信息
        User userInfo = userService.selectByOpenId(openId);
        //存放redis中
        redisUtil.set("userId",userInfo.getId().toString());



        if(re!=1){
            resultmap.put("code","200");
            resultmap.put("message","保存异常，请重试！");
            return JsonUtil.toJsonStr(resultmap);
        }
        resultmap.put("code","100");
        System.out.println("方法bindPhone即将返回:"+JsonUtil.toJsonStr(resultmap));
        return JsonUtil.toJsonStr(resultmap);
    }

    @ResponseBody
    @RequestMapping(value = "/addAddress" , produces = "application/json;charset=UTF-8")
    public String addAddress(String data_name,String data_phone,String data_province,String data_city,String data_addr) {
        System.out.println("方法addAddress接收到的参数：data_name:" + data_name+",data_phone:"+data_phone);
        System.out.println("方法addAddress接收到的参数：data_province:" + data_province+",data_city:"+data_city);
        System.out.println("方法addAddress接收到的参数：data_addr:" + data_addr);
        Map<String, Object> resultmap = new HashMap<>();
        Object userId=redisUtil.get("userId");
        User userInfo = userService.selectByPrimaryKey(Integer.parseInt(userId.toString()));

        System.out.println("方法addAddress获取到的redis中的userId是："+userId);
        if(userInfo==null||StringUtils.isEmpty(userId) || StringUtils.isEmpty(data_name) ||StringUtils.isEmpty(data_phone)||StringUtils.isEmpty(data_province) || StringUtils.isEmpty(data_city)){
            resultmap.put("code","200");
            resultmap.put("message","参数为空，请重试！");
            return JsonUtil.toJsonStr(resultmap);
        }

        //开始组织地址保存信息
        Address address=new Address();
        address.setUserId(Long.parseLong(userId.toString()));
        address.setLinkProvince(data_province);
        address.setLinkCity(data_city);
        address.setLinkPhone(data_phone);
        address.setLinkMan(data_name);
        address.setLinkAddr(data_addr);
        address.setCreateTime(new Date());
        int re= addressService.insert(address);
        System.out.println("方法addAddress保存insert返回结果："+re);
        if(re!=1){
            resultmap.put("code","200");
            resultmap.put("message","保存异常，请重试！");
            return JsonUtil.toJsonStr(resultmap);
        }
        resultmap.put("code","100");
        System.out.println("方法addAddress即将返回:"+JsonUtil.toJsonStr(resultmap));
        return JsonUtil.toJsonStr(resultmap);
    }

}
