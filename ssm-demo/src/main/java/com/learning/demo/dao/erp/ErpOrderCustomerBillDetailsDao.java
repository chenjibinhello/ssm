package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpOrderCustomerBillDetails;

public interface ErpOrderCustomerBillDetailsDao {
    int deleteByPrimaryKey(Integer customerBillDetailId);

    int insert(ErpOrderCustomerBillDetails record);

    int insertSelective(ErpOrderCustomerBillDetails record);

    ErpOrderCustomerBillDetails selectByPrimaryKey(Integer customerBillDetailId);

    int updateByPrimaryKeySelective(ErpOrderCustomerBillDetails record);

    int updateByPrimaryKey(ErpOrderCustomerBillDetails record);
}