package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpCurrencies;

public interface ErpCurrenciesDao {
    int deleteByPrimaryKey(Integer currencyId);

    int insert(ErpCurrencies record);

    int insertSelective(ErpCurrencies record);

    ErpCurrencies selectByPrimaryKey(Integer currencyId);

    int updateByPrimaryKeySelective(ErpCurrencies record);

    int updateByPrimaryKey(ErpCurrencies record);
}