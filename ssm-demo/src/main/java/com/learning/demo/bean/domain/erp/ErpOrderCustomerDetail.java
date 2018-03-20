package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpOrderCustomerDetail implements Serializable {
    private Integer customerId;

    private Integer erpId;

    private String code;

    private String shortCompanyName;

    private String fullCompanyName;

    private String registeredAddress;

    private String deliveryAddress;

    private String responsiblePersonName;

    private String contactPersonName;

    private String telNumber;

    private String telexNumber;

    private String faxNumber;

    private String unifiedNumber;

    private Integer businessPersonnelId;

    private Integer departmentId;

    private Integer customerTypeId;

    private Integer openingDate;

    private Integer firstTradeDate;

    private Integer recentTradeDate;

    private Long capitalAmount;

    private Long annualSalesAmount;

    private Long staffAmount;

    private String salesRating;

    private String creditRating;

    private Integer subjectId;

    private Integer currencyId;

    private String priceCondition;

    private String payCondition;

    private Long creditAmount;

    private Integer checkoutDate;

    private String remark;

    private Integer expectReceiptDate;

    private Integer usanceDays;

    private Integer created;

    private Integer updated;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
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

    public String getShortCompanyName() {
        return shortCompanyName;
    }

    public void setShortCompanyName(String shortCompanyName) {
        this.shortCompanyName = shortCompanyName == null ? null : shortCompanyName.trim();
    }

    public String getFullCompanyName() {
        return fullCompanyName;
    }

    public void setFullCompanyName(String fullCompanyName) {
        this.fullCompanyName = fullCompanyName == null ? null : fullCompanyName.trim();
    }

    public String getRegisteredAddress() {
        return registeredAddress;
    }

    public void setRegisteredAddress(String registeredAddress) {
        this.registeredAddress = registeredAddress == null ? null : registeredAddress.trim();
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress == null ? null : deliveryAddress.trim();
    }

    public String getResponsiblePersonName() {
        return responsiblePersonName;
    }

    public void setResponsiblePersonName(String responsiblePersonName) {
        this.responsiblePersonName = responsiblePersonName == null ? null : responsiblePersonName.trim();
    }

    public String getContactPersonName() {
        return contactPersonName;
    }

    public void setContactPersonName(String contactPersonName) {
        this.contactPersonName = contactPersonName == null ? null : contactPersonName.trim();
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber == null ? null : telNumber.trim();
    }

    public String getTelexNumber() {
        return telexNumber;
    }

    public void setTelexNumber(String telexNumber) {
        this.telexNumber = telexNumber == null ? null : telexNumber.trim();
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber == null ? null : faxNumber.trim();
    }

    public String getUnifiedNumber() {
        return unifiedNumber;
    }

    public void setUnifiedNumber(String unifiedNumber) {
        this.unifiedNumber = unifiedNumber == null ? null : unifiedNumber.trim();
    }

    public Integer getBusinessPersonnelId() {
        return businessPersonnelId;
    }

    public void setBusinessPersonnelId(Integer businessPersonnelId) {
        this.businessPersonnelId = businessPersonnelId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(Integer customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public Integer getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(Integer openingDate) {
        this.openingDate = openingDate;
    }

    public Integer getFirstTradeDate() {
        return firstTradeDate;
    }

    public void setFirstTradeDate(Integer firstTradeDate) {
        this.firstTradeDate = firstTradeDate;
    }

    public Integer getRecentTradeDate() {
        return recentTradeDate;
    }

    public void setRecentTradeDate(Integer recentTradeDate) {
        this.recentTradeDate = recentTradeDate;
    }

    public Long getCapitalAmount() {
        return capitalAmount;
    }

    public void setCapitalAmount(Long capitalAmount) {
        this.capitalAmount = capitalAmount;
    }

    public Long getAnnualSalesAmount() {
        return annualSalesAmount;
    }

    public void setAnnualSalesAmount(Long annualSalesAmount) {
        this.annualSalesAmount = annualSalesAmount;
    }

    public Long getStaffAmount() {
        return staffAmount;
    }

    public void setStaffAmount(Long staffAmount) {
        this.staffAmount = staffAmount;
    }

    public String getSalesRating() {
        return salesRating;
    }

    public void setSalesRating(String salesRating) {
        this.salesRating = salesRating == null ? null : salesRating.trim();
    }

    public String getCreditRating() {
        return creditRating;
    }

    public void setCreditRating(String creditRating) {
        this.creditRating = creditRating == null ? null : creditRating.trim();
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public String getPriceCondition() {
        return priceCondition;
    }

    public void setPriceCondition(String priceCondition) {
        this.priceCondition = priceCondition == null ? null : priceCondition.trim();
    }

    public String getPayCondition() {
        return payCondition;
    }

    public void setPayCondition(String payCondition) {
        this.payCondition = payCondition == null ? null : payCondition.trim();
    }

    public Long getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(Long creditAmount) {
        this.creditAmount = creditAmount;
    }

    public Integer getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(Integer checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getExpectReceiptDate() {
        return expectReceiptDate;
    }

    public void setExpectReceiptDate(Integer expectReceiptDate) {
        this.expectReceiptDate = expectReceiptDate;
    }

    public Integer getUsanceDays() {
        return usanceDays;
    }

    public void setUsanceDays(Integer usanceDays) {
        this.usanceDays = usanceDays;
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
        sb.append(", customerId=").append(customerId);
        sb.append(", erpId=").append(erpId);
        sb.append(", code=").append(code);
        sb.append(", shortCompanyName=").append(shortCompanyName);
        sb.append(", fullCompanyName=").append(fullCompanyName);
        sb.append(", registeredAddress=").append(registeredAddress);
        sb.append(", deliveryAddress=").append(deliveryAddress);
        sb.append(", responsiblePersonName=").append(responsiblePersonName);
        sb.append(", contactPersonName=").append(contactPersonName);
        sb.append(", telNumber=").append(telNumber);
        sb.append(", telexNumber=").append(telexNumber);
        sb.append(", faxNumber=").append(faxNumber);
        sb.append(", unifiedNumber=").append(unifiedNumber);
        sb.append(", businessPersonnelId=").append(businessPersonnelId);
        sb.append(", departmentId=").append(departmentId);
        sb.append(", customerTypeId=").append(customerTypeId);
        sb.append(", openingDate=").append(openingDate);
        sb.append(", firstTradeDate=").append(firstTradeDate);
        sb.append(", recentTradeDate=").append(recentTradeDate);
        sb.append(", capitalAmount=").append(capitalAmount);
        sb.append(", annualSalesAmount=").append(annualSalesAmount);
        sb.append(", staffAmount=").append(staffAmount);
        sb.append(", salesRating=").append(salesRating);
        sb.append(", creditRating=").append(creditRating);
        sb.append(", subjectId=").append(subjectId);
        sb.append(", currencyId=").append(currencyId);
        sb.append(", priceCondition=").append(priceCondition);
        sb.append(", payCondition=").append(payCondition);
        sb.append(", creditAmount=").append(creditAmount);
        sb.append(", checkoutDate=").append(checkoutDate);
        sb.append(", remark=").append(remark);
        sb.append(", expectReceiptDate=").append(expectReceiptDate);
        sb.append(", usanceDays=").append(usanceDays);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}