package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-mybatis.xml"})
public class StudentMapperTest {

    @Resource
    private StudentMapper studentMapper;

    @Test
    public void insert() {
        Student student = Student.builder()
                .clazzId(1)
                .studentName("测试用户")
                .hometown("江苏南京")
                .birthday(LocalDate.of(200,10,10))
                .build();
        studentMapper.insert(student);
        System.out.println(student.getStudentId());
    }

    @Test
    public void delete() {
        studentMapper.delete(2010);
    }

    @Test
    public void update() {
        Student student = studentMapper.getStudentById(2010);
        System.out.println(student);
        student.setStudentName("修改name");
        student.setHometown("北京");
        student.setBirthday(LocalDate.of(2001,1,1));
        studentMapper.update(student);
        System.out.println(studentMapper.getStudentById(2010));
    }

    @Test
    public void batchInsert() {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            Student student = Student.builder()
                    .studentId(2020+i)
                    .studentName("测试"+i)
                    .clazzId(1)
                    .birthday(LocalDate.of(2000,01,02)).build();
            students.add(student);
        }
        System.out.println(studentMapper.batchInsert(students));
    }

    @Test
    public void batchDelete() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i<10; i++){
            list.add(i);
        }
        studentMapper.batchDelete(list);
    }

    @Test
    public void batchUpdate() {
        List<Student> list = new ArrayList<>();
        for (int i = 1; i < 6; i++){
            Student student = Student.builder()
                    .studentId(2020 + i)
                    .studentName("测试批量修改"+i)
                    .clazzId(3)
                    .build();
            list.add(student);
        }
        int n = studentMapper.batchUpdate(list);
        System.out.println(n);
    }

    @Test
    public void selectLimit() {
    }

    @Test
    public void selectLimitByDynamicSql() {
    }

    @Test
    public void selectAll() {
        List<Student> students = studentMapper.selectAll();
        students.forEach(student -> {
            System.out.println(student.getStudentId() + "," +
                    student.getStudentName() + "," +
                    student.getHometown() + "," +
                    student.getBirthday() + "," +
                    student.getClazz().getClazzName());
        });
    }
}