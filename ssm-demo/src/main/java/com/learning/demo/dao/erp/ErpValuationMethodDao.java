package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpValuationMethod;

public interface ErpValuationMethodDao {
    int deleteByPrimaryKey(Integer methodId);

    int insert(ErpValuationMethod record);

    int insertSelective(ErpValuationMethod record);

    ErpValuationMethod selectByPrimaryKey(Integer methodId);

    int updateByPrimaryKeySelective(ErpValuationMethod record);

    int updateByPrimaryKey(ErpValuationMethod record);
}