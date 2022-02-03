package com.example.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MainInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{MainConfiguration.class}; //Spring config
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0]; //DispatcherServlet
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"}; //path
    }
}
