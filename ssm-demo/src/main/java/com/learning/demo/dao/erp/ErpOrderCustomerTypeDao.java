package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpOrderCustomerType;

public interface ErpOrderCustomerTypeDao {
    int deleteByPrimaryKey(Integer customerTypeId);

    int insert(ErpOrderCustomerType record);

    int insertSelective(ErpOrderCustomerType record);

    ErpOrderCustomerType selectByPrimaryKey(Integer customerTypeId);

    int updateByPrimaryKeySelective(ErpOrderCustomerType record);

    int updateByPrimaryKey(ErpOrderCustomerType record);
}