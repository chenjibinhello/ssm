package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpInventoryBatches;

public interface ErpInventoryBatchesDao {
    int deleteByPrimaryKey(Integer batchId);

    int insert(ErpInventoryBatches record);

    int insertSelective(ErpInventoryBatches record);

    ErpInventoryBatches selectByPrimaryKey(Integer batchId);

    int updateByPrimaryKeySelective(ErpInventoryBatches record);

    int updateByPrimaryKey(ErpInventoryBatches record);
}