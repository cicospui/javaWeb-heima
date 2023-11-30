package com.example.anexample.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Description: 员工分页查询结果的封装类
 * @Author: 徐晓宇
 * @Date: 2023/11/30 20:49
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageBean {

    private Long total; // 总记录数
    private List rows; // 当前页结果
}
