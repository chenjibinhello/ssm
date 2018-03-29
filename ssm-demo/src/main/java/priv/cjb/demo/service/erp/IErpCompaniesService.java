package priv.cjb.demo.service.erp;

import priv.cjb.demo.bean.domain.erp.ErpCompanies;

public interface IErpCompaniesService {

	ErpCompanies getByPrimaryId(Integer id);
	
	Integer insert(ErpCompanies erpCompanies);
}
