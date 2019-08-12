package com.smbms.pojo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author 北方張
 * @create 2019-08-07 16:17
 * @description TODO
 * @ClassName Address.java
 */
@Data
@ToString
public class Address implements Serializable {
    private Long id;

    private String contact;

    private String addressDesc;

    private String postCode;

    private String tel;

    private Long createdBy;

    private Date creationDate;

    private Long modifyBy;

    private Date modifyDate;

    private Long userId;

    public Address() {
    }
}
