package com.xyk.mywaytest.handler;

import com.xyk.mywaytest.model.TestMethod;
import org.springframework.stereotype.Component;

/**
 * @author xyk
 * @ClassName PreviewHandler
 * @CreateDate 2021/8/25
 * @Description
 */
@Component
public class PreviewHandler implements ManyMethodHandler {
    @Override
    public String getMethod() {
        return "preview";
    }

    @Override
    public void handleMethod(TestMethod testMethod) {
        System.out.println("now preview:" + testMethod.getName());
    }
}
