package com.springboot.eshop.controller;

import com.springboot.eshop.config.BaseCodeConfig;
import com.springboot.eshop.entity.deliveryaddresses;
import com.springboot.eshop.service.deliveryaddressesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/DeliveryAddress")
public class DeliveryaddressesController {
    @Autowired
    public deliveryaddressesService deliveryaddressesService;

    @PostMapping(value = "AddDeliveryAddress")
    public BaseCodeConfig insert(@RequestBody @Validated deliveryaddresses data) {
        // 使用SpringValidation校验数据
        return new BaseCodeConfig().success(deliveryaddressesService.addAddresses(data));
    }

    @GetMapping(value = "/GetDeliveryAddress/{pageNum}/{pageSize}")
    public BaseCodeConfig findAllAddress(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize) {
        return new BaseCodeConfig().success(deliveryaddressesService.findAllAddress(pageNum, pageSize));
    }
}