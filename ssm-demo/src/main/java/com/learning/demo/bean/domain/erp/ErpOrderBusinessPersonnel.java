package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpOrderBusinessPersonnel implements Serializable {
    private Integer businessPersonnelId;

    private Integer erpId;

    private String code;

    private String name;

    private Integer departmentId;

    private String remark;

    private Integer created;

    private Integer updated;

    private Boolean isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getBusinessPersonnelId() {
        return businessPersonnelId;
    }

    public void setBusinessPersonnelId(Integer businessPersonnelId) {
        this.businessPersonnelId = businessPersonnelId;
    }

    public Integer getErpId() {
        return erpId;
    }

    public void setErpId(Integer erpId) {
        this.erpId = erpId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
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

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", businessPersonnelId=").append(businessPersonnelId);
        sb.append(", erpId=").append(erpId);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", departmentId=").append(departmentId);
        sb.append(", remark=").append(remark);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}