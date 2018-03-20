package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpPurchasePaymentBillDetails implements Serializable {
    private Integer paymentBillDetailId;

    private Integer paymentBillId;

    private Integer erpId;

    private Integer propertyId;

    private String code;

    private String serialNumber;

    private Integer voucherBillId;

    private Integer voucherPropertyId;

    private String voucherCode;

    private Integer voucherDate;

    private Long payablePrice;

    private Long unpaidPrice;

    private Long availableReverseAccountAmount;

    private String remark;

    private String confirmationCode;

    private Integer created;

    private Integer updated;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getPaymentBillDetailId() {
        return paymentBillDetailId;
    }

    public void setPaymentBillDetailId(Integer paymentBillDetailId) {
        this.paymentBillDetailId = paymentBillDetailId;
    }

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

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    public Integer getVoucherBillId() {
        return voucherBillId;
    }

    public void setVoucherBillId(Integer voucherBillId) {
        this.voucherBillId = voucherBillId;
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

    public Long getPayablePrice() {
        return payablePrice;
    }

    public void setPayablePrice(Long payablePrice) {
        this.payablePrice = payablePrice;
    }

    public Long getUnpaidPrice() {
        return unpaidPrice;
    }

    public void setUnpaidPrice(Long unpaidPrice) {
        this.unpaidPrice = unpaidPrice;
    }

    public Long getAvailableReverseAccountAmount() {
        return availableReverseAccountAmount;
    }

    public void setAvailableReverseAccountAmount(Long availableReverseAccountAmount) {
        this.availableReverseAccountAmount = availableReverseAccountAmount;
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
        sb.append(", paymentBillDetailId=").append(paymentBillDetailId);
        sb.append(", paymentBillId=").append(paymentBillId);
        sb.append(", erpId=").append(erpId);
        sb.append(", propertyId=").append(propertyId);
        sb.append(", code=").append(code);
        sb.append(", serialNumber=").append(serialNumber);
        sb.append(", voucherBillId=").append(voucherBillId);
        sb.append(", voucherPropertyId=").append(voucherPropertyId);
        sb.append(", voucherCode=").append(voucherCode);
        sb.append(", voucherDate=").append(voucherDate);
        sb.append(", payablePrice=").append(payablePrice);
        sb.append(", unpaidPrice=").append(unpaidPrice);
        sb.append(", availableReverseAccountAmount=").append(availableReverseAccountAmount);
        sb.append(", remark=").append(remark);
        sb.append(", confirmationCode=").append(confirmationCode);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}