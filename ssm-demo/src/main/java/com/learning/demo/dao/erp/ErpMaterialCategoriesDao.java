package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpMaterialCategories;

public interface ErpMaterialCategoriesDao {
    int deleteByPrimaryKey(Integer categoryId);

    int insert(ErpMaterialCategories record);

    int insertSelective(ErpMaterialCategories record);

    ErpMaterialCategories selectByPrimaryKey(Integer categoryId);

    int updateByPrimaryKeySelective(ErpMaterialCategories record);

    int updateByPrimaryKey(ErpMaterialCategories record);
}