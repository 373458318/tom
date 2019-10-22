package com.zlc.tom.xiaochengxu.mapper;

import com.zlc.tom.xiaochengxu.entity.Area;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AreaMapper {
    List<Area> showProvinceList();

    // 根据省id来查询对应的城市
    List<Area> showCityListByPid(Integer id);

    // 根据city的id来查询所有的区、县
    List<Area> showAreaListBycid(Integer cid);

    public Area selectById(String areaCode);

}