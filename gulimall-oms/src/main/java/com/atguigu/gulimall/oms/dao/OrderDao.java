package com.atguigu.gulimall.oms.dao;

import com.atguigu.gulimall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author leifengyang
 * @email lfy@atguigu.com
 * @date 2019-08-02 16:20:54
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
