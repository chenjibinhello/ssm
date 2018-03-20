package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpOrderSaleBillDetails;

public interface ErpOrderSaleBillDetailsDao {
    int deleteByPrimaryKey(Integer saleBillDetailId);

    int insert(ErpOrderSaleBillDetails record);

    int insertSelective(ErpOrderSaleBillDetails record);

    ErpOrderSaleBillDetails selectByPrimaryKey(Integer saleBillDetailId);

    int updateByPrimaryKeySelective(ErpOrderSaleBillDetails record);

    int updateByPrimaryKey(ErpOrderSaleBillDetails record);
}