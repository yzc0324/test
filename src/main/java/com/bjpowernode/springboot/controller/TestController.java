package com.bjpowernode.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * ClassName:TestController
 * Package:com.bjpowernode.springboot.controller
 * Description:
 *
 * @date:2019/11/22-17:23
 * @author:yangzhaochen
 */
@RestController
public class TestController {

    @RequestMapping("/test/set")
    public String testSet(HttpSession session){

        session.setAttribute("myKey", "session中的数据");

        return "保存成功";
    }

    @RequestMapping("/test/get")
    public String testGet(HttpSession session){

        String value = (String) session.getAttribute("myKey");

        return value;
    }

}
