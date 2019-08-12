package com.smbms.service;

import com.smbms.pojo.User;
import java.util.List;

/**
 * @Author 北方張
 * @create 2019-08-05 00:05
 * @description TODO
 * @ClassName RpcUserService.java
 */
public interface RpcUserService {
    /**
     * 获取所有用户rpc调用接口
     * @return
     */
    List<User> rpcFindAllUsers();

    /**
     * 根据id返回用户数据
     * @param id
     * @return
     */
    User rpcFindAllUserVOByUserId(Long id);
}
