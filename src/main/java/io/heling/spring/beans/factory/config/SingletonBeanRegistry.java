package io.heling.spring.beans.factory.config;

/**
 * @author heling
 * @version 1.0.0
 * @date 2023/4/18 21:02
 * @description Singleton registration
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
