package com.springboot.eshop.controller;

import com.springboot.eshop.entity.usersInfo;
import com.springboot.eshop.service.usersInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value ="/user")
public class UserController {
    @Autowired
    private usersInfoService usersInfo;

    @ResponseBody
    @RequestMapping(value = "/insert", produces = {"application/json;charset=UTF-8"})
    public int insert(usersInfo users){
        return usersInfo.addUser(users);
    }

    @ResponseBody
    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){

        return usersInfo.selectAllUser(pageNum,pageSize);
    }
}
