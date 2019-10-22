package com.zlc.tom.xiaochengxu.service;

import com.zlc.tom.xiaochengxu.entity.Address;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AddressService {
    //查询
    public List<Address> getAddressListByUserId(int userId);

    int insert(Address address);

}

