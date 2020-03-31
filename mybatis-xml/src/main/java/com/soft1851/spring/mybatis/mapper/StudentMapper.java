package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Su
 * @className StudentMapper
 * @Description TODO
 * @Date 2020/3/31 16:07
 * @Version 1.0
 **/
@Transactional(rollbackFor = Exception.class)
public interface StudentMapper {

    /**
     * 添加学生信息
     *
     * @param student
     */
    void insert(Student student);

    /**
     * 根据studentId删除Student
     *
     * @param studentId
     */
    void delete(int studentId);

    /**
     * 根据id查询Student
     * @param studentId
     * @return
     */
    Student getStudentById(int studentId);

    /**
     * 更新Student
     *
     * @param student
     */
    void update(Student student);

    /**
     * 批量新增学生
     *
     * @param students
     * @return
     */
    int batchInsert(@Param("student")List<Student>students);

    /**
     * 批量删除学生
     *
     * @param idList
     * @return
     */
    int batchDelete(@Param("idList") List<Integer> idList);

    /**
     * 批量修改学生信息
     *
     * @param students
     * @return
     */
    int batchUpdate(@Param("students") List<Student>students);

    /**
     * 指定两个条件查询（单表）
     *
     * @return
     */
    List<Student> selectLimit();


    /**
     * 单表指定条件查询
     * @param student
     * @return
     */
    List<Student> selectLimitByDynamicSql(Student student);

    /**
     * 查询所有学生，按生日排序，多对一关联查询所有所在班级信息
     * @return
     */
    List<Student> selectAll();

}
