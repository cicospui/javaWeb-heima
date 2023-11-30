package com.example.anexample.mapper;

import com.example.anexample.pojo.Dept;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptMapper {
    // 查询全部数据的方法
    @Select("select * from dept")
    List<Dept> list();

    // 删除部门信息
    @Delete("delete from dept where id=#{id}")
    void delete(Integer id);

    // 添加部门信息
    @Insert("insert into dept(name, create_time, update_time) value (#{name}, #{createTime}, #{updateTime})")
    void add(Dept dept);

    // 查询部门信息
    @Select("select * from dept where id=#{id}")
    Dept get(Integer id);

    // 更新部门信息
    @Insert("update dept set name=#{name}, update_time=#{updateTime} where id=#{id}")
    void update(Dept dept);

}
