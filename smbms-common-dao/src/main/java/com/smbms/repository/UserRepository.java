package com.smbms.repository;

import com.smbms.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author 北方張
 * @create 2019-08-02 16:20
 * @description TODO
 * @ClassName UserRepository.java
 */
@Mapper
public interface UserRepository {
    /**
     * 查询所有用户
     *
     * @return
     */
    @Select(value = "select * from smbms_user")
    List<User> findAllUsers();

    /**
     * 根据用户id查询用户
     * @param id
     * @return
     */
    @Select(value = "select * from smbms_user where id=#{id}")
    User findUserByUserId(@Param("id") Long id);

}
