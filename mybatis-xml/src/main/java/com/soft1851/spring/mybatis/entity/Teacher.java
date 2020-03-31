package com.soft1851.spring.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author su
 * @className Teacher
 * @Description TODO
 * @Date 2020/3/31 15:22
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Teacher {

    private Integer teacherId;
    private String teacherName;
    private Integer clazzId;
    private Clazz clazz;



}