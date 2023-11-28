package com.itheima.dao.impl;

import com.itheima.dao.EmpDao;
import com.itheima.pojo.Emp;
import com.itheima.utils.XmlParserUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description: Dao的实现类
 * @Author: 徐晓宇
 * @Date: 2023/11/28 19:10
 */
//@Component  // 将当前类交给容器管理，称为IOC容器中的一部分
@Repository
public class EmpDaoA implements EmpDao {
    @Override
    public List<Emp> listEmp() {
        // 加载并解析xml文件
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        System.out.println(file);
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
        return empList;
    }
}
