package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpOrderValuations;

public interface ErpOrderValuationsDao {
    int deleteByPrimaryKey(Integer valuationId);

    int insert(ErpOrderValuations record);

    int insertSelective(ErpOrderValuations record);

    ErpOrderValuations selectByPrimaryKey(Integer valuationId);

    int updateByPrimaryKeySelective(ErpOrderValuations record);

    int updateByPrimaryKey(ErpOrderValuations record);
}