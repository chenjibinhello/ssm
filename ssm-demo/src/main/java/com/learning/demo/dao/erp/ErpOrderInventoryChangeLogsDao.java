package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpOrderInventoryChangeLogs;

public interface ErpOrderInventoryChangeLogsDao {
    int deleteByPrimaryKey(Integer logId);

    int insert(ErpOrderInventoryChangeLogs record);

    int insertSelective(ErpOrderInventoryChangeLogs record);

    ErpOrderInventoryChangeLogs selectByPrimaryKey(Integer logId);

    int updateByPrimaryKeySelective(ErpOrderInventoryChangeLogs record);

    int updateByPrimaryKey(ErpOrderInventoryChangeLogs record);
}