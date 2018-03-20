package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpPurchaseReceiveBills;

public interface ErpPurchaseReceiveBillsDao {
    int deleteByPrimaryKey(Integer receiveBillId);

    int insert(ErpPurchaseReceiveBills record);

    int insertSelective(ErpPurchaseReceiveBills record);

    ErpPurchaseReceiveBills selectByPrimaryKey(Integer receiveBillId);

    int updateByPrimaryKeySelective(ErpPurchaseReceiveBills record);

    int updateByPrimaryKey(ErpPurchaseReceiveBills record);
}