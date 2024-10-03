package com.xc.rewritespring.springframework.beans.factory.support;

import com.xc.rewritespring.springframework.beans.factory.BeanDefinition;
import com.xc.rewritespring.springframework.beans.factory.BeanFactory;
import com.xc.rewritespring.springframework.beans.factory.BeansException;
import com.xc.rewritespring.springframework.beans.factory.config.DefaultSingletonBeanRegistry;

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

}
