package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpPurchaseReturnBills;

public interface ErpPurchaseReturnBillsDao {
    int deleteByPrimaryKey(Integer returnBillId);

    int insert(ErpPurchaseReturnBills record);

    int insertSelective(ErpPurchaseReturnBills record);

    ErpPurchaseReturnBills selectByPrimaryKey(Integer returnBillId);

    int updateByPrimaryKeySelective(ErpPurchaseReturnBills record);

    int updateByPrimaryKey(ErpPurchaseReturnBills record);
}