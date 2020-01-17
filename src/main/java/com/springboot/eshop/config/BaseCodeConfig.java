package com.springboot.eshop.config;

import lombok.Getter;

@Getter
public class BaseCodeConfig {
    private int code;
    private String message;
    private Object data;

    private BaseCodeConfig setResult(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
        return this;
    }

    public BaseCodeConfig success() {
        return setResult(200, "Success", null);
    }

    public BaseCodeConfig success(Object data) {
        return setResult(200, "Success", data);
    }

    public BaseCodeConfig fail(Object data, String message) {
        return setResult(400, message, data);
    }

    public BaseCodeConfig fail(Object data, String message, int code) {
        return setResult(code, message, data);
    }

    public BaseCodeConfig fail(String message, int code) {
        return setResult(code, message, null);
    }
}
