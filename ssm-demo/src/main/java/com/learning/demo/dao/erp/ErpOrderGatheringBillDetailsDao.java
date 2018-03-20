package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpOrderGatheringBillDetails;

public interface ErpOrderGatheringBillDetailsDao {
    int deleteByPrimaryKey(Integer gatheringBillDetailId);

    int insert(ErpOrderGatheringBillDetails record);

    int insertSelective(ErpOrderGatheringBillDetails record);

    ErpOrderGatheringBillDetails selectByPrimaryKey(Integer gatheringBillDetailId);

    int updateByPrimaryKeySelective(ErpOrderGatheringBillDetails record);

    int updateByPrimaryKey(ErpOrderGatheringBillDetails record);
}