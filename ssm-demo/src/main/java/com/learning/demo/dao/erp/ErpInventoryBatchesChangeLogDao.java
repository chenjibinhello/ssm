package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpInventoryBatchesChangeLog;

public interface ErpInventoryBatchesChangeLogDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ErpInventoryBatchesChangeLog record);

    int insertSelective(ErpInventoryBatchesChangeLog record);

    ErpInventoryBatchesChangeLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ErpInventoryBatchesChangeLog record);

    int updateByPrimaryKey(ErpInventoryBatchesChangeLog record);
}