package io.heling.spring.beans.factory.support;

import io.heling.spring.beans.factory.config.BeanDefinition;

/**
 * @author heling
 * @version 1.0.0
 * @date 2023/4/18 21:11
 * @description
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}