package com.example.anexample.controller;

import com.example.anexample.pojo.Emp;
import com.example.anexample.pojo.PageBean;
import com.example.anexample.pojo.Result;
import com.example.anexample.service.EmpService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

/**
 * @Description: 员工管理
 * @Author: 徐晓宇
 * @Date: 2023/11/30 18:51
 */
@RestController
@Slf4j
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping("/emps")
    public Result list(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer pageSize,
                       String name, Short gender,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end){
        log.info("分页查询，参数为:{},{},{},{},{},{}",page,pageSize,name,gender,begin,end);
        PageBean pageBean = empService.page(page,pageSize,name,gender,begin,end);
        return Result.success(pageBean);
    }

    @DeleteMapping("/emps/{ids}")
    public Result delete(@PathVariable List<Integer> ids){
        log.info("删除员工信息:{}",ids);
        empService.delete(ids);
        return Result.success();
    }

    @PostMapping("/emps")
    public Result save(@RequestBody Emp emp){
        log.info("添加员工信息:{}",emp);
        empService.save(emp);
        return Result.success();
    }

    @GetMapping("/emps/{id}")
    public Result get(@PathVariable Integer id){
        log.info("查询{}员工信息",id);
        Emp emp = empService.get(id);
        return Result.success(emp);
    }

    @PutMapping("/emps")
    public Result update(@RequestBody Emp emp){
        log.info("修改员工信息:{}",emp);
        empService.update(emp);
        return Result.success();
    }
}
