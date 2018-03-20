package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpPurchaseCheckbackBills;

public interface ErpPurchaseCheckbackBillsDao {
    int deleteByPrimaryKey(Integer checkbackBillId);

    int insert(ErpPurchaseCheckbackBills record);

    int insertSelective(ErpPurchaseCheckbackBills record);

    ErpPurchaseCheckbackBills selectByPrimaryKey(Integer checkbackBillId);

    int updateByPrimaryKeySelective(ErpPurchaseCheckbackBills record);

    int updateByPrimaryKey(ErpPurchaseCheckbackBills record);
}