package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpPurchaseBillProperties;

public interface ErpPurchaseBillPropertiesDao {
    int deleteByPrimaryKey(Integer propertyId);

    int insert(ErpPurchaseBillProperties record);

    int insertSelective(ErpPurchaseBillProperties record);

    ErpPurchaseBillProperties selectByPrimaryKey(Integer propertyId);

    int updateByPrimaryKeySelective(ErpPurchaseBillProperties record);

    int updateByPrimaryKey(ErpPurchaseBillProperties record);
}