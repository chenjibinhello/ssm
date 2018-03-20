package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpDepartmentMembers;

public interface ErpDepartmentMembersDao {
    int deleteByPrimaryKey(Integer memberId);

    int insert(ErpDepartmentMembers record);

    int insertSelective(ErpDepartmentMembers record);

    ErpDepartmentMembers selectByPrimaryKey(Integer memberId);

    int updateByPrimaryKeySelective(ErpDepartmentMembers record);

    int updateByPrimaryKey(ErpDepartmentMembers record);
}