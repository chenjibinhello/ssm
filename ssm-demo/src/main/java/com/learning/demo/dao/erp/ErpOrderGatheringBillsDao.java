package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpOrderGatheringBills;

public interface ErpOrderGatheringBillsDao {
    int deleteByPrimaryKey(Integer gatheringBillId);

    int insert(ErpOrderGatheringBills record);

    int insertSelective(ErpOrderGatheringBills record);

    ErpOrderGatheringBills selectByPrimaryKey(Integer gatheringBillId);

    int updateByPrimaryKeySelective(ErpOrderGatheringBills record);

    int updateByPrimaryKey(ErpOrderGatheringBills record);
}