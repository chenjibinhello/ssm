package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpInventoryChangeLogAdjustments;

public interface ErpInventoryChangeLogAdjustmentsDao {
    int deleteByPrimaryKey(Integer adjustmentId);

    int insert(ErpInventoryChangeLogAdjustments record);

    int insertSelective(ErpInventoryChangeLogAdjustments record);

    ErpInventoryChangeLogAdjustments selectByPrimaryKey(Integer adjustmentId);

    int updateByPrimaryKeySelective(ErpInventoryChangeLogAdjustments record);

    int updateByPrimaryKey(ErpInventoryChangeLogAdjustments record);
}