package com.zlc.tom.xiaochengxu.service;


import com.zlc.tom.xiaochengxu.entity.User;

public interface UserService {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    User selectByOpenId(String openId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}
