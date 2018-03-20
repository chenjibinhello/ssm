package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpInventoryChangeLogs implements Serializable {
    private Integer logId;

    private Integer erpId;

    private Byte source;

    private Integer materialId;

    private Integer date;

    private String io;

    private Integer propertyId;

    private Integer billId;

    private String serialNumber;

    private Integer warehouseId;

    private Long quantity;

    private Long unitCost;

    private Long price;

    private Integer batchId;

    private String remark;

    private Byte changeType;

    private String costCode;

    private Byte isUpdated;

    private Long beforeMaterialQuantity;

    private Long afterMaterialQuantity;

    private Long beforeWarehouseQuantity;

    private Long afterWarehouseQuantity;

    private Integer created;

    private Integer updated;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Integer getErpId() {
        return erpId;
    }

    public void setErpId(Integer erpId) {
        this.erpId = erpId;
    }

    public Byte getSource() {
        return source;
    }

    public void setSource(Byte source) {
        this.source = source;
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

    public String getIo() {
        return io;
    }

    public void setIo(String io) {
        this.io = io == null ? null : io.trim();
    }

    public Integer getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
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

    public Long getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(Long unitCost) {
        this.unitCost = unitCost;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
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

    public Byte getChangeType() {
        return changeType;
    }

    public void setChangeType(Byte changeType) {
        this.changeType = changeType;
    }

    public String getCostCode() {
        return costCode;
    }

    public void setCostCode(String costCode) {
        this.costCode = costCode == null ? null : costCode.trim();
    }

    public Byte getIsUpdated() {
        return isUpdated;
    }

    public void setIsUpdated(Byte isUpdated) {
        this.isUpdated = isUpdated;
    }

    public Long getBeforeMaterialQuantity() {
        return beforeMaterialQuantity;
    }

    public void setBeforeMaterialQuantity(Long beforeMaterialQuantity) {
        this.beforeMaterialQuantity = beforeMaterialQuantity;
    }

    public Long getAfterMaterialQuantity() {
        return afterMaterialQuantity;
    }

    public void setAfterMaterialQuantity(Long afterMaterialQuantity) {
        this.afterMaterialQuantity = afterMaterialQuantity;
    }

    public Long getBeforeWarehouseQuantity() {
        return beforeWarehouseQuantity;
    }

    public void setBeforeWarehouseQuantity(Long beforeWarehouseQuantity) {
        this.beforeWarehouseQuantity = beforeWarehouseQuantity;
    }

    public Long getAfterWarehouseQuantity() {
        return afterWarehouseQuantity;
    }

    public void setAfterWarehouseQuantity(Long afterWarehouseQuantity) {
        this.afterWarehouseQuantity = afterWarehouseQuantity;
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
        sb.append(", logId=").append(logId);
        sb.append(", erpId=").append(erpId);
        sb.append(", source=").append(source);
        sb.append(", materialId=").append(materialId);
        sb.append(", date=").append(date);
        sb.append(", io=").append(io);
        sb.append(", propertyId=").append(propertyId);
        sb.append(", billId=").append(billId);
        sb.append(", serialNumber=").append(serialNumber);
        sb.append(", warehouseId=").append(warehouseId);
        sb.append(", quantity=").append(quantity);
        sb.append(", unitCost=").append(unitCost);
        sb.append(", price=").append(price);
        sb.append(", batchId=").append(batchId);
        sb.append(", remark=").append(remark);
        sb.append(", changeType=").append(changeType);
        sb.append(", costCode=").append(costCode);
        sb.append(", isUpdated=").append(isUpdated);
        sb.append(", beforeMaterialQuantity=").append(beforeMaterialQuantity);
        sb.append(", afterMaterialQuantity=").append(afterMaterialQuantity);
        sb.append(", beforeWarehouseQuantity=").append(beforeWarehouseQuantity);
        sb.append(", afterWarehouseQuantity=").append(afterWarehouseQuantity);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}