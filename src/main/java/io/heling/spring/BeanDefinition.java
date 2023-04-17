package io.heling.spring;

/**
 * @author heling
 * @version 1.0.0
 * @date 2023/4/17 23:49
 * @description BeanDefinition
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
