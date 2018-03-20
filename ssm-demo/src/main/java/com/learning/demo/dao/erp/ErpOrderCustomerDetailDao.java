package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpOrderCustomerDetail;

public interface ErpOrderCustomerDetailDao {
    int deleteByPrimaryKey(Integer customerId);

    int insert(ErpOrderCustomerDetail record);

    int insertSelective(ErpOrderCustomerDetail record);

    ErpOrderCustomerDetail selectByPrimaryKey(Integer customerId);

    int updateByPrimaryKeySelective(ErpOrderCustomerDetail record);

    int updateByPrimaryKey(ErpOrderCustomerDetail record);
}