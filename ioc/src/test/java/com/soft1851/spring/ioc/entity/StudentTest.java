package com.soft1851.spring.ioc.entity;

import com.soft1851.spring.ioc.config.StudentConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"/beans.xml"})
@ContextConfiguration(classes = StudentConfig.class)
public class StudentTest {
    @Autowired
    private Student student;

    @Test
    public void test(){
        System.out.println(student);

    }

}