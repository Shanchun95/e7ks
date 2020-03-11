/*
 * Copyright (C) zedao.com. All rights reserved
 */
package com.dashan.exam.common;

import java.io.Serializable;

/**
 * RequestJsonDto
 *
 */
public class RequestJsonDto implements Serializable {
    private static final long serialVersionUID = -1L;

    /**
     * api接口code ：acc-login
     */
    private String code;
    /**
     * 数据内容，JSON
     */
    private String data;
    /**
     * 浏览器信息
     */
//    private String browserType;
    /**
     * 浏览器信息
     */
//    private String browserVersion;
    /**
     * 有效时间戳
     */
//    private Long timeStamp;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
