package com.noh.Bm.Service;

import com.noh.Bm.model.User;
import org.springframework.stereotype.Repository;

/**
 * @author 95
 * @Title: UserService
 * @ProjectName Bm
 * @Description: User业务层
 * @date 2018/10/218:43
 */

public interface UserService {

    /**
    　　* @Description: 新增或保存
    　　* @param
    　　* @return
    　　* @throws
    　　* @author 95
    　　* @date 2018/10/2 18:59
    　　*/
    void SaveOrUpdateUser(User user);
    /**
    　　* @Description: 删除用户
    　　* @param
    　　* @return
    　　* @throws
    　　* @author 95
    　　* @date 2018/10/2 19:02
    　　*/
    void DelUser(User user);
    /**
    　　* @Description: 查找用户
    　　* @param
    　　* @return
    　　* @throws
    　　* @author 95
    　　* @date 2018/10/2 19:03
    　　*/
    User FindUser(User user);



}
