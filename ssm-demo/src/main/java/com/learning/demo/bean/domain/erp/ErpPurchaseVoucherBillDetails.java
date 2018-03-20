package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpPurchaseVoucherBillDetails implements Serializable {
    private Integer voucherBillDetailId;

    private Integer voucherBillId;

    private Integer erpId;

    private Long supplierId;

    private Integer propertyId;

    private String code;

    private Integer voucherDate;

    private String serialNumber;

    private Integer relatedBillId;

    private Byte relatedType;

    private Integer relatedDate;

    private Long payablePrice;

    private Long discountPrice;

    private Long rmbDiscountPrice;

    private String remark;

    private String confirmationCode;

    private Integer created;

    private Integer updated;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getVoucherBillDetailId() {
        return voucherBillDetailId;
    }

    public void setVoucherBillDetailId(Integer voucherBillDetailId) {
        this.voucherBillDetailId = voucherBillDetailId;
    }

    public Integer getVoucherBillId() {
        return voucherBillId;
    }

    public void setVoucherBillId(Integer voucherBillId) {
        this.voucherBillId = voucherBillId;
    }

    public Integer getErpId() {
        return erpId;
    }

    public void setErpId(Integer erpId) {
        this.erpId = erpId;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
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

    public Integer getVoucherDate() {
        return voucherDate;
    }

    public void setVoucherDate(Integer voucherDate) {
        this.voucherDate = voucherDate;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    public Integer getRelatedBillId() {
        return relatedBillId;
    }

    public void setRelatedBillId(Integer relatedBillId) {
        this.relatedBillId = relatedBillId;
    }

    public Byte getRelatedType() {
        return relatedType;
    }

    public void setRelatedType(Byte relatedType) {
        this.relatedType = relatedType;
    }

    public Integer getRelatedDate() {
        return relatedDate;
    }

    public void setRelatedDate(Integer relatedDate) {
        this.relatedDate = relatedDate;
    }

    public Long getPayablePrice() {
        return payablePrice;
    }

    public void setPayablePrice(Long payablePrice) {
        this.payablePrice = payablePrice;
    }

    public Long getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Long discountPrice) {
        this.discountPrice = discountPrice;
    }

    public Long getRmbDiscountPrice() {
        return rmbDiscountPrice;
    }

    public void setRmbDiscountPrice(Long rmbDiscountPrice) {
        this.rmbDiscountPrice = rmbDiscountPrice;
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
        sb.append(", voucherBillDetailId=").append(voucherBillDetailId);
        sb.append(", voucherBillId=").append(voucherBillId);
        sb.append(", erpId=").append(erpId);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", propertyId=").append(propertyId);
        sb.append(", code=").append(code);
        sb.append(", voucherDate=").append(voucherDate);
        sb.append(", serialNumber=").append(serialNumber);
        sb.append(", relatedBillId=").append(relatedBillId);
        sb.append(", relatedType=").append(relatedType);
        sb.append(", relatedDate=").append(relatedDate);
        sb.append(", payablePrice=").append(payablePrice);
        sb.append(", discountPrice=").append(discountPrice);
        sb.append(", rmbDiscountPrice=").append(rmbDiscountPrice);
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