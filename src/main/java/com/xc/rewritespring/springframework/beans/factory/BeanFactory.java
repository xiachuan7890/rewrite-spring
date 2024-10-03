package com.xc.rewritespring.springframework.beans.factory;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args);
}
