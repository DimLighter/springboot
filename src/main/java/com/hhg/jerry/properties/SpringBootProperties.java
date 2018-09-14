package com.hhg.jerry.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by lining on 2018/9/14.
 */
@Component
@ConfigurationProperties()
public class SpringBootProperties {
    @Value("${jerry.title}")
    private String title;

    public String getTitle(){
        return title;
    }
}
