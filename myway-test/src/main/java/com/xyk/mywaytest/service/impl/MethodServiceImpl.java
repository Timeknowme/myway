package com.xyk.mywaytest.service.impl;

import com.xyk.mywaytest.handler.ManyMethodHandler;
import com.xyk.mywaytest.handler.ManyMethodHandlerFactory;
import com.xyk.mywaytest.model.TestMethod;
import com.xyk.mywaytest.service.MethodService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xyk
 * @ClassName MethodServiceImpl
 * @CreateDate 2021/8/25
 * @Description
 */
@Service("methodService")
public class MethodServiceImpl implements MethodService {

    @Resource
    private ManyMethodHandlerFactory manyMethodHandlerFactory;

    @Override
    public void handleMethod(TestMethod testMethod) {
        ManyMethodHandler handler = manyMethodHandlerFactory.getInstance(testMethod.getMethod());

        if (handler == null) {
            System.out.println("error");
            return;
        }

        handler.handleMethod(testMethod);
    }
}
