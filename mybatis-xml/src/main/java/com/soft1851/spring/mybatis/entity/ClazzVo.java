package com.soft1851.spring.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * @author su
 * @className ClazzVo
 * @Description TODO
 * @Date 2020/3/31 21:02
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClazzVo {
    private Integer clazzId;
    private  String clazzName;
    private  Integer studentId;
    private  String studentName;
    private  String hometown;
    private LocalDate birthday;
}
