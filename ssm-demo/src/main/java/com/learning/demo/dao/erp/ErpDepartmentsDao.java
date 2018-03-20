package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpDepartments;

public interface ErpDepartmentsDao {
    int deleteByPrimaryKey(Integer departmentId);

    int insert(ErpDepartments record);

    int insertSelective(ErpDepartments record);

    ErpDepartments selectByPrimaryKey(Integer departmentId);

    int updateByPrimaryKeySelective(ErpDepartments record);

    int updateByPrimaryKey(ErpDepartments record);
}