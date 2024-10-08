package com.xc.rewritespring.springframework.beans.factory.support;

import com.xc.rewritespring.springframework.beans.BeansException;
import com.xc.rewritespring.springframework.core.io.Resource;
import com.xc.rewritespring.springframework.core.io.ResourceLoader;

public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;
}
