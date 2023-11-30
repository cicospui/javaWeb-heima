package com.example.anexample.controller;

import com.example.anexample.pojo.Dept;
import com.example.anexample.pojo.Result;
import com.example.anexample.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description: 部门管理
 * @Author: 徐晓宇
 * @Date: 2023/11/30 18:51
 */
@RestController
@RequestMapping("/depts")   // 公共路径
@Slf4j  // lombok注解，自动创建log对象，用于日志输出,就可以直接log记录日志了
public class DeptController {

    @Autowired
    private DeptService deptService;

    // private static Logger log = LoggerFactory.getLogger(DeptController.class);
    // 查询部门信息
    // @RequestMapping(value = "/depts", method = RequestMethod.GET)
    // 但上边这种限定Method的方式比较麻烦，又出来一个衍生注解，@GetMapping
    @GetMapping
    public Result list(){
        log.info("查询全部部门信息");
        List<Dept> deptList = deptService.list();
        return Result.success(deptList);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") Integer id){
        log.info("删除{}部门信息"+id);
        deptService.delete(id);
        return Result.success();
    }

    @PostMapping
    public Result add(@RequestBody Dept dept){
        log.info("添加部门信息:{}",dept);
        deptService.add(dept);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result get(@PathVariable("id") Integer id){
        log.info("查询{}部门信息",id);
        Dept dept = deptService.get(id);
        return Result.success(dept);
    }

    @PutMapping
    public Result update(@RequestBody Dept dept){
        log.info("修改部门信息:{}",dept);
        deptService.update(dept);
        return Result.success();
    }


}
