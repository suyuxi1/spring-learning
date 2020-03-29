package com.soft1851.spring.webAnnotation.service.impl;

import com.soft1851.spring.webAnnotation.dao.TopicDao;
import com.soft1851.spring.webAnnotation.entity.Topic;
import com.soft1851.spring.webAnnotation.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author su
 * @className TopicServiceImpl
 * @Description TODO
 * @Date 2020/3/27 13:42
 * @Version 1.0
 **/
@Service
@Transactional(rollbackFor = Exception.class)
public class TopicServiceImpl implements TopicService {

    @Resource
    private TopicDao topicDao;

    @Override
    public List<Topic> selectAll() {
        return topicDao.selectAll();
    }

    @Override
    public void addTopic(Topic topic) {
        topicDao.insert(topic);
        try {
            int a = 1/0;
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    @Override
    public int[] batchInsert(List<Topic> topics) {
        return topicDao.batchInert(topics);
    }
}
