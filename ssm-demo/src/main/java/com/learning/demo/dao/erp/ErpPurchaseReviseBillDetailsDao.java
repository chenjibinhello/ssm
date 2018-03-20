package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpPurchaseReviseBillDetails;

public interface ErpPurchaseReviseBillDetailsDao {
    int deleteByPrimaryKey(Integer reviseBillDetailId);

    int insert(ErpPurchaseReviseBillDetails record);

    int insertSelective(ErpPurchaseReviseBillDetails record);

    ErpPurchaseReviseBillDetails selectByPrimaryKey(Integer reviseBillDetailId);

    int updateByPrimaryKeySelective(ErpPurchaseReviseBillDetails record);

    int updateByPrimaryKey(ErpPurchaseReviseBillDetails record);
}