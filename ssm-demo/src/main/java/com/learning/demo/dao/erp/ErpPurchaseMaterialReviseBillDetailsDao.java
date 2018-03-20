package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpPurchaseMaterialReviseBillDetails;

public interface ErpPurchaseMaterialReviseBillDetailsDao {
    int deleteByPrimaryKey(Integer materialReviseBillDetailId);

    int insert(ErpPurchaseMaterialReviseBillDetails record);

    int insertSelective(ErpPurchaseMaterialReviseBillDetails record);

    ErpPurchaseMaterialReviseBillDetails selectByPrimaryKey(Integer materialReviseBillDetailId);

    int updateByPrimaryKeySelective(ErpPurchaseMaterialReviseBillDetails record);

    int updateByPrimaryKey(ErpPurchaseMaterialReviseBillDetails record);
}