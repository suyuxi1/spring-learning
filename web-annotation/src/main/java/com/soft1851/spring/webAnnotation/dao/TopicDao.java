package com.soft1851.spring.webAnnotation.dao;

import com.soft1851.spring.webAnnotation.entity.Topic;

import java.util.List;

/**
 * @author Su
 * @className TopicDao
 * @Description TODO
 * @Date 2020/3/26 10:19
 * @Version 1.0
 **/
public interface TopicDao {

    List<Topic> selectAll();

    int[] batchInert(List<Topic> topics);

    int insert(Topic topic);
}
