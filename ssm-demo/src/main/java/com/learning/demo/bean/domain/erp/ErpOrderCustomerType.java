package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpOrderCustomerType implements Serializable {
    private Integer customerTypeId;

    private Integer erpId;

    private String code;

    private String name;

    private Boolean pricingMethod;

    private Long discount;

    private Integer created;

    private Integer updated;

    private Boolean isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(Integer customerTypeId) {
        this.customerTypeId = customerTypeId;
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

    public Boolean getPricingMethod() {
        return pricingMethod;
    }

    public void setPricingMethod(Boolean pricingMethod) {
        this.pricingMethod = pricingMethod;
    }

    public Long getDiscount() {
        return discount;
    }

    public void setDiscount(Long discount) {
        this.discount = discount;
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
        sb.append(", customerTypeId=").append(customerTypeId);
        sb.append(", erpId=").append(erpId);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", pricingMethod=").append(pricingMethod);
        sb.append(", discount=").append(discount);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}