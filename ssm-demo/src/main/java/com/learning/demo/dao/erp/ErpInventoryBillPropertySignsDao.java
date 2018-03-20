package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpInventoryBillPropertySigns;

public interface ErpInventoryBillPropertySignsDao {
    int deleteByPrimaryKey(Integer signId);

    int insert(ErpInventoryBillPropertySigns record);

    int insertSelective(ErpInventoryBillPropertySigns record);

    ErpInventoryBillPropertySigns selectByPrimaryKey(Integer signId);

    int updateByPrimaryKeySelective(ErpInventoryBillPropertySigns record);

    int updateByPrimaryKey(ErpInventoryBillPropertySigns record);
}