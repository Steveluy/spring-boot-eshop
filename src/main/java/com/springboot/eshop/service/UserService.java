package com.springboot.eshop.service;

import com.springboot.eshop.entity.Users;

import java.util.List;

public interface UserService {
    List<Users> findAllUser(int pageNum, int pageSize);
}
