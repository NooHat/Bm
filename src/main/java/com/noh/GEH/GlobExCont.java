package com.noh.GEH;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobExCont {

    @ResponseBody
    @ExceptionHandler(RuntimeException.class)
    public String Runtime(){

        return "系统错误！";

    }

}
