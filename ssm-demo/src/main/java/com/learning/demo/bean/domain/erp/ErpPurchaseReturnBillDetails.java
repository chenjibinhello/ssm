package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpPurchaseReturnBillDetails implements Serializable {
    private Integer returnBillDetailId;

    private Integer returnBillId;

    private Integer erpId;

    private Integer propertyId;

    private Integer code;

    private Integer returnDate;

    private String serialNumber;

    private Integer supplierId;

    private Integer materialId;

    private String unit;

    private Long unitConvertRate;

    private Long unitPrice;

    private Long rmbUnitPrice;

    private Long price;

    private Long rmbPrice;

    private Long returnQuantity;

    private String remark;

    private Integer warehouseId;

    private Long batchId;

    private String confirmationCode;

    private Integer originReceiveBillId;

    private Integer originPurchaseBillDetailId;

    private Integer created;

    private Integer updated;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getReturnBillDetailId() {
        return returnBillDetailId;
    }

    public void setReturnBillDetailId(Integer returnBillDetailId) {
        this.returnBillDetailId = returnBillDetailId;
    }

    public Integer getReturnBillId() {
        return returnBillId;
    }

    public void setReturnBillId(Integer returnBillId) {
        this.returnBillId = returnBillId;
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

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Integer returnDate) {
        this.returnDate = returnDate;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
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

    public Long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Long getRmbUnitPrice() {
        return rmbUnitPrice;
    }

    public void setRmbUnitPrice(Long rmbUnitPrice) {
        this.rmbUnitPrice = rmbUnitPrice;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getRmbPrice() {
        return rmbPrice;
    }

    public void setRmbPrice(Long rmbPrice) {
        this.rmbPrice = rmbPrice;
    }

    public Long getReturnQuantity() {
        return returnQuantity;
    }

    public void setReturnQuantity(Long returnQuantity) {
        this.returnQuantity = returnQuantity;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public String getConfirmationCode() {
        return confirmationCode;
    }

    public void setConfirmationCode(String confirmationCode) {
        this.confirmationCode = confirmationCode == null ? null : confirmationCode.trim();
    }

    public Integer getOriginReceiveBillId() {
        return originReceiveBillId;
    }

    public void setOriginReceiveBillId(Integer originReceiveBillId) {
        this.originReceiveBillId = originReceiveBillId;
    }

    public Integer getOriginPurchaseBillDetailId() {
        return originPurchaseBillDetailId;
    }

    public void setOriginPurchaseBillDetailId(Integer originPurchaseBillDetailId) {
        this.originPurchaseBillDetailId = originPurchaseBillDetailId;
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
        sb.append(", returnBillDetailId=").append(returnBillDetailId);
        sb.append(", returnBillId=").append(returnBillId);
        sb.append(", erpId=").append(erpId);
        sb.append(", propertyId=").append(propertyId);
        sb.append(", code=").append(code);
        sb.append(", returnDate=").append(returnDate);
        sb.append(", serialNumber=").append(serialNumber);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", materialId=").append(materialId);
        sb.append(", unit=").append(unit);
        sb.append(", unitConvertRate=").append(unitConvertRate);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append(", rmbUnitPrice=").append(rmbUnitPrice);
        sb.append(", price=").append(price);
        sb.append(", rmbPrice=").append(rmbPrice);
        sb.append(", returnQuantity=").append(returnQuantity);
        sb.append(", remark=").append(remark);
        sb.append(", warehouseId=").append(warehouseId);
        sb.append(", batchId=").append(batchId);
        sb.append(", confirmationCode=").append(confirmationCode);
        sb.append(", originReceiveBillId=").append(originReceiveBillId);
        sb.append(", originPurchaseBillDetailId=").append(originPurchaseBillDetailId);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}