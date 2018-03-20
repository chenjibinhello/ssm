package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpPurchasePurchaseRequisitionBillDetails implements Serializable {
    private Integer purchaseRequisitionBillDetailId;

    private Integer purchaseRequisitionBillId;

    private Integer erpId;

    private Integer propertyId;

    private String code;

    private String serialNumber;

    private Integer materialId;

    private String unit;

    private Integer warehouseId;

    private Long quantity;

    private Integer requiredDate;

    private String remark;

    private String remarkBak;

    private Integer purchaserId;

    private Integer supplierId;

    private Long purchaseQuantity;

    private String purchaseUnit;

    private Integer purchaseCurrencyId;

    private Long purchaseUnitPrice;

    private Long purchasePrice;

    private String purchaseRemark;

    private Integer deliveryDate;

    private String lockCode;

    private String purchaseingCode;

    private Integer requisitionDate;

    private String confirmationCode;

    private Integer purchaseBillDetailId;

    private Integer created;

    private Integer updated;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getPurchaseRequisitionBillDetailId() {
        return purchaseRequisitionBillDetailId;
    }

    public void setPurchaseRequisitionBillDetailId(Integer purchaseRequisitionBillDetailId) {
        this.purchaseRequisitionBillDetailId = purchaseRequisitionBillDetailId;
    }

    public Integer getPurchaseRequisitionBillId() {
        return purchaseRequisitionBillId;
    }

    public void setPurchaseRequisitionBillId(Integer purchaseRequisitionBillId) {
        this.purchaseRequisitionBillId = purchaseRequisitionBillId;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Integer getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(Integer requiredDate) {
        this.requiredDate = requiredDate;
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

    public Integer getPurchaserId() {
        return purchaserId;
    }

    public void setPurchaserId(Integer purchaserId) {
        this.purchaserId = purchaserId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Long getPurchaseQuantity() {
        return purchaseQuantity;
    }

    public void setPurchaseQuantity(Long purchaseQuantity) {
        this.purchaseQuantity = purchaseQuantity;
    }

    public String getPurchaseUnit() {
        return purchaseUnit;
    }

    public void setPurchaseUnit(String purchaseUnit) {
        this.purchaseUnit = purchaseUnit == null ? null : purchaseUnit.trim();
    }

    public Integer getPurchaseCurrencyId() {
        return purchaseCurrencyId;
    }

    public void setPurchaseCurrencyId(Integer purchaseCurrencyId) {
        this.purchaseCurrencyId = purchaseCurrencyId;
    }

    public Long getPurchaseUnitPrice() {
        return purchaseUnitPrice;
    }

    public void setPurchaseUnitPrice(Long purchaseUnitPrice) {
        this.purchaseUnitPrice = purchaseUnitPrice;
    }

    public Long getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Long purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getPurchaseRemark() {
        return purchaseRemark;
    }

    public void setPurchaseRemark(String purchaseRemark) {
        this.purchaseRemark = purchaseRemark == null ? null : purchaseRemark.trim();
    }

    public Integer getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Integer deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getLockCode() {
        return lockCode;
    }

    public void setLockCode(String lockCode) {
        this.lockCode = lockCode == null ? null : lockCode.trim();
    }

    public String getPurchaseingCode() {
        return purchaseingCode;
    }

    public void setPurchaseingCode(String purchaseingCode) {
        this.purchaseingCode = purchaseingCode == null ? null : purchaseingCode.trim();
    }

    public Integer getRequisitionDate() {
        return requisitionDate;
    }

    public void setRequisitionDate(Integer requisitionDate) {
        this.requisitionDate = requisitionDate;
    }

    public String getConfirmationCode() {
        return confirmationCode;
    }

    public void setConfirmationCode(String confirmationCode) {
        this.confirmationCode = confirmationCode == null ? null : confirmationCode.trim();
    }

    public Integer getPurchaseBillDetailId() {
        return purchaseBillDetailId;
    }

    public void setPurchaseBillDetailId(Integer purchaseBillDetailId) {
        this.purchaseBillDetailId = purchaseBillDetailId;
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
        sb.append(", purchaseRequisitionBillDetailId=").append(purchaseRequisitionBillDetailId);
        sb.append(", purchaseRequisitionBillId=").append(purchaseRequisitionBillId);
        sb.append(", erpId=").append(erpId);
        sb.append(", propertyId=").append(propertyId);
        sb.append(", code=").append(code);
        sb.append(", serialNumber=").append(serialNumber);
        sb.append(", materialId=").append(materialId);
        sb.append(", unit=").append(unit);
        sb.append(", warehouseId=").append(warehouseId);
        sb.append(", quantity=").append(quantity);
        sb.append(", requiredDate=").append(requiredDate);
        sb.append(", remark=").append(remark);
        sb.append(", remarkBak=").append(remarkBak);
        sb.append(", purchaserId=").append(purchaserId);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", purchaseQuantity=").append(purchaseQuantity);
        sb.append(", purchaseUnit=").append(purchaseUnit);
        sb.append(", purchaseCurrencyId=").append(purchaseCurrencyId);
        sb.append(", purchaseUnitPrice=").append(purchaseUnitPrice);
        sb.append(", purchasePrice=").append(purchasePrice);
        sb.append(", purchaseRemark=").append(purchaseRemark);
        sb.append(", deliveryDate=").append(deliveryDate);
        sb.append(", lockCode=").append(lockCode);
        sb.append(", purchaseingCode=").append(purchaseingCode);
        sb.append(", requisitionDate=").append(requisitionDate);
        sb.append(", confirmationCode=").append(confirmationCode);
        sb.append(", purchaseBillDetailId=").append(purchaseBillDetailId);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}