package com.soft1851.spring.web.service;

import com.soft1851.spring.web.entity.Forum;

import java.util.List;

/**
 * @author Su
 * @className ForumService
 * @Description TODO
 * @Date 2020/3/20 13:57
 * @Version 1.0
 **/
public interface ForumService {

    List<Forum> selectAll();

    int insert(Forum forum);

    int count();
}
