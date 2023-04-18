package io.heling.spring.beans.factory.config;

/**
 * @author heling
 * @version 1.0.0
 * @date 2023/4/17 23:49
 * @description BeanDefinition
 */
@SuppressWarnings({"rawtypes"})
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}