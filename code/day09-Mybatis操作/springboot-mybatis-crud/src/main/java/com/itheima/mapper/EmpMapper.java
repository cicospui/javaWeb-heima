package com.itheima.mapper;

import com.itheima.pojo.Emp;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {

    // 根据主键ID删除,#用于预编译SQL
    @Delete("delete from emp where id = #{id}")
    public void delete(Integer id);

    // 新增员工
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time)" +
            "value (#{username},#{name},#{gender},#{image},#{job},#{entrydate},#{deptId},#{createTime},#{updateTime})")
    public void insert(Emp emp);

    // 更新操作，根据主键修改员工ID
    @Update("update emp set username = #{username},name = #{name}, gender = #{gender},image = #{image}," +
            " job = #{job},entrydate = #{entrydate},dept_id = #{deptId},update_time = #{updateTime} where id = #{id}")
    public void update(Emp emp);

    // 查询操作，但若实体类中的属性名与数据库中的字段名不一致，需要使用@Results注解进行映射，如下,
    // 但MyBatis把这个方法封装到一个驼峰命名自动映射开关中了，在properties文件中配置
    @Results({
            @Result(column = "dept_id", property = "deptId"),
            @Result(column = "create_time", property = "createTime"),
            @Result(column = "update_time", property = "updateTime")
    })
    @Select("select * from emp where id = #{id}")
    public Emp getById(Integer id);

    // 条件查询操作
//    @Select("select * from emp where name like concat('%',#{name},'%') and gender = #{gender} and " +
//            "entrydate between #{begin} and #{end} order by update_time desc ")
    public List<Emp> list(String name, Short gender, LocalDate begin, LocalDate end);


    public void update2(Emp emp);


    // 批量删除
    public void deleteByIds(List<Integer> ids);
}
