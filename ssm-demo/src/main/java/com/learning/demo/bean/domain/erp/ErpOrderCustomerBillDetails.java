package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpOrderCustomerBillDetails implements Serializable {
    private Integer customerBillDetailId;

    private Integer customerBillId;

    private Integer erpId;

    private Integer propertyId;

    private String code;

    private String serialNumber;

    private Integer materialId;

    private String unit;

    private Long orderQuantity;

    private Long deliveredQuantity;

    private Long unitPrice;

    private Long price;

    private Integer deliveryDate;

    private String settleCode;

    private String remark;

    private String marketCode;

    private Integer forecastDate;

    private Integer forecastWarehouseId;

    private Integer customerId;

    private Integer deliverWarehouseId;

    private String confirmationCode;

    private Integer created;

    private Integer updated;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getCustomerBillDetailId() {
        return customerBillDetailId;
    }

    public void setCustomerBillDetailId(Integer customerBillDetailId) {
        this.customerBillDetailId = customerBillDetailId;
    }

    public Integer getCustomerBillId() {
        return customerBillId;
    }

    public void setCustomerBillId(Integer customerBillId) {
        this.customerBillId = customerBillId;
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

    public Long getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(Long orderQuantity) {
        this.orderQuantity = orderQuantity;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getMarketCode() {
        return marketCode;
    }

    public void setMarketCode(String marketCode) {
        this.marketCode = marketCode == null ? null : marketCode.trim();
    }

    public Integer getForecastDate() {
        return forecastDate;
    }

    public void setForecastDate(Integer forecastDate) {
        this.forecastDate = forecastDate;
    }

    public Integer getForecastWarehouseId() {
        return forecastWarehouseId;
    }

    public void setForecastWarehouseId(Integer forecastWarehouseId) {
        this.forecastWarehouseId = forecastWarehouseId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getDeliverWarehouseId() {
        return deliverWarehouseId;
    }

    public void setDeliverWarehouseId(Integer deliverWarehouseId) {
        this.deliverWarehouseId = deliverWarehouseId;
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
        sb.append(", customerBillDetailId=").append(customerBillDetailId);
        sb.append(", customerBillId=").append(customerBillId);
        sb.append(", erpId=").append(erpId);
        sb.append(", propertyId=").append(propertyId);
        sb.append(", code=").append(code);
        sb.append(", serialNumber=").append(serialNumber);
        sb.append(", materialId=").append(materialId);
        sb.append(", unit=").append(unit);
        sb.append(", orderQuantity=").append(orderQuantity);
        sb.append(", deliveredQuantity=").append(deliveredQuantity);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append(", price=").append(price);
        sb.append(", deliveryDate=").append(deliveryDate);
        sb.append(", settleCode=").append(settleCode);
        sb.append(", remark=").append(remark);
        sb.append(", marketCode=").append(marketCode);
        sb.append(", forecastDate=").append(forecastDate);
        sb.append(", forecastWarehouseId=").append(forecastWarehouseId);
        sb.append(", customerId=").append(customerId);
        sb.append(", deliverWarehouseId=").append(deliverWarehouseId);
        sb.append(", confirmationCode=").append(confirmationCode);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}