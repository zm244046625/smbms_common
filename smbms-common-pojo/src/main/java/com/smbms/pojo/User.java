package com.smbms.pojo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author 北方張
 * @create 2019-08-02 16:13
 * @description TODO 用户实体类
 * @ClassName User.java
 */
@Data
@ToString
public class User implements Serializable {
    private Long id;

    private String userCode;

    private String userName;

    private String userPassword;

    private Integer gender;

    private Date birthday;

    private String phone;

    private String address;

    private Integer userRole;

    private Long createdBy;

    private Date creationDate;

    private Long modifyBy;

    private Date modifyDate;

}
