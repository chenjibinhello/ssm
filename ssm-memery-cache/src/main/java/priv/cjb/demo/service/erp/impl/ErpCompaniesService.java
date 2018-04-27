package priv.cjb.demo.service.erp.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import priv.cjb.demo.bean.domain.erp.ErpCompanies;
import priv.cjb.demo.dao.erp.ErpCompaniesDao;
import priv.cjb.demo.service.erp.IErpCompaniesService;

@Service
public class ErpCompaniesService implements IErpCompaniesService {

	@Autowired
	private ErpCompaniesDao erpCompaniesDao;
	
	@Override
	public ErpCompanies getByPrimaryId(Integer id) {
		ErpCompanies erpCompanies = erpCompaniesDao.selectByPrimaryKey(id);
		System.out.println(erpCompanies.toString() + "...");
		return erpCompanies;
	}

	@Transactional
	@Override
	public Integer insert(ErpCompanies erpCompanies) {
		if (erpCompanies.getEnName() == "cjb") {
			throw new RuntimeException("unable to insert new erpCompanies!");
		}
		return erpCompaniesDao.insert(erpCompanies);
	}

}
