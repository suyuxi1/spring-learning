package com.soft1851.spring.webAnnotation.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author su
 * @className Wallpaper
 * @Description TODO
 * @Date 2020/3/24 21:15
 * @Version 1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Wallpaper {
    private Integer id;
    private String likes;
    private String cover;

}
