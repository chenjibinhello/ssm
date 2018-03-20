package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpOrderStatementBillDetails implements Serializable {
    private Integer statementBillDetailId;

    private Integer statementBillId;

    private Integer erpId;

    private Integer propertyId;

    private String code;

    private String serialNumber;

    private Integer voucherId;

    private Integer voucherPropertyId;

    private String voucherCode;

    private Integer voucherDate;

    private Byte voucherType;

    private Long receivableAmount;

    private Long discountedAmount;

    private String remark;

    private String confirmationCode;

    private Integer updated;

    private Integer created;

    private Boolean isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getStatementBillDetailId() {
        return statementBillDetailId;
    }

    public void setStatementBillDetailId(Integer statementBillDetailId) {
        this.statementBillDetailId = statementBillDetailId;
    }

    public Integer getStatementBillId() {
        return statementBillId;
    }

    public void setStatementBillId(Integer statementBillId) {
        this.statementBillId = statementBillId;
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

    public Integer getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(Integer voucherId) {
        this.voucherId = voucherId;
    }

    public Integer getVoucherPropertyId() {
        return voucherPropertyId;
    }

    public void setVoucherPropertyId(Integer voucherPropertyId) {
        this.voucherPropertyId = voucherPropertyId;
    }

    public String getVoucherCode() {
        return voucherCode;
    }

    public void setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode == null ? null : voucherCode.trim();
    }

    public Integer getVoucherDate() {
        return voucherDate;
    }

    public void setVoucherDate(Integer voucherDate) {
        this.voucherDate = voucherDate;
    }

    public Byte getVoucherType() {
        return voucherType;
    }

    public void setVoucherType(Byte voucherType) {
        this.voucherType = voucherType;
    }

    public Long getReceivableAmount() {
        return receivableAmount;
    }

    public void setReceivableAmount(Long receivableAmount) {
        this.receivableAmount = receivableAmount;
    }

    public Long getDiscountedAmount() {
        return discountedAmount;
    }

    public void setDiscountedAmount(Long discountedAmount) {
        this.discountedAmount = discountedAmount;
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
        sb.append(", statementBillDetailId=").append(statementBillDetailId);
        sb.append(", statementBillId=").append(statementBillId);
        sb.append(", erpId=").append(erpId);
        sb.append(", propertyId=").append(propertyId);
        sb.append(", code=").append(code);
        sb.append(", serialNumber=").append(serialNumber);
        sb.append(", voucherId=").append(voucherId);
        sb.append(", voucherPropertyId=").append(voucherPropertyId);
        sb.append(", voucherCode=").append(voucherCode);
        sb.append(", voucherDate=").append(voucherDate);
        sb.append(", voucherType=").append(voucherType);
        sb.append(", receivableAmount=").append(receivableAmount);
        sb.append(", discountedAmount=").append(discountedAmount);
        sb.append(", remark=").append(remark);
        sb.append(", confirmationCode=").append(confirmationCode);
        sb.append(", updated=").append(updated);
        sb.append(", created=").append(created);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}