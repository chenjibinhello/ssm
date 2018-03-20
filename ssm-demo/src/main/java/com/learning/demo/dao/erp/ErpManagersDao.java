package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpManagers;

public interface ErpManagersDao {
    int deleteByPrimaryKey(Integer managerId);

    int insert(ErpManagers record);

    int insertSelective(ErpManagers record);

    ErpManagers selectByPrimaryKey(Integer managerId);

    int updateByPrimaryKeySelective(ErpManagers record);

    int updateByPrimaryKeyWithBLOBs(ErpManagers record);

    int updateByPrimaryKey(ErpManagers record);
}