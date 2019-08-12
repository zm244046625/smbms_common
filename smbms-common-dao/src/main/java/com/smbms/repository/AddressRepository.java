package com.smbms.repository;

import com.smbms.pojo.Address;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author 北方張
 * @create 2019-08-07 16:18
 * @description TODO
 * @ClassName AddressRepository.java
 */
public interface AddressRepository {

    /**
     * 查询所有地址
     * @return
     */
    @Select("select * from smbms_address")
    List<Address> findAllAddresses();

    /**
     * 通过id查询地址
     * @param id
     * @return
     */
    @Select("select * from smbms_address where id=#{id}")
    Address findAddressById(@Param("id") int id);
}
