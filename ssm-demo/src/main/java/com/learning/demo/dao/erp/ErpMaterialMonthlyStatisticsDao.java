package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpMaterialMonthlyStatistics;

public interface ErpMaterialMonthlyStatisticsDao {
    int deleteByPrimaryKey(Integer statisticId);

    int insert(ErpMaterialMonthlyStatistics record);

    int insertSelective(ErpMaterialMonthlyStatistics record);

    ErpMaterialMonthlyStatistics selectByPrimaryKey(Integer statisticId);

    int updateByPrimaryKeySelective(ErpMaterialMonthlyStatistics record);

    int updateByPrimaryKey(ErpMaterialMonthlyStatistics record);
}