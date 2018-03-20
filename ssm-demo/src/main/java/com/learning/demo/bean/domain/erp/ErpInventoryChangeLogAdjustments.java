package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpInventoryChangeLogAdjustments implements Serializable {
    private Integer adjustmentId;

    private Integer erpId;

    private Byte adjustType;

    private Integer logId;

    private Integer oldMaterialId;

    private Integer newMaterialId;

    private Integer oldDate;

    private Integer newDate;

    private String oldIo;

    private String newIo;

    private Integer oldPropertyId;

    private Integer newPropertyId;

    private Integer oldBillId;

    private Integer newBillId;

    private String oldSerialNumber;

    private String newSerialNumber;

    private Integer oldWarehouseId;

    private Integer newWarehouseId;

    private Long oldQuantity;

    private Long newQuantity;

    private Long oldUnitCost;

    private Long newUnitCost;

    private Long oldPrice;

    private Long newPrice;

    private Integer oldBatchId;

    private Integer newBatchId;

    private String oldRemark;

    private String newRemark;

    private Byte oldChangeType;

    private Byte newChangeType;

    private String oldCostCode;

    private String newCostCode;

    private Integer created;

    private Integer updated;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getAdjustmentId() {
        return adjustmentId;
    }

    public void setAdjustmentId(Integer adjustmentId) {
        this.adjustmentId = adjustmentId;
    }

    public Integer getErpId() {
        return erpId;
    }

    public void setErpId(Integer erpId) {
        this.erpId = erpId;
    }

    public Byte getAdjustType() {
        return adjustType;
    }

    public void setAdjustType(Byte adjustType) {
        this.adjustType = adjustType;
    }

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Integer getOldMaterialId() {
        return oldMaterialId;
    }

    public void setOldMaterialId(Integer oldMaterialId) {
        this.oldMaterialId = oldMaterialId;
    }

    public Integer getNewMaterialId() {
        return newMaterialId;
    }

    public void setNewMaterialId(Integer newMaterialId) {
        this.newMaterialId = newMaterialId;
    }

    public Integer getOldDate() {
        return oldDate;
    }

    public void setOldDate(Integer oldDate) {
        this.oldDate = oldDate;
    }

    public Integer getNewDate() {
        return newDate;
    }

    public void setNewDate(Integer newDate) {
        this.newDate = newDate;
    }

    public String getOldIo() {
        return oldIo;
    }

    public void setOldIo(String oldIo) {
        this.oldIo = oldIo == null ? null : oldIo.trim();
    }

    public String getNewIo() {
        return newIo;
    }

    public void setNewIo(String newIo) {
        this.newIo = newIo == null ? null : newIo.trim();
    }

    public Integer getOldPropertyId() {
        return oldPropertyId;
    }

    public void setOldPropertyId(Integer oldPropertyId) {
        this.oldPropertyId = oldPropertyId;
    }

    public Integer getNewPropertyId() {
        return newPropertyId;
    }

    public void setNewPropertyId(Integer newPropertyId) {
        this.newPropertyId = newPropertyId;
    }

    public Integer getOldBillId() {
        return oldBillId;
    }

    public void setOldBillId(Integer oldBillId) {
        this.oldBillId = oldBillId;
    }

    public Integer getNewBillId() {
        return newBillId;
    }

    public void setNewBillId(Integer newBillId) {
        this.newBillId = newBillId;
    }

    public String getOldSerialNumber() {
        return oldSerialNumber;
    }

    public void setOldSerialNumber(String oldSerialNumber) {
        this.oldSerialNumber = oldSerialNumber == null ? null : oldSerialNumber.trim();
    }

    public String getNewSerialNumber() {
        return newSerialNumber;
    }

    public void setNewSerialNumber(String newSerialNumber) {
        this.newSerialNumber = newSerialNumber == null ? null : newSerialNumber.trim();
    }

    public Integer getOldWarehouseId() {
        return oldWarehouseId;
    }

    public void setOldWarehouseId(Integer oldWarehouseId) {
        this.oldWarehouseId = oldWarehouseId;
    }

    public Integer getNewWarehouseId() {
        return newWarehouseId;
    }

    public void setNewWarehouseId(Integer newWarehouseId) {
        this.newWarehouseId = newWarehouseId;
    }

    public Long getOldQuantity() {
        return oldQuantity;
    }

    public void setOldQuantity(Long oldQuantity) {
        this.oldQuantity = oldQuantity;
    }

    public Long getNewQuantity() {
        return newQuantity;
    }

    public void setNewQuantity(Long newQuantity) {
        this.newQuantity = newQuantity;
    }

    public Long getOldUnitCost() {
        return oldUnitCost;
    }

    public void setOldUnitCost(Long oldUnitCost) {
        this.oldUnitCost = oldUnitCost;
    }

    public Long getNewUnitCost() {
        return newUnitCost;
    }

    public void setNewUnitCost(Long newUnitCost) {
        this.newUnitCost = newUnitCost;
    }

    public Long getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(Long oldPrice) {
        this.oldPrice = oldPrice;
    }

    public Long getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(Long newPrice) {
        this.newPrice = newPrice;
    }

    public Integer getOldBatchId() {
        return oldBatchId;
    }

    public void setOldBatchId(Integer oldBatchId) {
        this.oldBatchId = oldBatchId;
    }

    public Integer getNewBatchId() {
        return newBatchId;
    }

    public void setNewBatchId(Integer newBatchId) {
        this.newBatchId = newBatchId;
    }

    public String getOldRemark() {
        return oldRemark;
    }

    public void setOldRemark(String oldRemark) {
        this.oldRemark = oldRemark == null ? null : oldRemark.trim();
    }

    public String getNewRemark() {
        return newRemark;
    }

    public void setNewRemark(String newRemark) {
        this.newRemark = newRemark == null ? null : newRemark.trim();
    }

    public Byte getOldChangeType() {
        return oldChangeType;
    }

    public void setOldChangeType(Byte oldChangeType) {
        this.oldChangeType = oldChangeType;
    }

    public Byte getNewChangeType() {
        return newChangeType;
    }

    public void setNewChangeType(Byte newChangeType) {
        this.newChangeType = newChangeType;
    }

    public String getOldCostCode() {
        return oldCostCode;
    }

    public void setOldCostCode(String oldCostCode) {
        this.oldCostCode = oldCostCode == null ? null : oldCostCode.trim();
    }

    public String getNewCostCode() {
        return newCostCode;
    }

    public void setNewCostCode(String newCostCode) {
        this.newCostCode = newCostCode == null ? null : newCostCode.trim();
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
        sb.append(", adjustmentId=").append(adjustmentId);
        sb.append(", erpId=").append(erpId);
        sb.append(", adjustType=").append(adjustType);
        sb.append(", logId=").append(logId);
        sb.append(", oldMaterialId=").append(oldMaterialId);
        sb.append(", newMaterialId=").append(newMaterialId);
        sb.append(", oldDate=").append(oldDate);
        sb.append(", newDate=").append(newDate);
        sb.append(", oldIo=").append(oldIo);
        sb.append(", newIo=").append(newIo);
        sb.append(", oldPropertyId=").append(oldPropertyId);
        sb.append(", newPropertyId=").append(newPropertyId);
        sb.append(", oldBillId=").append(oldBillId);
        sb.append(", newBillId=").append(newBillId);
        sb.append(", oldSerialNumber=").append(oldSerialNumber);
        sb.append(", newSerialNumber=").append(newSerialNumber);
        sb.append(", oldWarehouseId=").append(oldWarehouseId);
        sb.append(", newWarehouseId=").append(newWarehouseId);
        sb.append(", oldQuantity=").append(oldQuantity);
        sb.append(", newQuantity=").append(newQuantity);
        sb.append(", oldUnitCost=").append(oldUnitCost);
        sb.append(", newUnitCost=").append(newUnitCost);
        sb.append(", oldPrice=").append(oldPrice);
        sb.append(", newPrice=").append(newPrice);
        sb.append(", oldBatchId=").append(oldBatchId);
        sb.append(", newBatchId=").append(newBatchId);
        sb.append(", oldRemark=").append(oldRemark);
        sb.append(", newRemark=").append(newRemark);
        sb.append(", oldChangeType=").append(oldChangeType);
        sb.append(", newChangeType=").append(newChangeType);
        sb.append(", oldCostCode=").append(oldCostCode);
        sb.append(", newCostCode=").append(newCostCode);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}