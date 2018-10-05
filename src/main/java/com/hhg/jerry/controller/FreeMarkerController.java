package com.hhg.jerry.controller;

import com.hhg.jerry.properties.CustomizeProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by lina on 2018/10/5.
 */
@Controller
@RequestMapping("/fm")
public class FreeMarkerController {
    @Resource
    CustomizeProperties customizeProperties;

    @RequestMapping("/empty")
    public String empty(){
        return "empty";
    }

    @RequestMapping("/config")
    public String config(ModelMap modelMap){
        modelMap.addAttribute("config", customizeProperties);
        return "freemarker/config";
    }
}
