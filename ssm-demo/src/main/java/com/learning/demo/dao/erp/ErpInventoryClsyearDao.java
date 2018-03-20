package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpInventoryClsyear;

public interface ErpInventoryClsyearDao {
    int deleteByPrimaryKey(Integer clsyearId);

    int insert(ErpInventoryClsyear record);

    int insertSelective(ErpInventoryClsyear record);

    ErpInventoryClsyear selectByPrimaryKey(Integer clsyearId);

    int updateByPrimaryKeySelective(ErpInventoryClsyear record);

    int updateByPrimaryKey(ErpInventoryClsyear record);
}