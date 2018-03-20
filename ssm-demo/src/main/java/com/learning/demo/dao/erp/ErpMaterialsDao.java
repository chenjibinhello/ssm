package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpMaterials;

public interface ErpMaterialsDao {
    int deleteByPrimaryKey(Integer materialId);

    int insert(ErpMaterials record);

    int insertSelective(ErpMaterials record);

    ErpMaterials selectByPrimaryKey(Integer materialId);

    int updateByPrimaryKeySelective(ErpMaterials record);

    int updateByPrimaryKey(ErpMaterials record);
}