package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpPurchaseCheckbackBills implements Serializable {
    private Integer checkbackBillId;

    private Integer erpId;

    private Integer supplierId;

    private Integer checkbackDate;

    private Integer receiveBillDetailId;

    private Integer materialId;

    private String unit;

    private Long returnQuantity;

    private String remark;

    private Integer created;

    private Integer updated;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getCheckbackBillId() {
        return checkbackBillId;
    }

    public void setCheckbackBillId(Integer checkbackBillId) {
        this.checkbackBillId = checkbackBillId;
    }

    public Integer getErpId() {
        return erpId;
    }

    public void setErpId(Integer erpId) {
        this.erpId = erpId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getCheckbackDate() {
        return checkbackDate;
    }

    public void setCheckbackDate(Integer checkbackDate) {
        this.checkbackDate = checkbackDate;
    }

    public Integer getReceiveBillDetailId() {
        return receiveBillDetailId;
    }

    public void setReceiveBillDetailId(Integer receiveBillDetailId) {
        this.receiveBillDetailId = receiveBillDetailId;
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

    public Long getReturnQuantity() {
        return returnQuantity;
    }

    public void setReturnQuantity(Long returnQuantity) {
        this.returnQuantity = returnQuantity;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
        sb.append(", checkbackBillId=").append(checkbackBillId);
        sb.append(", erpId=").append(erpId);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", checkbackDate=").append(checkbackDate);
        sb.append(", receiveBillDetailId=").append(receiveBillDetailId);
        sb.append(", materialId=").append(materialId);
        sb.append(", unit=").append(unit);
        sb.append(", returnQuantity=").append(returnQuantity);
        sb.append(", remark=").append(remark);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}