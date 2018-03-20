package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpPurchaseVoucherBills;

public interface ErpPurchaseVoucherBillsDao {
    int deleteByPrimaryKey(Integer voucherBillId);

    int insert(ErpPurchaseVoucherBills record);

    int insertSelective(ErpPurchaseVoucherBills record);

    ErpPurchaseVoucherBills selectByPrimaryKey(Integer voucherBillId);

    int updateByPrimaryKeySelective(ErpPurchaseVoucherBills record);

    int updateByPrimaryKey(ErpPurchaseVoucherBills record);
}