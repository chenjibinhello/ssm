package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpOrderReturnBills;

public interface ErpOrderReturnBillsDao {
    int deleteByPrimaryKey(Integer returnBillId);

    int insert(ErpOrderReturnBills record);

    int insertSelective(ErpOrderReturnBills record);

    ErpOrderReturnBills selectByPrimaryKey(Integer returnBillId);

    int updateByPrimaryKeySelective(ErpOrderReturnBills record);

    int updateByPrimaryKey(ErpOrderReturnBills record);
}