package com.atguigu.gulimall.wms.dao;

import com.atguigu.gulimall.wms.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author leifengyang
 * @email lfy@atguigu.com
 * @date 2019-08-02 19:55:45
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
