package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpPurchaseReviseBills;

public interface ErpPurchaseReviseBillsDao {
    int deleteByPrimaryKey(Integer reviseBillId);

    int insert(ErpPurchaseReviseBills record);

    int insertSelective(ErpPurchaseReviseBills record);

    ErpPurchaseReviseBills selectByPrimaryKey(Integer reviseBillId);

    int updateByPrimaryKeySelective(ErpPurchaseReviseBills record);

    int updateByPrimaryKey(ErpPurchaseReviseBills record);
}