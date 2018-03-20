package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpInventoryBatches implements Serializable {
    private Integer batchId;

    private Integer erpId;

    private Integer materialId;

    private String batchNumber;

    private String billPropertyCode;

    private String billNumber;

    private String remark;

    private Integer storageDate;

    private Integer effectiveDate;

    private Integer recheckDate;

    private String settleMethod;

    private Integer created;

    private Integer updated;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
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

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber == null ? null : batchNumber.trim();
    }

    public String getBillPropertyCode() {
        return billPropertyCode;
    }

    public void setBillPropertyCode(String billPropertyCode) {
        this.billPropertyCode = billPropertyCode == null ? null : billPropertyCode.trim();
    }

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber == null ? null : billNumber.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getStorageDate() {
        return storageDate;
    }

    public void setStorageDate(Integer storageDate) {
        this.storageDate = storageDate;
    }

    public Integer getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Integer effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Integer getRecheckDate() {
        return recheckDate;
    }

    public void setRecheckDate(Integer recheckDate) {
        this.recheckDate = recheckDate;
    }

    public String getSettleMethod() {
        return settleMethod;
    }

    public void setSettleMethod(String settleMethod) {
        this.settleMethod = settleMethod == null ? null : settleMethod.trim();
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
        sb.append(", batchId=").append(batchId);
        sb.append(", erpId=").append(erpId);
        sb.append(", materialId=").append(materialId);
        sb.append(", batchNumber=").append(batchNumber);
        sb.append(", billPropertyCode=").append(billPropertyCode);
        sb.append(", billNumber=").append(billNumber);
        sb.append(", remark=").append(remark);
        sb.append(", storageDate=").append(storageDate);
        sb.append(", effectiveDate=").append(effectiveDate);
        sb.append(", recheckDate=").append(recheckDate);
        sb.append(", settleMethod=").append(settleMethod);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}