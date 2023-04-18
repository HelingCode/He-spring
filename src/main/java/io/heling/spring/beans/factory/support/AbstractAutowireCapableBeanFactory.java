package io.heling.spring.beans.factory.support;

import io.heling.spring.beans.BeansException;
import io.heling.spring.beans.factory.config.BeanDefinition;

/**
 * @author heling
 * @version 1.0.0
 * @date 2023/4/18 21:32
 * @description
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }
        addSingleton(beanName, bean);
        return bean;
    }

}