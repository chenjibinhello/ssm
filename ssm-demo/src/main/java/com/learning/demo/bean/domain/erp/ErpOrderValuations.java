package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpOrderValuations implements Serializable {
    private Integer valuationId;

    private Integer erpId;

    private Integer customerId;

    private Integer materialId;

    private String unit;

    private Integer checkDate;

    private Integer lastSaleDate;

    private Integer currencyId;

    private Long price;

    private String customerCode;

    private Integer created;

    private Integer updated;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getValuationId() {
        return valuationId;
    }

    public void setValuationId(Integer valuationId) {
        this.valuationId = valuationId;
    }

    public Integer getErpId() {
        return erpId;
    }

    public void setErpId(Integer erpId) {
        this.erpId = erpId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
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

    public Integer getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Integer checkDate) {
        this.checkDate = checkDate;
    }

    public Integer getLastSaleDate() {
        return lastSaleDate;
    }

    public void setLastSaleDate(Integer lastSaleDate) {
        this.lastSaleDate = lastSaleDate;
    }

    public Integer getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode == null ? null : customerCode.trim();
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
        sb.append(", valuationId=").append(valuationId);
        sb.append(", erpId=").append(erpId);
        sb.append(", customerId=").append(customerId);
        sb.append(", materialId=").append(materialId);
        sb.append(", unit=").append(unit);
        sb.append(", checkDate=").append(checkDate);
        sb.append(", lastSaleDate=").append(lastSaleDate);
        sb.append(", currencyId=").append(currencyId);
        sb.append(", price=").append(price);
        sb.append(", customerCode=").append(customerCode);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}