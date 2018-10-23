package com.noh.Bm;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/index")
public class indexCont {
    final  String  viewroot ="html/Learn/";
    @ResponseBody
    @RequestMapping("/index")
    public String index(int i){
        int j=1/i;

        return "hello,Springboot";

    }
    @RequestMapping("/hellothymeleaf")
    public String HelloThymeleaf(HttpServletRequest request){
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaa");
        System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbbb");
        System.out.println("ccccccccccccccccccccccccccc");
        request.setAttribute("helloMsg", "Hello,this is Thymeleaf!");

        return viewroot+"helloThy";



    }

}
