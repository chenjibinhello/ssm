package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpManagers implements Serializable {
    private Integer managerId;

    private Integer erpId;

    private Integer userId;

    private String ukeyId;

    private Byte ukeyEnable;

    private Byte loginStatus;

    private Integer created;

    private Integer updated;

    private Boolean isDeleted;

    private String powers;

    private static final long serialVersionUID = 1L;

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getErpId() {
        return erpId;
    }

    public void setErpId(Integer erpId) {
        this.erpId = erpId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUkeyId() {
        return ukeyId;
    }

    public void setUkeyId(String ukeyId) {
        this.ukeyId = ukeyId == null ? null : ukeyId.trim();
    }

    public Byte getUkeyEnable() {
        return ukeyEnable;
    }

    public void setUkeyEnable(Byte ukeyEnable) {
        this.ukeyEnable = ukeyEnable;
    }

    public Byte getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(Byte loginStatus) {
        this.loginStatus = loginStatus;
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

    public String getPowers() {
        return powers;
    }

    public void setPowers(String powers) {
        this.powers = powers == null ? null : powers.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", managerId=").append(managerId);
        sb.append(", erpId=").append(erpId);
        sb.append(", userId=").append(userId);
        sb.append(", ukeyId=").append(ukeyId);
        sb.append(", ukeyEnable=").append(ukeyEnable);
        sb.append(", loginStatus=").append(loginStatus);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", powers=").append(powers);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}