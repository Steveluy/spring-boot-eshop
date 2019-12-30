package com.springboot.eshop.service.impI;

import com.github.pagehelper.PageHelper;
import com.springboot.eshop.entity.usersInfo;
import com.springboot.eshop.mapper.usersInfoMapper;
import com.springboot.eshop.service.usersInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "usersInfoService")
public class usersInfoimpI implements usersInfoService {
    @Autowired
    private usersInfoMapper usersInfoMapper;

    @Override
    public List<usersInfo> selectAllUser(int pageNum, int pageSize)
    {
        PageHelper.startPage(pageNum, pageSize);
        return usersInfoMapper.selectAllUser();
    }
}
