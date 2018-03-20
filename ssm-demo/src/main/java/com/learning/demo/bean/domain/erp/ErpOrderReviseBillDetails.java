package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpOrderReviseBillDetails implements Serializable {
    private Integer reviseBillDetailId;

    private Integer reviseBillId;

    private Integer customerBillId;

    private Integer customerBillDetailId;

    private Integer erpId;

    private Integer propertyId;

    private String code;

    private String serialNumber;

    private Integer materialId;

    private Long orderQuantity;

    private Long unitPrice;

    private Integer deliveryDate;

    private String settleCode;

    private String reviseReason;

    private String confirmationCode;

    private Integer originMaterialId;

    private Long originOrderQuantity;

    private Long originUnitPrice;

    private Integer originDeliveryDate;

    private String originSettleCode;

    private Long originDeliveredQuantity;

    private Integer created;

    private Integer updated;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getReviseBillDetailId() {
        return reviseBillDetailId;
    }

    public void setReviseBillDetailId(Integer reviseBillDetailId) {
        this.reviseBillDetailId = reviseBillDetailId;
    }

    public Integer getReviseBillId() {
        return reviseBillId;
    }

    public void setReviseBillId(Integer reviseBillId) {
        this.reviseBillId = reviseBillId;
    }

    public Integer getCustomerBillId() {
        return customerBillId;
    }

    public void setCustomerBillId(Integer customerBillId) {
        this.customerBillId = customerBillId;
    }

    public Integer getCustomerBillDetailId() {
        return customerBillDetailId;
    }

    public void setCustomerBillDetailId(Integer customerBillDetailId) {
        this.customerBillDetailId = customerBillDetailId;
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

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    public Long getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(Long orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public Long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Integer deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getSettleCode() {
        return settleCode;
    }

    public void setSettleCode(String settleCode) {
        this.settleCode = settleCode == null ? null : settleCode.trim();
    }

    public String getReviseReason() {
        return reviseReason;
    }

    public void setReviseReason(String reviseReason) {
        this.reviseReason = reviseReason == null ? null : reviseReason.trim();
    }

    public String getConfirmationCode() {
        return confirmationCode;
    }

    public void setConfirmationCode(String confirmationCode) {
        this.confirmationCode = confirmationCode == null ? null : confirmationCode.trim();
    }

    public Integer getOriginMaterialId() {
        return originMaterialId;
    }

    public void setOriginMaterialId(Integer originMaterialId) {
        this.originMaterialId = originMaterialId;
    }

    public Long getOriginOrderQuantity() {
        return originOrderQuantity;
    }

    public void setOriginOrderQuantity(Long originOrderQuantity) {
        this.originOrderQuantity = originOrderQuantity;
    }

    public Long getOriginUnitPrice() {
        return originUnitPrice;
    }

    public void setOriginUnitPrice(Long originUnitPrice) {
        this.originUnitPrice = originUnitPrice;
    }

    public Integer getOriginDeliveryDate() {
        return originDeliveryDate;
    }

    public void setOriginDeliveryDate(Integer originDeliveryDate) {
        this.originDeliveryDate = originDeliveryDate;
    }

    public String getOriginSettleCode() {
        return originSettleCode;
    }

    public void setOriginSettleCode(String originSettleCode) {
        this.originSettleCode = originSettleCode == null ? null : originSettleCode.trim();
    }

    public Long getOriginDeliveredQuantity() {
        return originDeliveredQuantity;
    }

    public void setOriginDeliveredQuantity(Long originDeliveredQuantity) {
        this.originDeliveredQuantity = originDeliveredQuantity;
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
        sb.append(", reviseBillDetailId=").append(reviseBillDetailId);
        sb.append(", reviseBillId=").append(reviseBillId);
        sb.append(", customerBillId=").append(customerBillId);
        sb.append(", customerBillDetailId=").append(customerBillDetailId);
        sb.append(", erpId=").append(erpId);
        sb.append(", propertyId=").append(propertyId);
        sb.append(", code=").append(code);
        sb.append(", serialNumber=").append(serialNumber);
        sb.append(", materialId=").append(materialId);
        sb.append(", orderQuantity=").append(orderQuantity);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append(", deliveryDate=").append(deliveryDate);
        sb.append(", settleCode=").append(settleCode);
        sb.append(", reviseReason=").append(reviseReason);
        sb.append(", confirmationCode=").append(confirmationCode);
        sb.append(", originMaterialId=").append(originMaterialId);
        sb.append(", originOrderQuantity=").append(originOrderQuantity);
        sb.append(", originUnitPrice=").append(originUnitPrice);
        sb.append(", originDeliveryDate=").append(originDeliveryDate);
        sb.append(", originSettleCode=").append(originSettleCode);
        sb.append(", originDeliveredQuantity=").append(originDeliveredQuantity);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}