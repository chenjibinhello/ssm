package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpOrderSaleBills implements Serializable {
    private Integer saleBillId;

    private Integer erpId;

    private Integer propertyId;

    private String code;

    private Integer saleDate;

    private Integer customerId;

    private Integer departmentId;

    private Integer businessPersonnelId;

    private Integer currencyId;

    private Long exchangeRate;

    private Integer salePrice;

    private String customerFullName;

    private String deliverAddressOne;

    private String deliverAddressTwo;

    private String invoiceLianshuCode;

    private String remark;

    private String settleCode;

    private String confirmationCode;

    private String updateCode;

    private String transmissionCode;

    private Integer printCount;

    private String unifiedCode;

    private String taxCode;

    private Integer created;

    private Integer updated;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getSaleBillId() {
        return saleBillId;
    }

    public void setSaleBillId(Integer saleBillId) {
        this.saleBillId = saleBillId;
    }

    public Integer getErpId() {
        return erpId;
    }

    public void setErpId(Integer erpId) {
        this.erpId = erpId;
    }

    public Integer getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Integer saleDate) {
        this.saleDate = saleDate;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getBusinessPersonnelId() {
        return businessPersonnelId;
    }

    public void setBusinessPersonnelId(Integer businessPersonnelId) {
        this.businessPersonnelId = businessPersonnelId;
    }

    public Integer getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public Long getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Long exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Integer getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Integer salePrice) {
        this.salePrice = salePrice;
    }

    public String getCustomerFullName() {
        return customerFullName;
    }

    public void setCustomerFullName(String customerFullName) {
        this.customerFullName = customerFullName == null ? null : customerFullName.trim();
    }

    public String getDeliverAddressOne() {
        return deliverAddressOne;
    }

    public void setDeliverAddressOne(String deliverAddressOne) {
        this.deliverAddressOne = deliverAddressOne == null ? null : deliverAddressOne.trim();
    }

    public String getDeliverAddressTwo() {
        return deliverAddressTwo;
    }

    public void setDeliverAddressTwo(String deliverAddressTwo) {
        this.deliverAddressTwo = deliverAddressTwo == null ? null : deliverAddressTwo.trim();
    }

    public String getInvoiceLianshuCode() {
        return invoiceLianshuCode;
    }

    public void setInvoiceLianshuCode(String invoiceLianshuCode) {
        this.invoiceLianshuCode = invoiceLianshuCode == null ? null : invoiceLianshuCode.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getSettleCode() {
        return settleCode;
    }

    public void setSettleCode(String settleCode) {
        this.settleCode = settleCode == null ? null : settleCode.trim();
    }

    public String getConfirmationCode() {
        return confirmationCode;
    }

    public void setConfirmationCode(String confirmationCode) {
        this.confirmationCode = confirmationCode == null ? null : confirmationCode.trim();
    }

    public String getUpdateCode() {
        return updateCode;
    }

    public void setUpdateCode(String updateCode) {
        this.updateCode = updateCode == null ? null : updateCode.trim();
    }

    public String getTransmissionCode() {
        return transmissionCode;
    }

    public void setTransmissionCode(String transmissionCode) {
        this.transmissionCode = transmissionCode == null ? null : transmissionCode.trim();
    }

    public Integer getPrintCount() {
        return printCount;
    }

    public void setPrintCount(Integer printCount) {
        this.printCount = printCount;
    }

    public String getUnifiedCode() {
        return unifiedCode;
    }

    public void setUnifiedCode(String unifiedCode) {
        this.unifiedCode = unifiedCode == null ? null : unifiedCode.trim();
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode == null ? null : taxCode.trim();
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
        sb.append(", saleBillId=").append(saleBillId);
        sb.append(", erpId=").append(erpId);
        sb.append(", propertyId=").append(propertyId);
        sb.append(", code=").append(code);
        sb.append(", saleDate=").append(saleDate);
        sb.append(", customerId=").append(customerId);
        sb.append(", departmentId=").append(departmentId);
        sb.append(", businessPersonnelId=").append(businessPersonnelId);
        sb.append(", currencyId=").append(currencyId);
        sb.append(", exchangeRate=").append(exchangeRate);
        sb.append(", salePrice=").append(salePrice);
        sb.append(", customerFullName=").append(customerFullName);
        sb.append(", deliverAddressOne=").append(deliverAddressOne);
        sb.append(", deliverAddressTwo=").append(deliverAddressTwo);
        sb.append(", invoiceLianshuCode=").append(invoiceLianshuCode);
        sb.append(", remark=").append(remark);
        sb.append(", settleCode=").append(settleCode);
        sb.append(", confirmationCode=").append(confirmationCode);
        sb.append(", updateCode=").append(updateCode);
        sb.append(", transmissionCode=").append(transmissionCode);
        sb.append(", printCount=").append(printCount);
        sb.append(", unifiedCode=").append(unifiedCode);
        sb.append(", taxCode=").append(taxCode);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}