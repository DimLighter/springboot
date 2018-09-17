package com.hhg.jerry.controller;

import com.alibaba.fastjson.JSONObject;
import com.hhg.jerry.properties.CustomizeProperties;
import com.hhg.jerry.properties.SpringBootProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by lining on 2018/9/11.
 */
@RestController
public class HelloController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource //default by name find, j2ee annotation
    SpringBootProperties springBootProperties;
    @Autowired //default by type find, spring annotation
    CustomizeProperties customizeProperties;

    @RequestMapping("/hello")
    public String index(){
        logger.debug(this.getClass().getSimpleName() + " " + Thread.currentThread().getStackTrace()[1].getMethodName());
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name",customizeProperties.getName());
        jsonObject.put("alias",customizeProperties.getAlias());
        jsonObject.put("age", 33);
        jsonObject.put("happy", false);
        jsonObject.put("skill",new String[]{"c#","java"});
        jsonObject.put("title", springBootProperties.getTitle());
        return jsonObject.toJSONString();
    }
}
