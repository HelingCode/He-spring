package io.heling.spring;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author heling
 * @version 1.0.0
 * @date 2023/4/17 23:51
 * @description
 */
public class BeanFactory {

    private Map<String,BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }

}
