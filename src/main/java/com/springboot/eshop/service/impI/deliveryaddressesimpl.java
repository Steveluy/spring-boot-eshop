package com.springboot.eshop.service.impI;

import com.github.pagehelper.PageHelper;
import com.springboot.eshop.entity.deliveryaddresses;
import com.springboot.eshop.mapper.deliveryaddressesMapper;
import com.springboot.eshop.service.deliveryaddressesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class deliveryaddressesimpl implements deliveryaddressesService {
    @Autowired
    public deliveryaddressesMapper deliveryaddressesMapper;

    @Override
    public int addAddresses(deliveryaddresses entity) {
        return deliveryaddressesMapper.insert(entity);
    }

    @Override
    public List<deliveryaddresses> findAllAddress(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return deliveryaddressesMapper.findAllAddress();
    }
}
