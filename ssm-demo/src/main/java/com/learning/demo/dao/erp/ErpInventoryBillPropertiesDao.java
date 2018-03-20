package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpInventoryBillProperties;

public interface ErpInventoryBillPropertiesDao {
    int deleteByPrimaryKey(Integer propertyId);

    int insert(ErpInventoryBillProperties record);

    int insertSelective(ErpInventoryBillProperties record);

    ErpInventoryBillProperties selectByPrimaryKey(Integer propertyId);

    int updateByPrimaryKeySelective(ErpInventoryBillProperties record);

    int updateByPrimaryKey(ErpInventoryBillProperties record);
}