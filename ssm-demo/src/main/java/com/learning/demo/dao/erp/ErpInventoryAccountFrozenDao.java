package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpInventoryAccountFrozen;

public interface ErpInventoryAccountFrozenDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ErpInventoryAccountFrozen record);

    int insertSelective(ErpInventoryAccountFrozen record);

    ErpInventoryAccountFrozen selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ErpInventoryAccountFrozen record);

    int updateByPrimaryKey(ErpInventoryAccountFrozen record);
}