package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpUsefulExpressions;

public interface ErpUsefulExpressionsDao {
    int deleteByPrimaryKey(Integer expressionId);

    int insert(ErpUsefulExpressions record);

    int insertSelective(ErpUsefulExpressions record);

    ErpUsefulExpressions selectByPrimaryKey(Integer expressionId);

    int updateByPrimaryKeySelective(ErpUsefulExpressions record);

    int updateByPrimaryKey(ErpUsefulExpressions record);
}