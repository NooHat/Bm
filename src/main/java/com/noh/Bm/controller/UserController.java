package com.noh.Bm.controller;

import com.noh.Bm.Service.UserService;
import com.noh.Bm.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 95
 * @Title: UserController
 * @ProjectName Bm
 * @Description: TODO
 * @date 2018/10/315:51
 */
@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findUser")
    public ModelAndView list(Model model){
        model.addAttribute("userList",userService.FindUser(new User()));
        model.addAttribute("title", "用户管理");
        return new ModelAndView("users/findUser", "userModel", model);

    }

}
