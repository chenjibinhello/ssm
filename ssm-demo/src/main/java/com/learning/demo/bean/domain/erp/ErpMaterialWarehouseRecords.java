package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpMaterialWarehouseRecords implements Serializable {
    private Integer recordId;

    private Integer erpId;

    private Integer materialId;

    private Integer warehouseId;

    private String storageLocation;

    private Long stockQuantity;

    private Long monthQuantity;

    private Integer lastCheckDate;

    private Boolean lastCheckExistChange;

    private Integer created;

    private Integer updated;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
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

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation == null ? null : storageLocation.trim();
    }

    public Long getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Long stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public Long getMonthQuantity() {
        return monthQuantity;
    }

    public void setMonthQuantity(Long monthQuantity) {
        this.monthQuantity = monthQuantity;
    }

    public Integer getLastCheckDate() {
        return lastCheckDate;
    }

    public void setLastCheckDate(Integer lastCheckDate) {
        this.lastCheckDate = lastCheckDate;
    }

    public Boolean getLastCheckExistChange() {
        return lastCheckExistChange;
    }

    public void setLastCheckExistChange(Boolean lastCheckExistChange) {
        this.lastCheckExistChange = lastCheckExistChange;
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
        sb.append(", recordId=").append(recordId);
        sb.append(", erpId=").append(erpId);
        sb.append(", materialId=").append(materialId);
        sb.append(", warehouseId=").append(warehouseId);
        sb.append(", storageLocation=").append(storageLocation);
        sb.append(", stockQuantity=").append(stockQuantity);
        sb.append(", monthQuantity=").append(monthQuantity);
        sb.append(", lastCheckDate=").append(lastCheckDate);
        sb.append(", lastCheckExistChange=").append(lastCheckExistChange);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}