package com.xc.rewritespring.springframework.beans.factory;

import com.xc.rewritespring.springframework.beans.factory.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;
}
