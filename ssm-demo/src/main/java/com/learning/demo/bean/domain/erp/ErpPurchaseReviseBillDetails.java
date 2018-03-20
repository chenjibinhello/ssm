package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpPurchaseReviseBillDetails implements Serializable {
    private Integer reviseBillDetailId;

    private Integer reviseBillId;

    private Integer erpId;

    private String serialNumber;

    private Integer materialId;

    private String unit;

    private Long purchaseQuantity;

    private Long purchaseUnitPrice;

    private Integer deliveryDate;

    private String settleCode;

    private String reviseReason;

    private String confirmationCode;

    private Integer originMaterialId;

    private Long originDetailId;

    private String originUnit;

    private Long originPurchaseQuantity;

    private Long originPurchaseUnitPrice;

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

    public Integer getErpId() {
        return erpId;
    }

    public void setErpId(Integer erpId) {
        this.erpId = erpId;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Long getPurchaseQuantity() {
        return purchaseQuantity;
    }

    public void setPurchaseQuantity(Long purchaseQuantity) {
        this.purchaseQuantity = purchaseQuantity;
    }

    public Long getPurchaseUnitPrice() {
        return purchaseUnitPrice;
    }

    public void setPurchaseUnitPrice(Long purchaseUnitPrice) {
        this.purchaseUnitPrice = purchaseUnitPrice;
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

    public Long getOriginDetailId() {
        return originDetailId;
    }

    public void setOriginDetailId(Long originDetailId) {
        this.originDetailId = originDetailId;
    }

    public String getOriginUnit() {
        return originUnit;
    }

    public void setOriginUnit(String originUnit) {
        this.originUnit = originUnit == null ? null : originUnit.trim();
    }

    public Long getOriginPurchaseQuantity() {
        return originPurchaseQuantity;
    }

    public void setOriginPurchaseQuantity(Long originPurchaseQuantity) {
        this.originPurchaseQuantity = originPurchaseQuantity;
    }

    public Long getOriginPurchaseUnitPrice() {
        return originPurchaseUnitPrice;
    }

    public void setOriginPurchaseUnitPrice(Long originPurchaseUnitPrice) {
        this.originPurchaseUnitPrice = originPurchaseUnitPrice;
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
        sb.append(", erpId=").append(erpId);
        sb.append(", serialNumber=").append(serialNumber);
        sb.append(", materialId=").append(materialId);
        sb.append(", unit=").append(unit);
        sb.append(", purchaseQuantity=").append(purchaseQuantity);
        sb.append(", purchaseUnitPrice=").append(purchaseUnitPrice);
        sb.append(", deliveryDate=").append(deliveryDate);
        sb.append(", settleCode=").append(settleCode);
        sb.append(", reviseReason=").append(reviseReason);
        sb.append(", confirmationCode=").append(confirmationCode);
        sb.append(", originMaterialId=").append(originMaterialId);
        sb.append(", originDetailId=").append(originDetailId);
        sb.append(", originUnit=").append(originUnit);
        sb.append(", originPurchaseQuantity=").append(originPurchaseQuantity);
        sb.append(", originPurchaseUnitPrice=").append(originPurchaseUnitPrice);
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