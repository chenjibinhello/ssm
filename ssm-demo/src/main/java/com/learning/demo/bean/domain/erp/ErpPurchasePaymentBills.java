package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpPurchasePaymentBills implements Serializable {
    private Integer paymentBillId;

    private Integer erpId;

    private Integer propertyId;

    private String code;

    private Integer payDate;

    private Integer supplierId;

    private String remark;

    private String remarkBak;

    private Integer accountingSubjectIdOne;

    private Long amountOne;

    private Integer accountingSubjectIdTwo;

    private Long amountTwo;

    private Integer accountingSubjectIdThree;

    private Long amountThree;

    private Integer accountingSubjectIdFour;

    private Long amountFour;

    private Integer accountingSubjectIdFive;

    private Long amountFive;

    private String confirmationCode;

    private String updateCode;

    private String transmissionCode;

    private Integer currencyId;

    private Long exchangeRate;

    private Long availableReverseAccountAmount;

    private Integer created;

    private Integer updated;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getPaymentBillId() {
        return paymentBillId;
    }

    public void setPaymentBillId(Integer paymentBillId) {
        this.paymentBillId = paymentBillId;
    }

    public Integer getErpId() {
        return erpId;
    }

    public void setErpId(Integer erpId) {
        this.erpId = erpId;
    }

    public Integer getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getPayDate() {
        return payDate;
    }

    public void setPayDate(Integer payDate) {
        this.payDate = payDate;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRemarkBak() {
        return remarkBak;
    }

    public void setRemarkBak(String remarkBak) {
        this.remarkBak = remarkBak == null ? null : remarkBak.trim();
    }

    public Integer getAccountingSubjectIdOne() {
        return accountingSubjectIdOne;
    }

    public void setAccountingSubjectIdOne(Integer accountingSubjectIdOne) {
        this.accountingSubjectIdOne = accountingSubjectIdOne;
    }

    public Long getAmountOne() {
        return amountOne;
    }

    public void setAmountOne(Long amountOne) {
        this.amountOne = amountOne;
    }

    public Integer getAccountingSubjectIdTwo() {
        return accountingSubjectIdTwo;
    }

    public void setAccountingSubjectIdTwo(Integer accountingSubjectIdTwo) {
        this.accountingSubjectIdTwo = accountingSubjectIdTwo;
    }

    public Long getAmountTwo() {
        return amountTwo;
    }

    public void setAmountTwo(Long amountTwo) {
        this.amountTwo = amountTwo;
    }

    public Integer getAccountingSubjectIdThree() {
        return accountingSubjectIdThree;
    }

    public void setAccountingSubjectIdThree(Integer accountingSubjectIdThree) {
        this.accountingSubjectIdThree = accountingSubjectIdThree;
    }

    public Long getAmountThree() {
        return amountThree;
    }

    public void setAmountThree(Long amountThree) {
        this.amountThree = amountThree;
    }

    public Integer getAccountingSubjectIdFour() {
        return accountingSubjectIdFour;
    }

    public void setAccountingSubjectIdFour(Integer accountingSubjectIdFour) {
        this.accountingSubjectIdFour = accountingSubjectIdFour;
    }

    public Long getAmountFour() {
        return amountFour;
    }

    public void setAmountFour(Long amountFour) {
        this.amountFour = amountFour;
    }

    public Integer getAccountingSubjectIdFive() {
        return accountingSubjectIdFive;
    }

    public void setAccountingSubjectIdFive(Integer accountingSubjectIdFive) {
        this.accountingSubjectIdFive = accountingSubjectIdFive;
    }

    public Long getAmountFive() {
        return amountFive;
    }

    public void setAmountFive(Long amountFive) {
        this.amountFive = amountFive;
    }

    public String getConfirmationCode() {
        return confirmationCode;
    }

    public void setConfirmationCode(String confirmationCode) {
        this.confirmationCode = confirmationCode == null ? null : confirmationCode.trim();
    }

    public String getUpdateCode() {
        return updateCode;
    }

    public void setUpdateCode(String updateCode) {
        this.updateCode = updateCode == null ? null : updateCode.trim();
    }

    public String getTransmissionCode() {
        return transmissionCode;
    }

    public void setTransmissionCode(String transmissionCode) {
        this.transmissionCode = transmissionCode == null ? null : transmissionCode.trim();
    }

    public Integer getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public Long getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Long exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Long getAvailableReverseAccountAmount() {
        return availableReverseAccountAmount;
    }

    public void setAvailableReverseAccountAmount(Long availableReverseAccountAmount) {
        this.availableReverseAccountAmount = availableReverseAccountAmount;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public Integer getUpdated() {
        return updated;
    }

    public void setUpdated(Integer updated) {
        this.updated = updated;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", paymentBillId=").append(paymentBillId);
        sb.append(", erpId=").append(erpId);
        sb.append(", propertyId=").append(propertyId);
        sb.append(", code=").append(code);
        sb.append(", payDate=").append(payDate);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", remark=").append(remark);
        sb.append(", remarkBak=").append(remarkBak);
        sb.append(", accountingSubjectIdOne=").append(accountingSubjectIdOne);
        sb.append(", amountOne=").append(amountOne);
        sb.append(", accountingSubjectIdTwo=").append(accountingSubjectIdTwo);
        sb.append(", amountTwo=").append(amountTwo);
        sb.append(", accountingSubjectIdThree=").append(accountingSubjectIdThree);
        sb.append(", amountThree=").append(amountThree);
        sb.append(", accountingSubjectIdFour=").append(accountingSubjectIdFour);
        sb.append(", amountFour=").append(amountFour);
        sb.append(", accountingSubjectIdFive=").append(accountingSubjectIdFive);
        sb.append(", amountFive=").append(amountFive);
        sb.append(", confirmationCode=").append(confirmationCode);
        sb.append(", updateCode=").append(updateCode);
        sb.append(", transmissionCode=").append(transmissionCode);
        sb.append(", currencyId=").append(currencyId);
        sb.append(", exchangeRate=").append(exchangeRate);
        sb.append(", availableReverseAccountAmount=").append(availableReverseAccountAmount);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}