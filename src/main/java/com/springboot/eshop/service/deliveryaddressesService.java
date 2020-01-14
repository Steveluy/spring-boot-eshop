package com.springboot.eshop.service;

import com.springboot.eshop.controller.DeliveryaddressesController;
import com.springboot.eshop.entity.deliveryaddresses;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface deliveryaddressesService {
    public int addAddresses(deliveryaddresses entity);

    List<deliveryaddresses> findAllAddress(int pageNum, int pageSize);
}