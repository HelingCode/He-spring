package io.heling.spring.test;

import io.heling.spring.BeanDefinition;
import io.heling.spring.BeanFactory;
import io.heling.spring.test.bean.UserService;
import org.junit.Test;

/**
 * @author heling
 * @version 1.0.0
 * @date 2023/4/17 23:58
 * @description
 */
public class ApiTest {

    @Test
    public void test_BeanFactory(){
        // 1.Initialize the BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2.Inject the bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.Get the bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
