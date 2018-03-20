package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpOrderSaleForecasts implements Serializable {
    private Integer saleForecastId;

    private Integer erpId;

    private Integer materialId;

    private Integer saleDate;

    private String marketCode;

    private Integer warehouseId;

    private Long saleQuantity;

    private Long orderQuantity;

    private Integer currencyId;

    private Long unitPrice;

    private Integer created;

    private Integer updated;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getSaleForecastId() {
        return saleForecastId;
    }

    public void setSaleForecastId(Integer saleForecastId) {
        this.saleForecastId = saleForecastId;
    }

    public Integer getErpId() {
        return erpId;
    }

    public void setErpId(Integer erpId) {
        this.erpId = erpId;
    }

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    public Integer getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Integer saleDate) {
        this.saleDate = saleDate;
    }

    public String getMarketCode() {
        return marketCode;
    }

    public void setMarketCode(String marketCode) {
        this.marketCode = marketCode == null ? null : marketCode.trim();
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Long getSaleQuantity() {
        return saleQuantity;
    }

    public void setSaleQuantity(Long saleQuantity) {
        this.saleQuantity = saleQuantity;
    }

    public Long getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(Long orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public Integer getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public Long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
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
        sb.append(", saleForecastId=").append(saleForecastId);
        sb.append(", erpId=").append(erpId);
        sb.append(", materialId=").append(materialId);
        sb.append(", saleDate=").append(saleDate);
        sb.append(", marketCode=").append(marketCode);
        sb.append(", warehouseId=").append(warehouseId);
        sb.append(", saleQuantity=").append(saleQuantity);
        sb.append(", orderQuantity=").append(orderQuantity);
        sb.append(", currencyId=").append(currencyId);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}