package com.springboot.eshop.service.impI;

import com.github.pagehelper.PageHelper;
import com.springboot.eshop.entity.Users;
import com.springboot.eshop.mapper.UsersMapper;
import com.springboot.eshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImp implements UserService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public int insert(Users record) {
        return usersMapper.insert(record);
    }

    @Override
    public List<Users> findAllUser(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        return usersMapper.selectAllUser();
    }
}