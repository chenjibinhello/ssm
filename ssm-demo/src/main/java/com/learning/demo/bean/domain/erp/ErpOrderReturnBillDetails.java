package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpOrderReturnBillDetails implements Serializable {
    private Integer returnBillDetailId;

    private Integer returnBillId;

    private Integer erpId;

    private Integer propertyId;

    private String serialNumber;

    private Integer materialId;

    private String unit;

    private Long convertRate;

    private Integer returnWarehouseId;

    private Long quantity;

    private Long unitPrice;

    private Long price;

    private Integer saleBillDetailId;

    private Integer customerBillDetailId;

    private Integer batchId;

    private String remark;

    private String confirmationCode;

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

    public Long getConvertRate() {
        return convertRate;
    }

    public void setConvertRate(Long convertRate) {
        this.convertRate = convertRate;
    }

    public Integer getReturnWarehouseId() {
        return returnWarehouseId;
    }

    public void setReturnWarehouseId(Integer returnWarehouseId) {
        this.returnWarehouseId = returnWarehouseId;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
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

    public Integer getSaleBillDetailId() {
        return saleBillDetailId;
    }

    public void setSaleBillDetailId(Integer saleBillDetailId) {
        this.saleBillDetailId = saleBillDetailId;
    }

    public Integer getCustomerBillDetailId() {
        return customerBillDetailId;
    }

    public void setCustomerBillDetailId(Integer customerBillDetailId) {
        this.customerBillDetailId = customerBillDetailId;
    }

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
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
        sb.append(", returnBillDetailId=").append(returnBillDetailId);
        sb.append(", returnBillId=").append(returnBillId);
        sb.append(", erpId=").append(erpId);
        sb.append(", propertyId=").append(propertyId);
        sb.append(", serialNumber=").append(serialNumber);
        sb.append(", materialId=").append(materialId);
        sb.append(", unit=").append(unit);
        sb.append(", convertRate=").append(convertRate);
        sb.append(", returnWarehouseId=").append(returnWarehouseId);
        sb.append(", quantity=").append(quantity);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append(", price=").append(price);
        sb.append(", saleBillDetailId=").append(saleBillDetailId);
        sb.append(", customerBillDetailId=").append(customerBillDetailId);
        sb.append(", batchId=").append(batchId);
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