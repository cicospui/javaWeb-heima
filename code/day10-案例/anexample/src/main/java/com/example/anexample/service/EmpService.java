package com.example.anexample.service;

import com.example.anexample.pojo.Emp;
import com.example.anexample.pojo.PageBean;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

/**
 * @Description: 员工服务接口
 * @Author: 徐晓宇
 * @Date: 2023/11/30 18:57
 */

public interface EmpService {
    // 分页查询
    PageBean page(Integer page, Integer pageSize, String name, Short gender, LocalDate begin, LocalDate end);

    void delete(List<Integer> ids);


    void save(Emp emp);

    Emp get(Integer id);

    void update(Emp emp);
}
