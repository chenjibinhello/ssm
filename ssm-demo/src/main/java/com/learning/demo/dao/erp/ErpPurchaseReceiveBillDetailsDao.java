package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpPurchaseReceiveBillDetails;

public interface ErpPurchaseReceiveBillDetailsDao {
    int deleteByPrimaryKey(Integer receiveBillDetailId);

    int insert(ErpPurchaseReceiveBillDetails record);

    int insertSelective(ErpPurchaseReceiveBillDetails record);

    ErpPurchaseReceiveBillDetails selectByPrimaryKey(Integer receiveBillDetailId);

    int updateByPrimaryKeySelective(ErpPurchaseReceiveBillDetails record);

    int updateByPrimaryKey(ErpPurchaseReceiveBillDetails record);
}