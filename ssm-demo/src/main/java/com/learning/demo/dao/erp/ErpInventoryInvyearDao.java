package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpInventoryInvyear;

public interface ErpInventoryInvyearDao {
    int deleteByPrimaryKey(Integer invyearId);

    int insert(ErpInventoryInvyear record);

    int insertSelective(ErpInventoryInvyear record);

    ErpInventoryInvyear selectByPrimaryKey(Integer invyearId);

    int updateByPrimaryKeySelective(ErpInventoryInvyear record);

    int updateByPrimaryKey(ErpInventoryInvyear record);
}