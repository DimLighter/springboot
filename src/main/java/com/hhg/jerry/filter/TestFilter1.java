package com.hhg.jerry.filter;

import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by lining on 2018/9/14.
 */

@Order(1)
@WebFilter(filterName = "testFilter1", urlPatterns = "/*")
public class TestFilter1 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("TestFilter1 init ...");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("TestFilter1 enter ...");
        chain.doFilter(request,response);
        System.out.println("TestFilter1 exit ...");
    }

    @Override
    public void destroy() {

    }
}
