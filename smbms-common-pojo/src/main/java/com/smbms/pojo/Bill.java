package com.smbms.pojo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author 北方張
 * @create 2019-08-07 14:00
 * @description TODO
 * @ClassName Bill.java
 */
@Data
@ToString
public class Bill implements Serializable {
    private Long id;

    private String billCode;

    private String productName;

    private String productDesc;

    private String productUnit;

    private BigDecimal productCount;

    private BigDecimal totalPrice;

    private Integer isPayment;

    private Long createdBy;

    private Date creationDate;

    private Long modifyBy;

    private Date modifyDate;

    private Integer providerId;
}
