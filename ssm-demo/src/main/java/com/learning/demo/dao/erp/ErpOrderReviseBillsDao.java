package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpOrderReviseBills;

public interface ErpOrderReviseBillsDao {
    int deleteByPrimaryKey(Integer reviseBillId);

    int insert(ErpOrderReviseBills record);

    int insertSelective(ErpOrderReviseBills record);

    ErpOrderReviseBills selectByPrimaryKey(Integer reviseBillId);

    int updateByPrimaryKeySelective(ErpOrderReviseBills record);

    int updateByPrimaryKey(ErpOrderReviseBills record);
}