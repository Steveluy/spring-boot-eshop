package com.springboot.eshop.controller;

import com.springboot.eshop.entity.usersInfo;
import com.springboot.eshop.service.usersInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/user")
public class UserController {
    @Autowired
    private usersInfoService usersInfo;

    @RequestMapping(value = "/insert", method= RequestMethod.POST)
    public int insert(usersInfo users){
        return usersInfo.addUser(users);
    }

    @RequestMapping(value = "/all/{pageNum}/{pageSize}", method= RequestMethod.GET)
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        return usersInfo.selectAllUser(pageNum,pageSize);
    }

    @RequestMapping(value="/delete",method = RequestMethod.POST)
    public int delete(int id) {
        return usersInfo.deleteUser(id);
    }
}
