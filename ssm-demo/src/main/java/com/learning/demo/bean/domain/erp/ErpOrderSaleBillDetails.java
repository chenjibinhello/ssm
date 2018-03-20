package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpOrderSaleBillDetails implements Serializable {
    private Integer saleBillDetailId;

    private Integer saleBillId;

    private Integer erpId;

    private Integer propertyId;

    private String saleBillCode;

    private String serialNumber;

    private Integer materialId;

    private String unit;

    private Long convertRate;

    private Integer deliverWarehouseId;

    private Long quantity;

    private Long unitPrice;

    private Long price;

    private Integer customerBillDetailId;

    private Integer batchId;

    private String remark;

    private Integer customerId;

    private Integer saleDate;

    private String confirmationCode;

    private Integer created;

    private Integer updated;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getSaleBillDetailId() {
        return saleBillDetailId;
    }

    public void setSaleBillDetailId(Integer saleBillDetailId) {
        this.saleBillDetailId = saleBillDetailId;
    }

    public Integer getSaleBillId() {
        return saleBillId;
    }

    public void setSaleBillId(Integer saleBillId) {
        this.saleBillId = saleBillId;
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

    public String getSaleBillCode() {
        return saleBillCode;
    }

    public void setSaleBillCode(String saleBillCode) {
        this.saleBillCode = saleBillCode == null ? null : saleBillCode.trim();
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

    public Integer getDeliverWarehouseId() {
        return deliverWarehouseId;
    }

    public void setDeliverWarehouseId(Integer deliverWarehouseId) {
        this.deliverWarehouseId = deliverWarehouseId;
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

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Integer saleDate) {
        this.saleDate = saleDate;
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
        sb.append(", saleBillDetailId=").append(saleBillDetailId);
        sb.append(", saleBillId=").append(saleBillId);
        sb.append(", erpId=").append(erpId);
        sb.append(", propertyId=").append(propertyId);
        sb.append(", saleBillCode=").append(saleBillCode);
        sb.append(", serialNumber=").append(serialNumber);
        sb.append(", materialId=").append(materialId);
        sb.append(", unit=").append(unit);
        sb.append(", convertRate=").append(convertRate);
        sb.append(", deliverWarehouseId=").append(deliverWarehouseId);
        sb.append(", quantity=").append(quantity);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append(", price=").append(price);
        sb.append(", customerBillDetailId=").append(customerBillDetailId);
        sb.append(", batchId=").append(batchId);
        sb.append(", remark=").append(remark);
        sb.append(", customerId=").append(customerId);
        sb.append(", saleDate=").append(saleDate);
        sb.append(", confirmationCode=").append(confirmationCode);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}