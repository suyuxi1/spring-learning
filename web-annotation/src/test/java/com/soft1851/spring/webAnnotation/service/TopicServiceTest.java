package com.soft1851.spring.webAnnotation.service;

import com.soft1851.spring.webAnnotation.config.JDBCConfig;
import com.soft1851.spring.webAnnotation.dao.TopicDao;
import com.soft1851.spring.webAnnotation.spider.JueJinSpider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JDBCConfig.class})
@WebAppConfiguration("src/main/resource")
public class TopicServiceTest {

    @Resource
    private TopicService topicService;




    @Test
    public void batchInsert() {
        topicService.batchInsert(JueJinSpider.getTopics());
    }
}