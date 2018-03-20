package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpInventoryChangeLogs;

public interface ErpInventoryChangeLogsDao {
    int deleteByPrimaryKey(Integer logId);

    int insert(ErpInventoryChangeLogs record);

    int insertSelective(ErpInventoryChangeLogs record);

    ErpInventoryChangeLogs selectByPrimaryKey(Integer logId);

    int updateByPrimaryKeySelective(ErpInventoryChangeLogs record);

    int updateByPrimaryKey(ErpInventoryChangeLogs record);
}