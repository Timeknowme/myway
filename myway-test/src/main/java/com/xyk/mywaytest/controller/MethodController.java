package com.xyk.mywaytest.controller;

import com.xyk.mywaycommon.model.Reply;
import com.xyk.mywaytest.model.TestMethod;
import com.xyk.mywaytest.service.MethodService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xyk
 * @ClassName MethodController
 * @CreateDate 2021/8/25
 * @Description
 */
@RestController
@RequestMapping("/test")
public class MethodController {

    @Resource
    private MethodService methodService;

    @PostMapping(value = "/handle-method")
    public Reply handleMethod(@RequestBody TestMethod testMethod) {
        methodService.handleMethod(testMethod);
        return Reply.ok();
    }
}
