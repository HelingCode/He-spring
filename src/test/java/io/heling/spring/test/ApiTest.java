package io.heling.spring.test;

//import io.heling.spring.beans.BeanDefinition;
import io.heling.spring.beans.factory.config.BeanDefinition;
import io.heling.spring.beans.factory.support.DefaultListableBeanFactory;
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
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.第一次获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        // 4.第二次获取 bean from Singleton
        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();
    }

}
