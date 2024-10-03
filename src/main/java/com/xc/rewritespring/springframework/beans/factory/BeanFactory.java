package com.xc.rewritespring.springframework.beans.factory;

import com.xc.rewritespring.springframework.beans.BeansException;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args);
}
