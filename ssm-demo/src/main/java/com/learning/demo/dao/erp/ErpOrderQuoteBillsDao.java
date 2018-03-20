package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpOrderQuoteBills;

public interface ErpOrderQuoteBillsDao {
    int deleteByPrimaryKey(Integer quoteBillId);

    int insert(ErpOrderQuoteBills record);

    int insertSelective(ErpOrderQuoteBills record);

    ErpOrderQuoteBills selectByPrimaryKey(Integer quoteBillId);

    int updateByPrimaryKeySelective(ErpOrderQuoteBills record);

    int updateByPrimaryKey(ErpOrderQuoteBills record);
}