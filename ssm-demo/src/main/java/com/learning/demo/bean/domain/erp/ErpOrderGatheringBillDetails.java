package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpOrderGatheringBillDetails implements Serializable {
    private Integer gatheringBillDetailId;

    private Integer gatheringBillId;

    private Integer erpId;

    private Integer propertyId;

    private String code;

    private String serialNumber;

    private Integer statementBillId;

    private Integer settleDate;

    private Long receivableAmount;

    private Long unpaidAmount;

    private Long reverseAccountAmount;

    private String remark;

    private String confirmationCode;

    private Integer billId;

    private Integer billPropertyId;

    private String billCode;

    private Integer updated;

    private Integer created;

    private Boolean isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getGatheringBillDetailId() {
        return gatheringBillDetailId;
    }

    public void setGatheringBillDetailId(Integer gatheringBillDetailId) {
        this.gatheringBillDetailId = gatheringBillDetailId;
    }

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

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    public Integer getStatementBillId() {
        return statementBillId;
    }

    public void setStatementBillId(Integer statementBillId) {
        this.statementBillId = statementBillId;
    }

    public Integer getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(Integer settleDate) {
        this.settleDate = settleDate;
    }

    public Long getReceivableAmount() {
        return receivableAmount;
    }

    public void setReceivableAmount(Long receivableAmount) {
        this.receivableAmount = receivableAmount;
    }

    public Long getUnpaidAmount() {
        return unpaidAmount;
    }

    public void setUnpaidAmount(Long unpaidAmount) {
        this.unpaidAmount = unpaidAmount;
    }

    public Long getReverseAccountAmount() {
        return reverseAccountAmount;
    }

    public void setReverseAccountAmount(Long reverseAccountAmount) {
        this.reverseAccountAmount = reverseAccountAmount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getConfirmationCode() {
        return confirmationCode;
    }

    public void setConfirmationCode(String confirmationCode) {
        this.confirmationCode = confirmationCode == null ? null : confirmationCode.trim();
    }

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public Integer getBillPropertyId() {
        return billPropertyId;
    }

    public void setBillPropertyId(Integer billPropertyId) {
        this.billPropertyId = billPropertyId;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode == null ? null : billCode.trim();
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
        sb.append(", gatheringBillDetailId=").append(gatheringBillDetailId);
        sb.append(", gatheringBillId=").append(gatheringBillId);
        sb.append(", erpId=").append(erpId);
        sb.append(", propertyId=").append(propertyId);
        sb.append(", code=").append(code);
        sb.append(", serialNumber=").append(serialNumber);
        sb.append(", statementBillId=").append(statementBillId);
        sb.append(", settleDate=").append(settleDate);
        sb.append(", receivableAmount=").append(receivableAmount);
        sb.append(", unpaidAmount=").append(unpaidAmount);
        sb.append(", reverseAccountAmount=").append(reverseAccountAmount);
        sb.append(", remark=").append(remark);
        sb.append(", confirmationCode=").append(confirmationCode);
        sb.append(", billId=").append(billId);
        sb.append(", billPropertyId=").append(billPropertyId);
        sb.append(", billCode=").append(billCode);
        sb.append(", updated=").append(updated);
        sb.append(", created=").append(created);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}