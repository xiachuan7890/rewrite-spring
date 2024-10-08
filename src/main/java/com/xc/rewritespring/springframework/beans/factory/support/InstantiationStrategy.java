package com.xc.rewritespring.springframework.beans.factory.support;

import com.xc.rewritespring.springframework.beans.BeansException;
import com.xc.rewritespring.springframework.beans.factory.factory.BeanDefinition;

import java.lang.reflect.Constructor;

public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
