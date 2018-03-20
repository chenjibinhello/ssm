package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpOrderReturnBillDetails;

public interface ErpOrderReturnBillDetailsDao {
    int deleteByPrimaryKey(Integer returnBillDetailId);

    int insert(ErpOrderReturnBillDetails record);

    int insertSelective(ErpOrderReturnBillDetails record);

    ErpOrderReturnBillDetails selectByPrimaryKey(Integer returnBillDetailId);

    int updateByPrimaryKeySelective(ErpOrderReturnBillDetails record);

    int updateByPrimaryKey(ErpOrderReturnBillDetails record);
}