package com.springboot.eshop.mapper;

import com.springboot.eshop.entity.deliveryaddresses;

import java.util.List;

public interface deliveryaddressesMapper {
    int insert(deliveryaddresses record);

    int insertSelective(deliveryaddresses record);

    List<deliveryaddresses> findAllAddress();
}