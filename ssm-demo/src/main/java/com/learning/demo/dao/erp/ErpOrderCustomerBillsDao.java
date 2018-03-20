package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpOrderCustomerBills;

public interface ErpOrderCustomerBillsDao {
    int deleteByPrimaryKey(Integer customerBillId);

    int insert(ErpOrderCustomerBills record);

    int insertSelective(ErpOrderCustomerBills record);

    ErpOrderCustomerBills selectByPrimaryKey(Integer customerBillId);

    int updateByPrimaryKeySelective(ErpOrderCustomerBills record);

    int updateByPrimaryKey(ErpOrderCustomerBills record);
}