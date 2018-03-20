package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpOrderBillProperties;

public interface ErpOrderBillPropertiesDao {
    int deleteByPrimaryKey(Integer propertyId);

    int insert(ErpOrderBillProperties record);

    int insertSelective(ErpOrderBillProperties record);

    ErpOrderBillProperties selectByPrimaryKey(Integer propertyId);

    int updateByPrimaryKeySelective(ErpOrderBillProperties record);

    int updateByPrimaryKey(ErpOrderBillProperties record);
}