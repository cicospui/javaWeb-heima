package com.itheima.springbootwebquickstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: 徐晓宇
 * @Date: 2023/11/23 15:27
 */
// 请求处理类
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("HelloController.hello");
        return "success";
    }
}
