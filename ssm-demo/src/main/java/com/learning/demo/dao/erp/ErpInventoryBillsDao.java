package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpInventoryBills;

public interface ErpInventoryBillsDao {
    int deleteByPrimaryKey(Integer billId);

    int insert(ErpInventoryBills record);

    int insertSelective(ErpInventoryBills record);

    ErpInventoryBills selectByPrimaryKey(Integer billId);

    int updateByPrimaryKeySelective(ErpInventoryBills record);

    int updateByPrimaryKey(ErpInventoryBills record);
}