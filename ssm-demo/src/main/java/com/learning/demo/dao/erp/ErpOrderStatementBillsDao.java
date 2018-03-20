package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpOrderStatementBills;

public interface ErpOrderStatementBillsDao {
    int deleteByPrimaryKey(Integer statementBillId);

    int insert(ErpOrderStatementBills record);

    int insertSelective(ErpOrderStatementBills record);

    ErpOrderStatementBills selectByPrimaryKey(Integer statementBillId);

    int updateByPrimaryKeySelective(ErpOrderStatementBills record);

    int updateByPrimaryKey(ErpOrderStatementBills record);
}