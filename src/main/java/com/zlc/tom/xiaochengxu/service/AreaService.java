package com.zlc.tom.xiaochengxu.service;


import com.zlc.tom.xiaochengxu.entity.Area;

import java.util.List;


public interface AreaService {
    // 查询出所有的省份
    public List<Area> showProvinceList();
    // 根据省id来查询所对应的城市名称
    public List<Area> showCityListByPid(int parentId);

    // 根据city的id来查询所有的区、县
    public List<Area> showAreaListBycid(int parentId);


    public String getProvinceName(String areaCode);

}
