package com.noh.Bm;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/index")
public class indexCont {

    @ResponseBody
    @RequestMapping("/index")
    public String index(int i){
        int j=1/i;

        return "hello,Springboot";

    }

}
