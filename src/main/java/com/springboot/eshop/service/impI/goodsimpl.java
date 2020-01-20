package com.springboot.eshop.service.impI;

import com.github.pagehelper.PageHelper;
import com.springboot.eshop.entity.goods;
import com.springboot.eshop.mapper.deliveryaddressesMapper;
import com.springboot.eshop.mapper.goodsMapper;
import com.springboot.eshop.service.goodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class goodsimpl implements goodsService {
    @Autowired
    public goodsMapper goodsMapper;
    @Override
    public List<goods> findAllGoods(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return goodsMapper.findAllGoods();
    }
}
