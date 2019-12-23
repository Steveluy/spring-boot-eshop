package com.springboot.eshop.mapper;

import com.springboot.eshop.entity.Users;

import java.util.List;

public interface UsersMapper {
    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectAllUser();
}