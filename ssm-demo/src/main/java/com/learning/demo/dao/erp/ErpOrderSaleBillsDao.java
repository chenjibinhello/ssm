package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpOrderSaleBills;

public interface ErpOrderSaleBillsDao {
    int deleteByPrimaryKey(Integer saleBillId);

    int insert(ErpOrderSaleBills record);

    int insertSelective(ErpOrderSaleBills record);

    ErpOrderSaleBills selectByPrimaryKey(Integer saleBillId);

    int updateByPrimaryKeySelective(ErpOrderSaleBills record);

    int updateByPrimaryKey(ErpOrderSaleBills record);
}