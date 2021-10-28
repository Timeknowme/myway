package com.xyk.mywaycommon.constant;

/**
 * @author xyk
 * @ClassName PaasConstant
 * @CreateDate 2021/7/21
 * @Description
 */
public class PaasConstant {

    /**
     * 返回成功标识
     */
    public static final Integer RES_SUCCESS = 0;

    /**
     * 成功文字标识
     */
    public static final String RES_SUCCESS_MSG = "success";

    /**
     * 返回错误标识
     */
    public static final Integer RES_ERROR = 99998;

    /**
     * 返回异常标识
     */
    public static final Integer EXCEPTION_ERROR = 99999;


    public static final Integer DATE_FORMAT_ERROR_CODE = 90000;
    public static final String DATE_FORMAT_ERROR_NAME = "日期格式错误";

    /**
     * 用户认证日志
     */
    public static final String AUTH_LOG = "AUTH_LOG";
    /**
     * 操作日志
     */
    public static final String OP_LOG = "OP_LOG";
    /**
     * 事件日志
     */
    public static final String EVENT_LOG = "EVENT_LOG";
    /**
     * 系统日志
     */
    public static final String SYSTEM_LOG = "SYSTEM_LOG";

    /**
     * 头信息用户标识
     */
    public static final String HEADER_USER_INFO = "HEADER_USER_INFO";

    /**
     * 默认排序
     */
    public static final String DEFAULT_ORDER_BY = "create_time desc";


    /**
     * 默认医院编码
     */
    public static final String DEFAULT_HOSP_CODE = "00000000";

    /**
     * 默认密码
     */
    public static final String DEFAULT_PASSWORD = "123456";
}
