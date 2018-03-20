package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpWarehouses;

public interface ErpWarehousesDao {
    int deleteByPrimaryKey(Integer warehouseId);

    int insert(ErpWarehouses record);

    int insertSelective(ErpWarehouses record);

    ErpWarehouses selectByPrimaryKey(Integer warehouseId);

    int updateByPrimaryKeySelective(ErpWarehouses record);

    int updateByPrimaryKey(ErpWarehouses record);
}