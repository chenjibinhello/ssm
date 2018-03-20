package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpPurchaseReturnBillDetails;

public interface ErpPurchaseReturnBillDetailsDao {
    int deleteByPrimaryKey(Integer returnBillDetailId);

    int insert(ErpPurchaseReturnBillDetails record);

    int insertSelective(ErpPurchaseReturnBillDetails record);

    ErpPurchaseReturnBillDetails selectByPrimaryKey(Integer returnBillDetailId);

    int updateByPrimaryKeySelective(ErpPurchaseReturnBillDetails record);

    int updateByPrimaryKey(ErpPurchaseReturnBillDetails record);
}