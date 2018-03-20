package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpMaterialBatchStocks;

public interface ErpMaterialBatchStocksDao {
    int deleteByPrimaryKey(Integer stockId);

    int insert(ErpMaterialBatchStocks record);

    int insertSelective(ErpMaterialBatchStocks record);

    ErpMaterialBatchStocks selectByPrimaryKey(Integer stockId);

    int updateByPrimaryKeySelective(ErpMaterialBatchStocks record);

    int updateByPrimaryKey(ErpMaterialBatchStocks record);
}