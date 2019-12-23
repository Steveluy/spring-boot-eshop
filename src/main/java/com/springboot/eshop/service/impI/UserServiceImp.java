package com.springboot.eshop.service.impI;

import com.github.pagehelper.PageHelper;
import com.springboot.eshop.entity.Users;
import com.springboot.eshop.mapper.UsersMapper;
import com.springboot.eshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "UserService")
public class UserServiceImp implements UserService {
    @Autowired
    private UserService userService;
    @Override
    public List<Users> findAllUser(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        return UsersMapper.selectAllUser();
    }
}
