package com.smbms.service;

import com.smbms.pojo.Bill;

import java.util.List;

/**
 * @Author 北方張
 * @create 2019-08-07 14:03
 * @description TODO
 * @ClassName RpcBillService.java
 */
public interface RpcBillService {
    /**
     * 获取所有订单rpc调用接口
     * @return
     */
    List<Bill> findAllBills();

    /**
     * 根据id获取订单数据
     * @param id
     * @return
     */
    Bill findBillById(int id);
}
