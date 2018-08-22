package com.tc.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

//    @RequestMapping("/")
//    public String index(ModelMap map) {
//        // 加入一个属性，用来在模板中读取
//        map.addAttribute("host", "http://blog.didispace.com");
//        // return模板文件的名称，对应src/main/resources/templates/index.html
//        return "index";
//    }


    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

}
