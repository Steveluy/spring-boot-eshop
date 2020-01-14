package com.springboot.eshop.service;

import com.springboot.eshop.entity.usersInfo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface usersInfoService  {
    public int addUser(usersInfo user);

    List<usersInfo> selectAllUser(int pageNum, int pageSize);

    public int deleteUser(int id);
}
