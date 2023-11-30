package com.example.anexample.mapper;

import com.example.anexample.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {

//    // 获取总记录数
//    @Select("select count(*) from emp")
//    public long count();
//
//    // 分页查询获取列表数据
//    @Select("select * from emp limit #{start},#{pageSize}")
//    public List<Emp> page(Integer start, Integer pageSize);
    // 员工信息查询
    // @Select("select * from emp")
    public List<Emp> list(String name, Short gender, LocalDate begin, LocalDate end);


    // 删除员工信息
    public void delete(List<Integer> ids);
}
