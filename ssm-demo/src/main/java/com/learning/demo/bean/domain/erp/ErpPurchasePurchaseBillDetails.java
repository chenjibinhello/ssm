package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpPurchasePurchaseBillDetails implements Serializable {
    private Integer purchaseBillDetailId;

    private Integer purchaseBillId;

    private Integer erpId;

    private Integer propertyId;

    private Integer purchaseCode;

    private Integer purchaseDate;

    private String code;

    private String serialNumber;

    private Integer materialId;

    private String unit;

    private Long unitConvertRate;

    private Long purchaseQuantity;

    private Long deliveredQuantity;

    private Long unitPrice;

    private Long price;

    private String makePropertyCode;

    private String makeCode;

    private String remark;

    private Integer deliveryDate;

    private String settleCode;

    private Integer supplierId;

    private String confirmationCode;

    private Integer warehouseId;

    private Integer created;

    private Integer updated;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getPurchaseBillDetailId() {
        return purchaseBillDetailId;
    }

    public void setPurchaseBillDetailId(Integer purchaseBillDetailId) {
        this.purchaseBillDetailId = purchaseBillDetailId;
    }

    public Integer getPurchaseBillId() {
        return purchaseBillId;
    }

    public void setPurchaseBillId(Integer purchaseBillId) {
        this.purchaseBillId = purchaseBillId;
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

    public Integer getPurchaseCode() {
        return purchaseCode;
    }

    public void setPurchaseCode(Integer purchaseCode) {
        this.purchaseCode = purchaseCode;
    }

    public Integer getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Integer purchaseDate) {
        this.purchaseDate = purchaseDate;
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

    public Long getUnitConvertRate() {
        return unitConvertRate;
    }

    public void setUnitConvertRate(Long unitConvertRate) {
        this.unitConvertRate = unitConvertRate;
    }

    public Long getPurchaseQuantity() {
        return purchaseQuantity;
    }

    public void setPurchaseQuantity(Long purchaseQuantity) {
        this.purchaseQuantity = purchaseQuantity;
    }

    public Long getDeliveredQuantity() {
        return deliveredQuantity;
    }

    public void setDeliveredQuantity(Long deliveredQuantity) {
        this.deliveredQuantity = deliveredQuantity;
    }

    public Long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getMakePropertyCode() {
        return makePropertyCode;
    }

    public void setMakePropertyCode(String makePropertyCode) {
        this.makePropertyCode = makePropertyCode == null ? null : makePropertyCode.trim();
    }

    public String getMakeCode() {
        return makeCode;
    }

    public void setMakeCode(String makeCode) {
        this.makeCode = makeCode == null ? null : makeCode.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getConfirmationCode() {
        return confirmationCode;
    }

    public void setConfirmationCode(String confirmationCode) {
        this.confirmationCode = confirmationCode == null ? null : confirmationCode.trim();
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
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
        sb.append(", purchaseBillDetailId=").append(purchaseBillDetailId);
        sb.append(", purchaseBillId=").append(purchaseBillId);
        sb.append(", erpId=").append(erpId);
        sb.append(", propertyId=").append(propertyId);
        sb.append(", purchaseCode=").append(purchaseCode);
        sb.append(", purchaseDate=").append(purchaseDate);
        sb.append(", code=").append(code);
        sb.append(", serialNumber=").append(serialNumber);
        sb.append(", materialId=").append(materialId);
        sb.append(", unit=").append(unit);
        sb.append(", unitConvertRate=").append(unitConvertRate);
        sb.append(", purchaseQuantity=").append(purchaseQuantity);
        sb.append(", deliveredQuantity=").append(deliveredQuantity);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append(", price=").append(price);
        sb.append(", makePropertyCode=").append(makePropertyCode);
        sb.append(", makeCode=").append(makeCode);
        sb.append(", remark=").append(remark);
        sb.append(", deliveryDate=").append(deliveryDate);
        sb.append(", settleCode=").append(settleCode);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", confirmationCode=").append(confirmationCode);
        sb.append(", warehouseId=").append(warehouseId);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}