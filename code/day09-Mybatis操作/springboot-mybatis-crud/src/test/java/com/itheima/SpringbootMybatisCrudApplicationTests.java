package com.itheima;

import com.itheima.mapper.EmpMapper;
import com.itheima.pojo.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class SpringbootMybatisCrudApplicationTests {

    @Autowired
    private EmpMapper empMapper;

    @Test
    public void testDelete() {
        empMapper.delete(16);
    }

    @Test
    public void testInsert(){
        Emp emp = new Emp();
        emp.setUsername("Tom1");
        emp.setName("汤姆1");
        emp.setGender((short) 1);
        emp.setImage("1.jpg");
        emp.setJob((short) 1);
        emp.setEntrydate(LocalDate.of(2020, 1, 1));
        emp.setDeptId(1);
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());

        empMapper.insert(emp);
        System.out.println(emp.getId());
    }

    @Test
    public void testUpdate(){
        Emp emp = new Emp();
        emp.setId(18);
        emp.setUsername("Tom5");
        emp.setName("汤姆5");
        emp.setGender((short) 1);
        emp.setImage("1.jpg");
        emp.setJob((short) 1);
        emp.setEntrydate(LocalDate.of(2020, 1, 1));
        emp.setDeptId(1);
        emp.setUpdateTime(LocalDateTime.now());

        empMapper.update(emp);
    }

    @Test
    public void testGetById(){
        Emp emp = empMapper.getById(18);
        System.out.println(emp);
    }

    @Test
    public void testList(){
//        empMapper.list("张", (short) 1, LocalDate.of(2000, 1, 1), LocalDate.now())
//                .forEach(System.out::println);
//        empMapper.list("张", null, null, null)
//                .forEach(System.out::println);
        empMapper.list("", (short) 1, null, null)
                .forEach(System.out::println);
    }
    @Test
    public void testUpdate2(){
        Emp emp = new Emp();
        emp.setId(19);
        emp.setUsername("Tom222333");
//        emp.setName("汤姆222");
//        emp.setGender((short) 2);
//        emp.setUpdateTime(LocalDateTime.now());

        empMapper.update2(emp);
    }

    @Test
    public void testDeleteByIds(){
        empMapper.deleteByIds(List.of(13, 14, 15));
    }
}
