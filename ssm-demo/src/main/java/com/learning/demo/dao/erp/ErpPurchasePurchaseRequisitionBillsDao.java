package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpPurchasePurchaseRequisitionBills;

public interface ErpPurchasePurchaseRequisitionBillsDao {
    int deleteByPrimaryKey(Integer purchaseRequisitionBillId);

    int insert(ErpPurchasePurchaseRequisitionBills record);

    int insertSelective(ErpPurchasePurchaseRequisitionBills record);

    ErpPurchasePurchaseRequisitionBills selectByPrimaryKey(Integer purchaseRequisitionBillId);

    int updateByPrimaryKeySelective(ErpPurchasePurchaseRequisitionBills record);

    int updateByPrimaryKey(ErpPurchasePurchaseRequisitionBills record);
}