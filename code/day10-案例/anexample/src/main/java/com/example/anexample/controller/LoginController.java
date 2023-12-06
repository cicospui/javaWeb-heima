package com.example.anexample.controller;

import com.example.anexample.pojo.Emp;
import com.example.anexample.pojo.Result;
import com.example.anexample.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 登录的Controller
 * @Author: 徐晓宇
 * @Date: 2023/12/6 14:44
 */
@Slf4j
@RestController
public class LoginController {

    @Autowired
    private EmpService empService;

    @PostMapping("/login")
    public Result login(@RequestBody Emp emp) {
        log.info("登录的员工信息:{}", emp);
        Emp e = empService.login(emp);
        return e != null ? Result.success(e) : Result.error("用户名或密码错误");
    }


}
