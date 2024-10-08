package com.xc.rewritespring.springframework.beans.factory;


import com.xc.rewritespring.springframework.beans.BeansException;
import com.xc.rewritespring.springframework.beans.factory.factory.AutowireCapableBeanFactory;
import com.xc.rewritespring.springframework.beans.factory.factory.BeanDefinition;
import com.xc.rewritespring.springframework.beans.factory.factory.ConfigurableBeanFactory;

/**
 * Configuration interface to be implemented by most listable bean factories.
 * In addition to {@link ConfigurableBeanFactory}, it provides facilities to
 * analyze and modify bean definitions, and to pre-instantiate singletons.
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

}
