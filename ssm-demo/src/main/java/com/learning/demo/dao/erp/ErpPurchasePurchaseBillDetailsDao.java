package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpPurchasePurchaseBillDetails;

public interface ErpPurchasePurchaseBillDetailsDao {
    int deleteByPrimaryKey(Integer purchaseBillDetailId);

    int insert(ErpPurchasePurchaseBillDetails record);

    int insertSelective(ErpPurchasePurchaseBillDetails record);

    ErpPurchasePurchaseBillDetails selectByPrimaryKey(Integer purchaseBillDetailId);

    int updateByPrimaryKeySelective(ErpPurchasePurchaseBillDetails record);

    int updateByPrimaryKey(ErpPurchasePurchaseBillDetails record);
}