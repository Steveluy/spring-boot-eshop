package com.springboot.eshop.controller;

import com.springboot.eshop.entity.deliveryaddresses;
import com.springboot.eshop.service.deliveryaddressesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/deliveryaddresses")
public class DeliveryaddressesController {
    @Autowired
    public deliveryaddressesService deliveryaddressesService;

    @RequestMapping(value = "insert", method= RequestMethod.POST)
    public int insert(deliveryaddresses deliveryaddresses)
    {
        return deliveryaddressesService.addAddresses(deliveryaddresses);
    }

    @RequestMapping(value = "/all/{pageNum}/{pageSize}", method= RequestMethod.GET)
    public Object findAllAddress(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        return deliveryaddressesService.findAllAddress(pageNum,pageSize);
    }
}
