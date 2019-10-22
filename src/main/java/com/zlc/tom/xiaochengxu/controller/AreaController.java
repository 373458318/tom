package com.zlc.tom.xiaochengxu.controller;


import com.zlc.tom.xiaochengxu.entity.Area;
import com.zlc.tom.xiaochengxu.service.AddressService;
import com.zlc.tom.xiaochengxu.service.AreaService;
import com.zlc.tom.xiaochengxu.utils.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController()
@RequestMapping("/area")
public class AreaController {


    @Autowired
    AddressService addressService;

    @Autowired
    AreaService areaService;



    @RequestMapping(value = "/queryArealist" , produces = "application/json;charset=UTF-8")
    public String queryArealist(String prmId) {
        System.out.println("类：AreaController，方法queryArealistprmId，获取的参数prmId是:" + prmId);


        Map<String, Object> resultmap = new HashMap<>();

        //查询所有的省份数据
        List<Area> areaProvinceList=areaService.showProvinceList();
        List<Area> areaCityList=null;
        //查询所有城市数据
        if(!StringUtils.isEmpty(prmId)){
            int id=Integer.parseInt(prmId);
            if(id==1 || id==19){
               id+=1;
            }
            areaCityList =areaService.showCityListByPid(id);
        }
        //将数据返回页面  json
        resultmap.put("areaProvinceList",areaProvinceList);
        resultmap.put("areaCityList",areaCityList);

        System.out.println("类：AreaController，方法queryArealist，即将返回的数据是:" +JsonUtil.toJsonStr(resultmap));
        return JsonUtil.toJsonStr(resultmap);
    }






}
