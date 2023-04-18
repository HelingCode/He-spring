package io.heling.spring.beans;

/**
 * @author heling
 * @version 1.0.0
 * @date 2023/4/18 21:06
 * @description
 */
public class BeansException extends RuntimeException{

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
