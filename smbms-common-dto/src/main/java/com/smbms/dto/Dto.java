package com.smbms.dto;

import java.io.Serializable;

/**
 * @ClassName Dto.java
 * @description TODO 数据传输对象（后端输出对象）
 * @Author 北方張
 * @create 2019-07-28 23:27
 */
public class Dto<T> implements Serializable {
    /**
     * 判断系统是否出错做出相应的true或false的返回，与业务无关，出现的各种异常
     */
    private String success;

    /**
     * 该错误码为自定义，一般0表示无错
     */
    private String errorCode;

    /**
     * 对应的提示信息
     */
    private String msg;

    /**
     * 具体返回数据内容（pojo、自定义VO、其他）
     */
    private T data;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Dto{" +
                "success='" + success + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
