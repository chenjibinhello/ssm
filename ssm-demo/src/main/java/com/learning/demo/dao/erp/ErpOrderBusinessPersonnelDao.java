package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpOrderBusinessPersonnel;

public interface ErpOrderBusinessPersonnelDao {
    int deleteByPrimaryKey(Integer businessPersonnelId);

    int insert(ErpOrderBusinessPersonnel record);

    int insertSelective(ErpOrderBusinessPersonnel record);

    ErpOrderBusinessPersonnel selectByPrimaryKey(Integer businessPersonnelId);

    int updateByPrimaryKeySelective(ErpOrderBusinessPersonnel record);

    int updateByPrimaryKey(ErpOrderBusinessPersonnel record);
}