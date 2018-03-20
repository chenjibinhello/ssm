package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpInventoryClsyear implements Serializable {
    private Integer clsyearId;

    private Integer erpId;

    private Integer clsym;

    private Integer created;

    private Integer updated;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getClsyearId() {
        return clsyearId;
    }

    public void setClsyearId(Integer clsyearId) {
        this.clsyearId = clsyearId;
    }

    public Integer getErpId() {
        return erpId;
    }

    public void setErpId(Integer erpId) {
        this.erpId = erpId;
    }

    public Integer getClsym() {
        return clsym;
    }

    public void setClsym(Integer clsym) {
        this.clsym = clsym;
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
        sb.append(", clsyearId=").append(clsyearId);
        sb.append(", erpId=").append(erpId);
        sb.append(", clsym=").append(clsym);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}