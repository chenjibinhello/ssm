package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpPurchasePurchaseBills;

public interface ErpPurchasePurchaseBillsDao {
    int deleteByPrimaryKey(Integer purchaseBillId);

    int insert(ErpPurchasePurchaseBills record);

    int insertSelective(ErpPurchasePurchaseBills record);

    ErpPurchasePurchaseBills selectByPrimaryKey(Integer purchaseBillId);

    int updateByPrimaryKeySelective(ErpPurchasePurchaseBills record);

    int updateByPrimaryKey(ErpPurchasePurchaseBills record);
}