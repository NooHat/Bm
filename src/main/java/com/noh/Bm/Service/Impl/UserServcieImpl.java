package com.noh.Bm.Service.Impl;

import com.noh.Bm.Service.UserService;
import com.noh.Bm.model.User;
import org.springframework.stereotype.Repository;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author 95
 * @Title: UserServcieImpl
 * @ProjectName Bm
 * @Description: TODO
 * @date 2018/10/219:03
 */
@Repository
public class UserServcieImpl implements UserService {

    private final ConcurrentMap<Long,User> userMap = new ConcurrentHashMap<>();
    @Override
    public void SaveOrUpdateUser(User user) {

    }

    @Override
    public void DelUser(User user) {

    }
    @Override
    public User FindUser(User user) {
        user.setId("1");
        user.setUsername("Tom");
        user.setPwd("123456");


        return user ;
    }
}
