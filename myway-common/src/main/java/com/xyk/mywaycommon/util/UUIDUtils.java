package com.xyk.mywaycommon.util;

import java.util.UUID;

/**
 * @author xyk
 * @ClassName UUIDUtils
 * @CreateDate 2021/10/28
 * @Description
 */
public class UUIDUtils {

    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-", "");
    }

}
