package com.noh.Bm.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 95
 * @Title: User
 * @ProjectName Bm
 * @Description: User实体类
 * @date 2018/10/1 22:14
 */
@Data
public class User {

    private String id;
    private String username;//用户名
    private String pwd;//密码

}
