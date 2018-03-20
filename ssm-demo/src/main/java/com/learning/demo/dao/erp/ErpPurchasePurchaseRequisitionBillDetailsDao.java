package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpPurchasePurchaseRequisitionBillDetails;

public interface ErpPurchasePurchaseRequisitionBillDetailsDao {
    int deleteByPrimaryKey(Integer purchaseRequisitionBillDetailId);

    int insert(ErpPurchasePurchaseRequisitionBillDetails record);

    int insertSelective(ErpPurchasePurchaseRequisitionBillDetails record);

    ErpPurchasePurchaseRequisitionBillDetails selectByPrimaryKey(Integer purchaseRequisitionBillDetailId);

    int updateByPrimaryKeySelective(ErpPurchasePurchaseRequisitionBillDetails record);

    int updateByPrimaryKey(ErpPurchasePurchaseRequisitionBillDetails record);
}