package priv.cjb.demo.service.erp.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import priv.cjb.demo.bean.domain.erp.ErpCompanies;
import priv.cjb.demo.dao.erp.ErpCompaniesDao;
import priv.cjb.demo.service.erp.IErpCompaniesService;

@Service
public class ErpCompaniesService implements IErpCompaniesService {

	@Autowired
	private ErpCompaniesDao erpCompaniesDao;
	
	@Override
	public ErpCompanies getByPrimaryId(Integer id) {
		return erpCompaniesDao.selectByPrimaryKey(id);
	}

	@Override
	public Integer insert(ErpCompanies erpCompanies) {
		return erpCompaniesDao.insert(erpCompanies);
	}

}
