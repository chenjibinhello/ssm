package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpCompanies;

public interface ErpCompaniesDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ErpCompanies record);

    int insertSelective(ErpCompanies record);

    ErpCompanies selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ErpCompanies record);

    int updateByPrimaryKey(ErpCompanies record);
}