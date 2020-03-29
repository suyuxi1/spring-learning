package com.soft1851.spring.webAnnotation.controller;

import com.alibaba.fastjson.JSONObject;
import com.soft1851.spring.web.util.ResponseObject;
import com.soft1851.spring.webAnnotation.service.TopicService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author su
 * @className TopicController
 * @Description TODO
 * @Date 2020/3/28 21:10
 * @Version 1.0
 **/
@Controller
@RequestMapping(value = "/")
public class TopicController {
    @Resource
    private TopicService topicService;

    @GetMapping(value = "topics", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String getTopic(){
        ResponseObject rs = new ResponseObject(1,"success",topicService.selectAll());
        return JSONObject.toJSONString(rs);
    }

    @GetMapping("/topic")
    public String topic(Model model){
        model.addAttribute("topics", topicService.selectAll());
        return "topic";
    }



}
