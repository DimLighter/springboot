package com.hhg.jerry;

import com.hhg.jerry.properties.CustomizeProperties;
import com.hhg.jerry.properties.SpringBootProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
//@EnableConfigurationProperties({SpringBootProperties.class})
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
