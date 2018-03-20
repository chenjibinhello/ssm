package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpOrderReviseBillDetails;

public interface ErpOrderReviseBillDetailsDao {
    int deleteByPrimaryKey(Integer reviseBillDetailId);

    int insert(ErpOrderReviseBillDetails record);

    int insertSelective(ErpOrderReviseBillDetails record);

    ErpOrderReviseBillDetails selectByPrimaryKey(Integer reviseBillDetailId);

    int updateByPrimaryKeySelective(ErpOrderReviseBillDetails record);

    int updateByPrimaryKey(ErpOrderReviseBillDetails record);
}