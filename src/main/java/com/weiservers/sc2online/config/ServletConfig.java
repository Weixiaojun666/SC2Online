package com.weiservers.sc2online.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//import javax.servlet.Filter;

//替换web.xml配置文件
public class ServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    //配置需要加载的Spring的配置类
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    //配置需要加载的SpringMVC的配置类
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMVCConfig.class};
    }

    //配置前端控制器的影射路径
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
