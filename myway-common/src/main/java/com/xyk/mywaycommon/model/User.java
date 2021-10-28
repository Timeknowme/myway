package com.xyk.mywaycommon.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author xyk
 * @ClassName User
 * @CreateDate 2021/10/28
 * @Description
 */
@Data
@Builder
public class User {

    private String name;

    private Integer age;

    private String sex;
}
