package com.springboot.eshop.service;

import com.springboot.eshop.entity.Users;

import java.util.List;

public interface UserService {
    int insert(Users record);

    List<Users> findAllUser(int pageNum, int pageSize);
}
