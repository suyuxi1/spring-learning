package com.soft1851.spring.webAnnotation.service;

import com.soft1851.spring.webAnnotation.entity.Topic;

import java.util.List;

/**
 * @author Su
 * @className TopicService
 * @Description TODO
 * @Date 2020/3/27 13:41
 * @Version 1.0
 **/
public interface TopicService {
    /**
     * 查询所有
     * @return List<Topic>
     */
    List<Topic> selectAll();

    /**
     * 新增topic
     * @param topic
     */
    void addTopic(Topic topic);

    /**
     * 批量新增
     * @param topics
     * @return int[]
     */
    int[] batchInsert(List<Topic> topics);

}
