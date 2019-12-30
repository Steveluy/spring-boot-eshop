package com.springboot.eshop.mapper;

import com.springboot.eshop.entity.usersInfo;

import java.util.List;

public interface usersInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(usersInfo record);

    int insertSelective(usersInfo record);

    usersInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(usersInfo record);

    int updateByPrimaryKey(usersInfo record);

    List<usersInfo> selectAllUser();
}