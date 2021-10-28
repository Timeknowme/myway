package com.xyk.mywaytest.handler;


import com.xyk.mywaytest.model.TestMethod;

/**
 * @author xyk
 * @ClassName ManyMethodHandler
 * @CreateDate 2021/8/25
 * @Description
 */
public interface ManyMethodHandler {

    String getMethod();

    void handleMethod(TestMethod testMethod);
}
