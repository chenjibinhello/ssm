package priv.cjb.demo.dao.erp;

import priv.cjb.demo.bean.domain.erp.ErpCompanies;

public interface ErpCompaniesDao {
    int deleteByPrimaryKey(Integer companyId);

    int insert(ErpCompanies record);

    int insertSelective(ErpCompanies record);

    ErpCompanies selectByPrimaryKey(Integer companyId);

    int updateByPrimaryKeySelective(ErpCompanies record);

    int updateByPrimaryKey(ErpCompanies record);
}