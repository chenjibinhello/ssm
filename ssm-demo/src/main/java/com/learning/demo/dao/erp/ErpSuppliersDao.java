package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpSuppliers;

public interface ErpSuppliersDao {
    int deleteByPrimaryKey(Integer supplierId);

    int insert(ErpSuppliers record);

    int insertSelective(ErpSuppliers record);

    ErpSuppliers selectByPrimaryKey(Integer supplierId);

    int updateByPrimaryKeySelective(ErpSuppliers record);

    int updateByPrimaryKey(ErpSuppliers record);
}