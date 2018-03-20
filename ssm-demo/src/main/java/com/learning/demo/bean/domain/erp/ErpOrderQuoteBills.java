package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpOrderQuoteBills implements Serializable {
    private Integer quoteBillId;

    private Integer erpId;

    private Integer propertyId;

    private String code;

    private Integer quoteDate;

    private Integer customerId;

    private String customerFullName;

    private Integer businessPersonnelId;

    private Integer customerTypeId;

    private Long discountRate;

    private Integer currencyId;

    private Integer exchangeRate;

    private Long quotePrice;

    private String priceCondition;

    private String paymentCondition;

    private String remarkOne;

    private String remarkTwo;

    private String remarkThree;

    private String remarkFour;

    private Integer deliveryDays;

    private Integer validDate;

    private String printFormat;

    private String customerConfirmationCode;

    private String confirmationCode;

    private Integer printCount;

    private Integer created;

    private Integer updated;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getQuoteBillId() {
        return quoteBillId;
    }

    public void setQuoteBillId(Integer quoteBillId) {
        this.quoteBillId = quoteBillId;
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

    public Integer getQuoteDate() {
        return quoteDate;
    }

    public void setQuoteDate(Integer quoteDate) {
        this.quoteDate = quoteDate;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerFullName() {
        return customerFullName;
    }

    public void setCustomerFullName(String customerFullName) {
        this.customerFullName = customerFullName == null ? null : customerFullName.trim();
    }

    public Integer getBusinessPersonnelId() {
        return businessPersonnelId;
    }

    public void setBusinessPersonnelId(Integer businessPersonnelId) {
        this.businessPersonnelId = businessPersonnelId;
    }

    public Integer getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(Integer customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public Long getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Long discountRate) {
        this.discountRate = discountRate;
    }

    public Integer getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public Integer getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Integer exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Long getQuotePrice() {
        return quotePrice;
    }

    public void setQuotePrice(Long quotePrice) {
        this.quotePrice = quotePrice;
    }

    public String getPriceCondition() {
        return priceCondition;
    }

    public void setPriceCondition(String priceCondition) {
        this.priceCondition = priceCondition == null ? null : priceCondition.trim();
    }

    public String getPaymentCondition() {
        return paymentCondition;
    }

    public void setPaymentCondition(String paymentCondition) {
        this.paymentCondition = paymentCondition == null ? null : paymentCondition.trim();
    }

    public String getRemarkOne() {
        return remarkOne;
    }

    public void setRemarkOne(String remarkOne) {
        this.remarkOne = remarkOne == null ? null : remarkOne.trim();
    }

    public String getRemarkTwo() {
        return remarkTwo;
    }

    public void setRemarkTwo(String remarkTwo) {
        this.remarkTwo = remarkTwo == null ? null : remarkTwo.trim();
    }

    public String getRemarkThree() {
        return remarkThree;
    }

    public void setRemarkThree(String remarkThree) {
        this.remarkThree = remarkThree == null ? null : remarkThree.trim();
    }

    public String getRemarkFour() {
        return remarkFour;
    }

    public void setRemarkFour(String remarkFour) {
        this.remarkFour = remarkFour == null ? null : remarkFour.trim();
    }

    public Integer getDeliveryDays() {
        return deliveryDays;
    }

    public void setDeliveryDays(Integer deliveryDays) {
        this.deliveryDays = deliveryDays;
    }

    public Integer getValidDate() {
        return validDate;
    }

    public void setValidDate(Integer validDate) {
        this.validDate = validDate;
    }

    public String getPrintFormat() {
        return printFormat;
    }

    public void setPrintFormat(String printFormat) {
        this.printFormat = printFormat == null ? null : printFormat.trim();
    }

    public String getCustomerConfirmationCode() {
        return customerConfirmationCode;
    }

    public void setCustomerConfirmationCode(String customerConfirmationCode) {
        this.customerConfirmationCode = customerConfirmationCode == null ? null : customerConfirmationCode.trim();
    }

    public String getConfirmationCode() {
        return confirmationCode;
    }

    public void setConfirmationCode(String confirmationCode) {
        this.confirmationCode = confirmationCode == null ? null : confirmationCode.trim();
    }

    public Integer getPrintCount() {
        return printCount;
    }

    public void setPrintCount(Integer printCount) {
        this.printCount = printCount;
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
        sb.append(", quoteBillId=").append(quoteBillId);
        sb.append(", erpId=").append(erpId);
        sb.append(", propertyId=").append(propertyId);
        sb.append(", code=").append(code);
        sb.append(", quoteDate=").append(quoteDate);
        sb.append(", customerId=").append(customerId);
        sb.append(", customerFullName=").append(customerFullName);
        sb.append(", businessPersonnelId=").append(businessPersonnelId);
        sb.append(", customerTypeId=").append(customerTypeId);
        sb.append(", discountRate=").append(discountRate);
        sb.append(", currencyId=").append(currencyId);
        sb.append(", exchangeRate=").append(exchangeRate);
        sb.append(", quotePrice=").append(quotePrice);
        sb.append(", priceCondition=").append(priceCondition);
        sb.append(", paymentCondition=").append(paymentCondition);
        sb.append(", remarkOne=").append(remarkOne);
        sb.append(", remarkTwo=").append(remarkTwo);
        sb.append(", remarkThree=").append(remarkThree);
        sb.append(", remarkFour=").append(remarkFour);
        sb.append(", deliveryDays=").append(deliveryDays);
        sb.append(", validDate=").append(validDate);
        sb.append(", printFormat=").append(printFormat);
        sb.append(", customerConfirmationCode=").append(customerConfirmationCode);
        sb.append(", confirmationCode=").append(confirmationCode);
        sb.append(", printCount=").append(printCount);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}