package com.example.anexample.service.impl;

import com.example.anexample.mapper.EmpMapper;
import com.example.anexample.pojo.Emp;
import com.example.anexample.pojo.PageBean;
import com.example.anexample.service.EmpService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @Description: 员工管理实现
 * @Author: 徐晓宇
 * @Date: 2023/11/30 18:55
 */
@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public PageBean page(Integer page, Integer pageSize, String name, Short gender, LocalDate begin, LocalDate end) {
//        // 获取总记录数
//        long count = empMapper.count();
//
//        // 获取分页查询结果列表
//        Integer start = (page - 1) * pageSize;
//        List<Emp> empList = empMapper.page(start, pageSize);
//
//        // 封装PageBean
//        PageBean pageBean = new PageBean(count, empList);
//        return pageBean;
        // 设置分页参数
        PageHelper.startPage(page,pageSize);
        
        // 执行查询
        List<Emp> empList = empMapper.list(name,gender,begin,end);
        Page<Emp> p = (Page<Emp>) empList;

        // 封装PageBean
        PageBean pageBean = new PageBean(p.getTotal(), p.getResult());
        return pageBean;
    }

    @Override
    public void delete(List<Integer> ids) {
        // 删除员工信息
        empMapper.delete(ids);
    }

    @Override
    public void save(Emp emp) {

        // 添加员工信息
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.insert(emp);

    }

    @Override
    public Emp get(Integer id) {
        // 查询员工信息
        return empMapper.getById(id);
    }

    @Override
    public void update(Emp emp) {
        // 修改员工信息
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.update(emp);
    }
}
