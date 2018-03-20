package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpPurchasePaymentBills;

public interface ErpPurchasePaymentBillsDao {
    int deleteByPrimaryKey(Integer paymentBillId);

    int insert(ErpPurchasePaymentBills record);

    int insertSelective(ErpPurchasePaymentBills record);

    ErpPurchasePaymentBills selectByPrimaryKey(Integer paymentBillId);

    int updateByPrimaryKeySelective(ErpPurchasePaymentBills record);

    int updateByPrimaryKey(ErpPurchasePaymentBills record);
}