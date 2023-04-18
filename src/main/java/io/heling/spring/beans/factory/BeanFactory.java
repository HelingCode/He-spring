package io.heling.spring.beans.factory;

import io.heling.spring.beans.BeansException;

/**
 * @author heling
 * @version 1.0.0
 * @date 2023/4/18 21:05
 * @description
 */
public interface BeanFactory {
    Object getBean(String name) throws BeansException;
}
