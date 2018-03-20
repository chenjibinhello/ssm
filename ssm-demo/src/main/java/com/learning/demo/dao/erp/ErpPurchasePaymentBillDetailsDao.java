package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpPurchasePaymentBillDetails;

public interface ErpPurchasePaymentBillDetailsDao {
    int deleteByPrimaryKey(Integer paymentBillDetailId);

    int insert(ErpPurchasePaymentBillDetails record);

    int insertSelective(ErpPurchasePaymentBillDetails record);

    ErpPurchasePaymentBillDetails selectByPrimaryKey(Integer paymentBillDetailId);

    int updateByPrimaryKeySelective(ErpPurchasePaymentBillDetails record);

    int updateByPrimaryKey(ErpPurchasePaymentBillDetails record);
}