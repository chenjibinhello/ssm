package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpPurchasers;

public interface ErpPurchasersDao {
    int deleteByPrimaryKey(Integer purchaserId);

    int insert(ErpPurchasers record);

    int insertSelective(ErpPurchasers record);

    ErpPurchasers selectByPrimaryKey(Integer purchaserId);

    int updateByPrimaryKeySelective(ErpPurchasers record);

    int updateByPrimaryKey(ErpPurchasers record);
}