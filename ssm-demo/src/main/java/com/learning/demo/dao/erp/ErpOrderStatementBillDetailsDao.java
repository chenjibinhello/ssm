package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpOrderStatementBillDetails;

public interface ErpOrderStatementBillDetailsDao {
    int deleteByPrimaryKey(Integer statementBillDetailId);

    int insert(ErpOrderStatementBillDetails record);

    int insertSelective(ErpOrderStatementBillDetails record);

    ErpOrderStatementBillDetails selectByPrimaryKey(Integer statementBillDetailId);

    int updateByPrimaryKeySelective(ErpOrderStatementBillDetails record);

    int updateByPrimaryKey(ErpOrderStatementBillDetails record);
}