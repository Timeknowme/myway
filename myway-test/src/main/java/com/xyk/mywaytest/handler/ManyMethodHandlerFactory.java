package com.xyk.mywaytest.handler;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xyk
 * @ClassName ManyMethodHandlerFactory
 * @CreateDate 2021/8/25
 * @Description
 */
@Component
public class ManyMethodHandlerFactory implements InitializingBean, ApplicationContextAware {

    private static final Map<String, ManyMethodHandler> map = new HashMap<>();

    private ApplicationContext applicationContext;

    public ManyMethodHandler getInstance(String method) {
        return map.get(method);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        applicationContext.getBeansOfType(ManyMethodHandler.class)
                .values()
                .forEach(handler -> map.put(handler.getMethod(), handler));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
