package com.smbms.util;

import com.smbms.dto.Dto;

/**
 * @ClassName DtoUtil.java
 * @Author 北方張
 * @create 2019-07-28 23:27
 */
public class DtoUtil {
    public static String success="true";

    public static String fail="false";

    public static String errorCode="0000";

    /**
     * 统一返回成功的Dto
     * @return
     */
    public static Dto returnSuccess(){
        Dto dto = new Dto();
        dto.setSuccess(success);
        return dto;
    }

    /**
     * 统一返回成功的Dto 带数据
     * @param message
     * @param data
     * @return
     */
    public static Dto returnSuccess(String message,Object data){
        Dto dto=new Dto();
        dto.setSuccess(success);
        dto.setMsg(message);
        dto.setErrorCode(errorCode);
        dto.setData(data);
        return  dto;
    }

    /**
     * 统一返回成功的DTO 不带数据
     * @param message
     * @return
     */
    public static Dto returnSuccess(String message){
        Dto dto=new Dto();
        dto.setSuccess(success);
        dto.setMsg(message);
        dto.setErrorCode(errorCode);
        return  dto;
    }

    /**
     * 统一返回成功的DTO 带数据 没有消息
     * @param data
     * @return
     */
    public static Dto returnDataSuccess(Object data){
        Dto dto=new Dto();
        dto.setSuccess(success);
        dto.setErrorCode(errorCode);
        dto.setData(data);
        return  dto;
    }

    public static Dto returnFail(String message,String errorCode){
        Dto dto=new Dto();
        dto.setSuccess(fail);
        dto.setMsg(message);
        dto.setErrorCode(errorCode);
        return  dto;
    }
}
