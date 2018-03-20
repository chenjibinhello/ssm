package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpInventoryBillPropertySigns implements Serializable {
    private Integer signId;

    private Integer erpId;

    private Boolean systemType;

    private Integer propertyId;

    private String columnOne;

    private String columnTwo;

    private String columnThree;

    private String remark;

    private Integer created;

    private Integer updated;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getSignId() {
        return signId;
    }

    public void setSignId(Integer signId) {
        this.signId = signId;
    }

    public Integer getErpId() {
        return erpId;
    }

    public void setErpId(Integer erpId) {
        this.erpId = erpId;
    }

    public Boolean getSystemType() {
        return systemType;
    }

    public void setSystemType(Boolean systemType) {
        this.systemType = systemType;
    }

    public Integer getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    public String getColumnOne() {
        return columnOne;
    }

    public void setColumnOne(String columnOne) {
        this.columnOne = columnOne == null ? null : columnOne.trim();
    }

    public String getColumnTwo() {
        return columnTwo;
    }

    public void setColumnTwo(String columnTwo) {
        this.columnTwo = columnTwo == null ? null : columnTwo.trim();
    }

    public String getColumnThree() {
        return columnThree;
    }

    public void setColumnThree(String columnThree) {
        this.columnThree = columnThree == null ? null : columnThree.trim();
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
        sb.append(", signId=").append(signId);
        sb.append(", erpId=").append(erpId);
        sb.append(", systemType=").append(systemType);
        sb.append(", propertyId=").append(propertyId);
        sb.append(", columnOne=").append(columnOne);
        sb.append(", columnTwo=").append(columnTwo);
        sb.append(", columnThree=").append(columnThree);
        sb.append(", remark=").append(remark);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}