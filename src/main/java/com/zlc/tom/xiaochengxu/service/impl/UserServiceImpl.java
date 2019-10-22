package com.zlc.tom.xiaochengxu.service.impl;

import com.zlc.tom.xiaochengxu.entity.User;
import com.zlc.tom.xiaochengxu.mapper.UserMapper;
import com.zlc.tom.xiaochengxu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(Integer userId) {
        return 0;
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return 0;
    }

    @Override
    public User selectByPrimaryKey(Integer userId) {
        User info=userMapper.selectByPrimaryKey(Integer.parseInt(userId.toString()));
        return info;
    }

    @Override
    public User selectByOpenId(String openId) {
        User info=userMapper.selectByOpenId(openId);
        return info;
    }


    @Override
    public int updateByPrimaryKeySelective(User record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return 0;
    }


}
