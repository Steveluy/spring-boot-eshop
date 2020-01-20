package com.springboot.eshop.controller;

import com.springboot.eshop.config.BaseCodeConfig;
import com.springboot.eshop.service.deliveryaddressesService;
import com.springboot.eshop.service.goodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Goods")
public class GoodsController {
    @Autowired
    public goodsService goodsService;

    @GetMapping(value = "/GetGoodsList/{pageNum}/{pageSize}")
    public BaseCodeConfig findAllGoods(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize) {
        return new BaseCodeConfig().success(goodsService.findAllGoods(pageNum, pageSize));
    }
}
