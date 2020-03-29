package com.soft1851.spring.webAnnotation.dao;

import com.soft1851.spring.webAnnotation.config.JDBCConfig;
import com.soft1851.spring.webAnnotation.spider.JueJinSpider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JDBCConfig.class})
@WebAppConfiguration("src/main/resource")
public class TopicDaoTest {

    @Autowired
    private TopicDao topicDao;
    @Test
    public void selectAll() {
        topicDao.selectAll().forEach(System.out::println);
    }


    @Test
    public void batchInert() {
        topicDao.batchInert(JueJinSpider.getTopics());
    }
}