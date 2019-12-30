package com.springboot.eshop.service;

import com.springboot.eshop.entity.usersInfo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface usersInfoService  {
    List<usersInfo> selectAllUser(int pageNum, int pageSize);
}
