package com.learning.demo.dao.erp;

import com.learning.demo.bean.domain.erp.ErpPurchaseVoucherBillDetails;

public interface ErpPurchaseVoucherBillDetailsDao {
    int deleteByPrimaryKey(Integer voucherBillDetailId);

    int insert(ErpPurchaseVoucherBillDetails record);

    int insertSelective(ErpPurchaseVoucherBillDetails record);

    ErpPurchaseVoucherBillDetails selectByPrimaryKey(Integer voucherBillDetailId);

    int updateByPrimaryKeySelective(ErpPurchaseVoucherBillDetails record);

    int updateByPrimaryKey(ErpPurchaseVoucherBillDetails record);
}