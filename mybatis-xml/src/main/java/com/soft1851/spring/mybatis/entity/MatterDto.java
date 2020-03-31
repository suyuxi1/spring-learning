package com.soft1851.spring.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author su
 * @className MatterDto
 * @Description TODO
 * @Date 2020/3/31 20:35
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MatterDto {

    private String teacherName;
    private String clazzName;
    private String studentName;
    private Student student;
}
