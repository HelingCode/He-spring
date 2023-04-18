package io.heling.spring.beans.factory.support;

import io.heling.spring.beans.BeansException;
import io.heling.spring.beans.factory.BeanFactory;
import io.heling.spring.beans.factory.config.BeanDefinition;

/**
 * @author heling
 * @version 1.0.0
 * @date 2023/4/18 21:23
 * @description
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
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