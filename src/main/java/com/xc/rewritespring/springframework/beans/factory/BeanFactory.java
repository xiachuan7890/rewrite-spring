package com.xc.rewritespring.springframework.beans.factory;

import com.xc.rewritespring.springframework.beans.BeansException;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;


    <T> T getBean(String name, Class<T> requiredType) throws BeansException;
}
