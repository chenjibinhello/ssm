package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpOrderSaleForecasts;

public interface ErpOrderSaleForecastsDao {
    int deleteByPrimaryKey(Integer saleForecastId);

    int insert(ErpOrderSaleForecasts record);

    int insertSelective(ErpOrderSaleForecasts record);

    ErpOrderSaleForecasts selectByPrimaryKey(Integer saleForecastId);

    int updateByPrimaryKeySelective(ErpOrderSaleForecasts record);

    int updateByPrimaryKey(ErpOrderSaleForecasts record);
}