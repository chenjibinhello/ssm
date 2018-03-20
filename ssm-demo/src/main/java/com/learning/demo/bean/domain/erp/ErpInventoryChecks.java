package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpInventoryChecks implements Serializable {
    private Integer checkId;

    private Integer erpId;

    private Integer materialId;

    private Integer warehouseId;

    private Long accountAmount;

    private Long checkAmount;

    private String manuscriptNumber;

    private String manuscriptOrder;

    private Integer checkDate;

    private Long unitCost;

    private String isUpdated;

    private Integer billPropertyId;

    private String billNumber;

    private String billOrder;

    private Integer batchId;

    private String isBatch;

    private Integer created;

    private Integer updated;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getCheckId() {
        return checkId;
    }

    public void setCheckId(Integer checkId) {
        this.checkId = checkId;
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

    public Long getAccountAmount() {
        return accountAmount;
    }

    public void setAccountAmount(Long accountAmount) {
        this.accountAmount = accountAmount;
    }

    public Long getCheckAmount() {
        return checkAmount;
    }

    public void setCheckAmount(Long checkAmount) {
        this.checkAmount = checkAmount;
    }

    public String getManuscriptNumber() {
        return manuscriptNumber;
    }

    public void setManuscriptNumber(String manuscriptNumber) {
        this.manuscriptNumber = manuscriptNumber == null ? null : manuscriptNumber.trim();
    }

    public String getManuscriptOrder() {
        return manuscriptOrder;
    }

    public void setManuscriptOrder(String manuscriptOrder) {
        this.manuscriptOrder = manuscriptOrder == null ? null : manuscriptOrder.trim();
    }

    public Integer getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Integer checkDate) {
        this.checkDate = checkDate;
    }

    public Long getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(Long unitCost) {
        this.unitCost = unitCost;
    }

    public String getIsUpdated() {
        return isUpdated;
    }

    public void setIsUpdated(String isUpdated) {
        this.isUpdated = isUpdated == null ? null : isUpdated.trim();
    }

    public Integer getBillPropertyId() {
        return billPropertyId;
    }

    public void setBillPropertyId(Integer billPropertyId) {
        this.billPropertyId = billPropertyId;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber == null ? null : billNumber.trim();
    }

    public String getBillOrder() {
        return billOrder;
    }

    public void setBillOrder(String billOrder) {
        this.billOrder = billOrder == null ? null : billOrder.trim();
    }

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    public String getIsBatch() {
        return isBatch;
    }

    public void setIsBatch(String isBatch) {
        this.isBatch = isBatch == null ? null : isBatch.trim();
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
        sb.append(", checkId=").append(checkId);
        sb.append(", erpId=").append(erpId);
        sb.append(", materialId=").append(materialId);
        sb.append(", warehouseId=").append(warehouseId);
        sb.append(", accountAmount=").append(accountAmount);
        sb.append(", checkAmount=").append(checkAmount);
        sb.append(", manuscriptNumber=").append(manuscriptNumber);
        sb.append(", manuscriptOrder=").append(manuscriptOrder);
        sb.append(", checkDate=").append(checkDate);
        sb.append(", unitCost=").append(unitCost);
        sb.append(", isUpdated=").append(isUpdated);
        sb.append(", billPropertyId=").append(billPropertyId);
        sb.append(", billNumber=").append(billNumber);
        sb.append(", billOrder=").append(billOrder);
        sb.append(", batchId=").append(batchId);
        sb.append(", isBatch=").append(isBatch);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}