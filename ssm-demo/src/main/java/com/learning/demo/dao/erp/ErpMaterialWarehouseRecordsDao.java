package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpMaterialWarehouseRecords;

public interface ErpMaterialWarehouseRecordsDao {
    int deleteByPrimaryKey(Integer recordId);

    int insert(ErpMaterialWarehouseRecords record);

    int insertSelective(ErpMaterialWarehouseRecords record);

    ErpMaterialWarehouseRecords selectByPrimaryKey(Integer recordId);

    int updateByPrimaryKeySelective(ErpMaterialWarehouseRecords record);

    int updateByPrimaryKey(ErpMaterialWarehouseRecords record);
}