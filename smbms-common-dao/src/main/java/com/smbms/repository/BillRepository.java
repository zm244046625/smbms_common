package com.smbms.repository;

import com.smbms.pojo.Bill;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * @Author 北方張
 * @create 2019-08-07 13:56
 * @description TODO
 * @ClassName BillRepository.java
 */
@Mapper
public interface BillRepository {

    /**
     * 查询所有订单
     *
     * @return
     */
    @Select("select * from smbms_bill")
    List<Bill> findAllBills();

    /**
     * 通过订单id查询订单
     * @param id 订单id
     * @return
     */
    @Select("select * from smbms_bill where id=#{id}")
    Bill findBillById(@Param("id") int id);

}
