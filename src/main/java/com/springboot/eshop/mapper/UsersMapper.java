package com.springboot.eshop.mapper;

import com.springboot.eshop.entity.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UsersMapper {
    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectAllUser();
}