package com.irving.knowledge.spring.util.dto;

/**
 * 统一返回值
 */
public class ResponseDto <T>{

    private T data ;

    private String code ;

    private String message ;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResponseDto() {
    }

    public ResponseDto(T data, String code, String message) {
        this.data = data;
        this.code = code;
        this.message = message;
    }



}
