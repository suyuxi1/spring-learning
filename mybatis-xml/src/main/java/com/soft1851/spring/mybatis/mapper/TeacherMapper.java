package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.entity.MatterDto;
import com.soft1851.spring.mybatis.entity.MatterVo;
import com.soft1851.spring.mybatis.entity.Teacher;

import java.util.List;

/**
 * @author Su
 * @className TeacherMapper
 * @Description TODO
 * @Date 2020/3/31 19:23
 * @Version 1.0
 **/

public interface TeacherMapper {

    /**
     * 根据teacherId一对一关联查询其管理的班级信息
     *
     * @param teacherId
     * @return
     */
    Teacher getTeacherOneToOne(int teacherId);

    /**
     *
     * @param matterDto
     * @return
     */
    List<MatterVo> selectLimitFromTeacherInClassByDynamicSql(MatterDto matterDto);
}
