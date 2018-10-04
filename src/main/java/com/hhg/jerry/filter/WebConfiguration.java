package com.hhg.jerry.filter;

import org.apache.catalina.filters.RemoteIpFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Configuration
public class WebConfiguration {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Bean
    public FilterRegistrationBean testFilterRegistration() {

        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new MyFilter());
        registration.addUrlPatterns("/*");
        registration.addInitParameter("paramName", "paramValue");
        registration.setName("MyFilter");
        registration.setOrder(1);
        return registration;
    }

    public class MyFilter implements Filter {
        @Override
        public void destroy() {
            // TODO Auto-generated method stub
        }

        @Override
        public void doFilter(ServletRequest srequest, ServletResponse sresponse, FilterChain filterChain)
                throws IOException, ServletException {
            logger.debug(this.getClass().getSimpleName() + " " + Thread.currentThread().getStackTrace()[1].getMethodName() + " enter");
            // TODO Auto-generated method stub
            HttpServletRequest request = (HttpServletRequest) srequest;
            logger.info("this is MyFilter,url :"+request.getRequestURI());
            filterChain.doFilter(srequest, sresponse);
            logger.debug(this.getClass().getSimpleName() + " " + Thread.currentThread().getStackTrace()[1].getMethodName() + " exit");
        }

        @Override
        public void init(FilterConfig arg0) throws ServletException {
            // TODO Auto-generated method stub
        }
    }
}