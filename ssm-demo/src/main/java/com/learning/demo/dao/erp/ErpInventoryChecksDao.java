package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpInventoryChecks;

public interface ErpInventoryChecksDao {
    int deleteByPrimaryKey(Integer checkId);

    int insert(ErpInventoryChecks record);

    int insertSelective(ErpInventoryChecks record);

    ErpInventoryChecks selectByPrimaryKey(Integer checkId);

    int updateByPrimaryKeySelective(ErpInventoryChecks record);

    int updateByPrimaryKey(ErpInventoryChecks record);
}