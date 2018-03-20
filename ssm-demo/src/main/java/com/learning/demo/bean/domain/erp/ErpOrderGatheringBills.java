package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpOrderGatheringBills implements Serializable {
    private Integer gatheringBillId;

    private Integer erpId;

    private Integer propertyId;

    private String code;

    private Integer gatheringDate;

    private Integer customerId;

    private String remark;

    private Integer accountingSubjectIdOne;

    private Integer amountOne;

    private Integer accountingSubjectIdTwo;

    private Integer amountTwo;

    private Integer accountingSubjectIdThree;

    private Integer amountThree;

    private Integer accountingSubjectIdFour;

    private Integer amountFour;

    private Integer accountingSubjectIdFive;

    private Integer amountFive;

    private Integer currencyId;

    private Long exchangeRate;

    private Integer availableReverseAccountAmount;

    private String confirmationCode;

    private String updateCode;

    private String transmissionCode;

    private Integer updated;

    private Integer created;

    private Boolean isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getGatheringBillId() {
        return gatheringBillId;
    }

    public void setGatheringBillId(Integer gatheringBillId) {
        this.gatheringBillId = gatheringBillId;
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

    public Integer getGatheringDate() {
        return gatheringDate;
    }

    public void setGatheringDate(Integer gatheringDate) {
        this.gatheringDate = gatheringDate;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getAccountingSubjectIdOne() {
        return accountingSubjectIdOne;
    }

    public void setAccountingSubjectIdOne(Integer accountingSubjectIdOne) {
        this.accountingSubjectIdOne = accountingSubjectIdOne;
    }

    public Integer getAmountOne() {
        return amountOne;
    }

    public void setAmountOne(Integer amountOne) {
        this.amountOne = amountOne;
    }

    public Integer getAccountingSubjectIdTwo() {
        return accountingSubjectIdTwo;
    }

    public void setAccountingSubjectIdTwo(Integer accountingSubjectIdTwo) {
        this.accountingSubjectIdTwo = accountingSubjectIdTwo;
    }

    public Integer getAmountTwo() {
        return amountTwo;
    }

    public void setAmountTwo(Integer amountTwo) {
        this.amountTwo = amountTwo;
    }

    public Integer getAccountingSubjectIdThree() {
        return accountingSubjectIdThree;
    }

    public void setAccountingSubjectIdThree(Integer accountingSubjectIdThree) {
        this.accountingSubjectIdThree = accountingSubjectIdThree;
    }

    public Integer getAmountThree() {
        return amountThree;
    }

    public void setAmountThree(Integer amountThree) {
        this.amountThree = amountThree;
    }

    public Integer getAccountingSubjectIdFour() {
        return accountingSubjectIdFour;
    }

    public void setAccountingSubjectIdFour(Integer accountingSubjectIdFour) {
        this.accountingSubjectIdFour = accountingSubjectIdFour;
    }

    public Integer getAmountFour() {
        return amountFour;
    }

    public void setAmountFour(Integer amountFour) {
        this.amountFour = amountFour;
    }

    public Integer getAccountingSubjectIdFive() {
        return accountingSubjectIdFive;
    }

    public void setAccountingSubjectIdFive(Integer accountingSubjectIdFive) {
        this.accountingSubjectIdFive = accountingSubjectIdFive;
    }

    public Integer getAmountFive() {
        return amountFive;
    }

    public void setAmountFive(Integer amountFive) {
        this.amountFive = amountFive;
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

    public Integer getAvailableReverseAccountAmount() {
        return availableReverseAccountAmount;
    }

    public void setAvailableReverseAccountAmount(Integer availableReverseAccountAmount) {
        this.availableReverseAccountAmount = availableReverseAccountAmount;
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

    public Integer getUpdated() {
        return updated;
    }

    public void setUpdated(Integer updated) {
        this.updated = updated;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gatheringBillId=").append(gatheringBillId);
        sb.append(", erpId=").append(erpId);
        sb.append(", propertyId=").append(propertyId);
        sb.append(", code=").append(code);
        sb.append(", gatheringDate=").append(gatheringDate);
        sb.append(", customerId=").append(customerId);
        sb.append(", remark=").append(remark);
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
        sb.append(", currencyId=").append(currencyId);
        sb.append(", exchangeRate=").append(exchangeRate);
        sb.append(", availableReverseAccountAmount=").append(availableReverseAccountAmount);
        sb.append(", confirmationCode=").append(confirmationCode);
        sb.append(", updateCode=").append(updateCode);
        sb.append(", transmissionCode=").append(transmissionCode);
        sb.append(", updated=").append(updated);
        sb.append(", created=").append(created);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}