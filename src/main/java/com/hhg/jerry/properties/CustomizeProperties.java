package com.hhg.jerry.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by lining on 2018/9/14.
 */
@Component
@PropertySource("classpath:jerry.properties")
@ConfigurationProperties(prefix = "jerry")
public class CustomizeProperties {
    private String name;

    private String alias;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
