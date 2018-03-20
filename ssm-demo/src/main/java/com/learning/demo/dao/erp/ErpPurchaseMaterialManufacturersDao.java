package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpPurchaseMaterialManufacturers;

public interface ErpPurchaseMaterialManufacturersDao {
    int deleteByPrimaryKey(Integer manufacturerId);

    int insert(ErpPurchaseMaterialManufacturers record);

    int insertSelective(ErpPurchaseMaterialManufacturers record);

    ErpPurchaseMaterialManufacturers selectByPrimaryKey(Integer manufacturerId);

    int updateByPrimaryKeySelective(ErpPurchaseMaterialManufacturers record);

    int updateByPrimaryKey(ErpPurchaseMaterialManufacturers record);
}