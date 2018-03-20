package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpMaterialMonthlyStatistics implements Serializable {
    private Integer statisticId;

    private Integer erpId;

    private Integer materialId;

    private Integer date;

    private Long monthQuantity;

    private Long monthCost;

    private Integer warehouseId;

    private Long monthStock;

    private Long storageinStock;

    private Long storageinPrice;

    private Long salesStock;

    private Long salesPrice;

    private Long requestStock;

    private Long requestPrice;

    private Long transferStock;

    private Long transferPrice;

    private Long adjustStock;

    private Long adjustPrice;

    private Byte isUpdated;

    private Integer created;

    private Integer updated;

    private Integer isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getStatisticId() {
        return statisticId;
    }

    public void setStatisticId(Integer statisticId) {
        this.statisticId = statisticId;
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

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public Long getMonthQuantity() {
        return monthQuantity;
    }

    public void setMonthQuantity(Long monthQuantity) {
        this.monthQuantity = monthQuantity;
    }

    public Long getMonthCost() {
        return monthCost;
    }

    public void setMonthCost(Long monthCost) {
        this.monthCost = monthCost;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Long getMonthStock() {
        return monthStock;
    }

    public void setMonthStock(Long monthStock) {
        this.monthStock = monthStock;
    }

    public Long getStorageinStock() {
        return storageinStock;
    }

    public void setStorageinStock(Long storageinStock) {
        this.storageinStock = storageinStock;
    }

    public Long getStorageinPrice() {
        return storageinPrice;
    }

    public void setStorageinPrice(Long storageinPrice) {
        this.storageinPrice = storageinPrice;
    }

    public Long getSalesStock() {
        return salesStock;
    }

    public void setSalesStock(Long salesStock) {
        this.salesStock = salesStock;
    }

    public Long getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(Long salesPrice) {
        this.salesPrice = salesPrice;
    }

    public Long getRequestStock() {
        return requestStock;
    }

    public void setRequestStock(Long requestStock) {
        this.requestStock = requestStock;
    }

    public Long getRequestPrice() {
        return requestPrice;
    }

    public void setRequestPrice(Long requestPrice) {
        this.requestPrice = requestPrice;
    }

    public Long getTransferStock() {
        return transferStock;
    }

    public void setTransferStock(Long transferStock) {
        this.transferStock = transferStock;
    }

    public Long getTransferPrice() {
        return transferPrice;
    }

    public void setTransferPrice(Long transferPrice) {
        this.transferPrice = transferPrice;
    }

    public Long getAdjustStock() {
        return adjustStock;
    }

    public void setAdjustStock(Long adjustStock) {
        this.adjustStock = adjustStock;
    }

    public Long getAdjustPrice() {
        return adjustPrice;
    }

    public void setAdjustPrice(Long adjustPrice) {
        this.adjustPrice = adjustPrice;
    }

    public Byte getIsUpdated() {
        return isUpdated;
    }

    public void setIsUpdated(Byte isUpdated) {
        this.isUpdated = isUpdated;
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

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", statisticId=").append(statisticId);
        sb.append(", erpId=").append(erpId);
        sb.append(", materialId=").append(materialId);
        sb.append(", date=").append(date);
        sb.append(", monthQuantity=").append(monthQuantity);
        sb.append(", monthCost=").append(monthCost);
        sb.append(", warehouseId=").append(warehouseId);
        sb.append(", monthStock=").append(monthStock);
        sb.append(", storageinStock=").append(storageinStock);
        sb.append(", storageinPrice=").append(storageinPrice);
        sb.append(", salesStock=").append(salesStock);
        sb.append(", salesPrice=").append(salesPrice);
        sb.append(", requestStock=").append(requestStock);
        sb.append(", requestPrice=").append(requestPrice);
        sb.append(", transferStock=").append(transferStock);
        sb.append(", transferPrice=").append(transferPrice);
        sb.append(", adjustStock=").append(adjustStock);
        sb.append(", adjustPrice=").append(adjustPrice);
        sb.append(", isUpdated=").append(isUpdated);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}