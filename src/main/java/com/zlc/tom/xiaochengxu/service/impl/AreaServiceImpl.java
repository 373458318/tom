package com.zlc.tom.xiaochengxu.service.impl;

import com.zlc.tom.xiaochengxu.entity.Area;
import com.zlc.tom.xiaochengxu.mapper.AreaMapper;
import com.zlc.tom.xiaochengxu.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaMapper areaMapper;

    @Override
    public List<Area> showProvinceList() {
        return areaMapper.showProvinceList();
    }

    @Override
    public List<Area> showCityListByPid(int parentId) {
        return areaMapper.showCityListByPid(parentId);
    }

    @Override
    public List<Area> showAreaListBycid(int parentId) {
        return areaMapper.showCityListByPid(parentId);
    }

    @Override
    public String getProvinceName(String areaCode) {

        return areaMapper.selectById(areaCode).getAreaname();
    }



}
