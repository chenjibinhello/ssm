package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpOrderQuoteBillDetails;

public interface ErpOrderQuoteBillDetailsDao {
    int deleteByPrimaryKey(Integer quoteBillDetailId);

    int insert(ErpOrderQuoteBillDetails record);

    int insertSelective(ErpOrderQuoteBillDetails record);

    ErpOrderQuoteBillDetails selectByPrimaryKey(Integer quoteBillDetailId);

    int updateByPrimaryKeySelective(ErpOrderQuoteBillDetails record);

    int updateByPrimaryKey(ErpOrderQuoteBillDetails record);
}