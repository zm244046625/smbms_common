package com.smbms.service;

import com.smbms.pojo.Address;

import java.util.List;

/**
 * @Author 北方張
 * @create 2019-08-07 16:22
 * @description TODO
 * @ClassName RpcAddressService.java
 */
public interface RpcAddressService {
    /**
     * 调用rpc接口获取所有订单
     * @return
     */
    List<Address> rpcFindAllAddresses();

    /**
     * 根据id获取地址信息
     * @param id
     * @return
     */
    Address fingAddressById(int id);
}
