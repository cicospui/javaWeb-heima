package com.example.anexample.service;

import com.example.anexample.pojo.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 部门接口
 * @Author: 徐晓宇
 * @Date: 2023/11/30 18:56
 */

public interface DeptService {
    // 查询全部数据的方法
    List<Dept> list();

    // 删除部门信息
    void delete(Integer id);

    // 添加部门信息
    void add(Dept dept);

    // 查询部门信息
    Dept get(Integer id);

    // 更新部门信息
    void update(Dept dept);
}
