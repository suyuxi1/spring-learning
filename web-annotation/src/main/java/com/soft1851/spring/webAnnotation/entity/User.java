package com.soft1851.spring.webAnnotation.entity;

import lombok.*;

/**
 * @author su
 * @className User
 * @Description TODO
 * @Date 2020/3/24 21:15
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@NonNull
public class User {

    private Integer id;
    private String name;
    private String phone;

}
