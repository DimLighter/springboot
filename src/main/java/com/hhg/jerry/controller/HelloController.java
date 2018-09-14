package com.hhg.jerry.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lining on 2018/9/11.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index(){
        System.out.println(this.getClass().getSimpleName() + " " + Thread.currentThread().getStackTrace()[1].getMethodName());
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","dennis");
        jsonObject.put("age", 33);
        jsonObject.put("happy", false);
        jsonObject.put("skill",new String[]{"c#","java"});
        return jsonObject.toJSONString();
    }
}
