package com.learning.demo.service.erp;

import com.learning.demo.bean.domain.erp.ErpCompanies;

public interface IErpCompaniesService {

	ErpCompanies getByPrimaryId(Integer id);
	
	Integer insert(ErpCompanies erpCompanies);
}
