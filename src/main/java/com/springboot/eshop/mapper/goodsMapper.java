package com.springboot.eshop.mapper;

import com.springboot.eshop.entity.goods;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface goodsMapper {

    int deleteByPrimaryKey(String id);

    int insert(goods record);

    int insertSelective(goods record);

    goods selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(goods record);

    int updateByPrimaryKey(goods record);

    List<goods> findAllGoods();
}