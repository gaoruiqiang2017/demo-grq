package com.weixinpay.demo.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author gaoruiqiang
 * @Description
 * @Date:19
 *//*
 @author: gaoruiqiang
 @DESCRIPTION:
 @create:2019/5/19
*/

@Controller
public class Hello {

        @ResponseBody
        @RequestMapping("/hello")
        public String hello(){
        //测试
        return "hello grq";
    }

}
