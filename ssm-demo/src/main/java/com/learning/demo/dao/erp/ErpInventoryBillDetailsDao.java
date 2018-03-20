package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpInventoryBillDetails;

public interface ErpInventoryBillDetailsDao {
    int deleteByPrimaryKey(Integer billDetailId);

    int insert(ErpInventoryBillDetails record);

    int insertSelective(ErpInventoryBillDetails record);

    ErpInventoryBillDetails selectByPrimaryKey(Integer billDetailId);

    int updateByPrimaryKeySelective(ErpInventoryBillDetails record);

    int updateByPrimaryKey(ErpInventoryBillDetails record);
}