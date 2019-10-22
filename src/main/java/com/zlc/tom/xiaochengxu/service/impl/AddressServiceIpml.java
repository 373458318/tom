package com.zlc.tom.xiaochengxu.service.impl;

import com.zlc.tom.xiaochengxu.entity.Address;
import com.zlc.tom.xiaochengxu.mapper.AddressMapper;
import com.zlc.tom.xiaochengxu.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceIpml implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    public List<Address> getAddressListByUserId(int userId) {
        return  addressMapper.getAddressListByUserId(userId);
    }


    @Override
    public int insert(Address address) {
        return addressMapper.insert(address);
    }
}
