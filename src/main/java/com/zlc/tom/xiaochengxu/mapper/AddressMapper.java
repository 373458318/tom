package com.zlc.tom.xiaochengxu.mapper;

import com.zlc.tom.xiaochengxu.entity.Address;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressMapper {
    // 根据 用户id 查询对应的所有的地址
    List<Address> getAddressListByUserId(Integer userId);
    int insert(Address address);
}