package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpPurchaseMaterialReviseBills;

public interface ErpPurchaseMaterialReviseBillsDao {
    int deleteByPrimaryKey(Integer materialReviseBillId);

    int insert(ErpPurchaseMaterialReviseBills record);

    int insertSelective(ErpPurchaseMaterialReviseBills record);

    ErpPurchaseMaterialReviseBills selectByPrimaryKey(Integer materialReviseBillId);

    int updateByPrimaryKeySelective(ErpPurchaseMaterialReviseBills record);

    int updateByPrimaryKey(ErpPurchaseMaterialReviseBills record);
}