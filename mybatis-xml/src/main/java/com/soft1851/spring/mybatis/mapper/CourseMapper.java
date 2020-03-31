package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.entity.Course;

/**
 * @author Su
 * @className CourseMapper
 * @Description TODO
 * @Date 2020/4/1 1:08
 * @Version 1.0
 **/
public interface CourseMapper {

    /**
     * 根据班课id查询班课详情
     * @param courseId
     * @return
     */
    Course getCourseById(int courseId);
}
