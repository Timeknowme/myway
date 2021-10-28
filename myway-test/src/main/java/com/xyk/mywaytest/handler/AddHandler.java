package com.xyk.mywaytest.handler;

import com.xyk.longwaytest.model.TestMethod;
import org.springframework.stereotype.Component;

/**
 * @author xyk
 * @ClassName AddHandler
 * @CreateDate 2021/8/25
 * @Description
 */
@Component
public class AddHandler implements ManyMethodHandler {
    @Override
    public String getMethod() {
        return "add";
    }

    @Override
    public void handleMethod(TestMethod testMethod) {
        System.out.println("now add:" + testMethod.getName());
    }
}
