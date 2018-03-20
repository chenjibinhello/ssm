package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpOrderStatementBills implements Serializable {
    private Integer statementBillId;

    private Integer erpId;

    private Integer propertyId;

    private String code;

    private Integer statementDate;

    private Integer customerId;

    private Integer businessPersonnelId;

    private String unifiedNumber;

    private Integer currencyId;

    private Long exchangeRate;

    private String invoiceNumber;

    private Boolean invoiceQuantity;

    private String businessTaxCategory;

    private Integer businessTax;

    private String remark;

    private Long receivableAmount;

    private Long businessTaxAmount;

    private Long receivedAmount;

    private String cancelCode;

    private String confirmationCode;

    private String updateCode;

    private String transmissionCode;

    private Integer invoiceDate;

    private Long invoiceLoan;

    private Long invoiceTaxAmount;

    private Integer expectedReceiptDate;

    private Integer customerBillId;

    private Integer customerBillPropertyId;

    private String customerBillCode;

    private Integer created;

    private Integer updated;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getStatementBillId() {
        return statementBillId;
    }

    public void setStatementBillId(Integer statementBillId) {
        this.statementBillId = statementBillId;
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

    public Integer getStatementDate() {
        return statementDate;
    }

    public void setStatementDate(Integer statementDate) {
        this.statementDate = statementDate;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getBusinessPersonnelId() {
        return businessPersonnelId;
    }

    public void setBusinessPersonnelId(Integer businessPersonnelId) {
        this.businessPersonnelId = businessPersonnelId;
    }

    public String getUnifiedNumber() {
        return unifiedNumber;
    }

    public void setUnifiedNumber(String unifiedNumber) {
        this.unifiedNumber = unifiedNumber == null ? null : unifiedNumber.trim();
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

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber == null ? null : invoiceNumber.trim();
    }

    public Boolean getInvoiceQuantity() {
        return invoiceQuantity;
    }

    public void setInvoiceQuantity(Boolean invoiceQuantity) {
        this.invoiceQuantity = invoiceQuantity;
    }

    public String getBusinessTaxCategory() {
        return businessTaxCategory;
    }

    public void setBusinessTaxCategory(String businessTaxCategory) {
        this.businessTaxCategory = businessTaxCategory == null ? null : businessTaxCategory.trim();
    }

    public Integer getBusinessTax() {
        return businessTax;
    }

    public void setBusinessTax(Integer businessTax) {
        this.businessTax = businessTax;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getReceivableAmount() {
        return receivableAmount;
    }

    public void setReceivableAmount(Long receivableAmount) {
        this.receivableAmount = receivableAmount;
    }

    public Long getBusinessTaxAmount() {
        return businessTaxAmount;
    }

    public void setBusinessTaxAmount(Long businessTaxAmount) {
        this.businessTaxAmount = businessTaxAmount;
    }

    public Long getReceivedAmount() {
        return receivedAmount;
    }

    public void setReceivedAmount(Long receivedAmount) {
        this.receivedAmount = receivedAmount;
    }

    public String getCancelCode() {
        return cancelCode;
    }

    public void setCancelCode(String cancelCode) {
        this.cancelCode = cancelCode == null ? null : cancelCode.trim();
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

    public Integer getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Integer invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Long getInvoiceLoan() {
        return invoiceLoan;
    }

    public void setInvoiceLoan(Long invoiceLoan) {
        this.invoiceLoan = invoiceLoan;
    }

    public Long getInvoiceTaxAmount() {
        return invoiceTaxAmount;
    }

    public void setInvoiceTaxAmount(Long invoiceTaxAmount) {
        this.invoiceTaxAmount = invoiceTaxAmount;
    }

    public Integer getExpectedReceiptDate() {
        return expectedReceiptDate;
    }

    public void setExpectedReceiptDate(Integer expectedReceiptDate) {
        this.expectedReceiptDate = expectedReceiptDate;
    }

    public Integer getCustomerBillId() {
        return customerBillId;
    }

    public void setCustomerBillId(Integer customerBillId) {
        this.customerBillId = customerBillId;
    }

    public Integer getCustomerBillPropertyId() {
        return customerBillPropertyId;
    }

    public void setCustomerBillPropertyId(Integer customerBillPropertyId) {
        this.customerBillPropertyId = customerBillPropertyId;
    }

    public String getCustomerBillCode() {
        return customerBillCode;
    }

    public void setCustomerBillCode(String customerBillCode) {
        this.customerBillCode = customerBillCode == null ? null : customerBillCode.trim();
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
        sb.append(", statementBillId=").append(statementBillId);
        sb.append(", erpId=").append(erpId);
        sb.append(", propertyId=").append(propertyId);
        sb.append(", code=").append(code);
        sb.append(", statementDate=").append(statementDate);
        sb.append(", customerId=").append(customerId);
        sb.append(", businessPersonnelId=").append(businessPersonnelId);
        sb.append(", unifiedNumber=").append(unifiedNumber);
        sb.append(", currencyId=").append(currencyId);
        sb.append(", exchangeRate=").append(exchangeRate);
        sb.append(", invoiceNumber=").append(invoiceNumber);
        sb.append(", invoiceQuantity=").append(invoiceQuantity);
        sb.append(", businessTaxCategory=").append(businessTaxCategory);
        sb.append(", businessTax=").append(businessTax);
        sb.append(", remark=").append(remark);
        sb.append(", receivableAmount=").append(receivableAmount);
        sb.append(", businessTaxAmount=").append(businessTaxAmount);
        sb.append(", receivedAmount=").append(receivedAmount);
        sb.append(", cancelCode=").append(cancelCode);
        sb.append(", confirmationCode=").append(confirmationCode);
        sb.append(", updateCode=").append(updateCode);
        sb.append(", transmissionCode=").append(transmissionCode);
        sb.append(", invoiceDate=").append(invoiceDate);
        sb.append(", invoiceLoan=").append(invoiceLoan);
        sb.append(", invoiceTaxAmount=").append(invoiceTaxAmount);
        sb.append(", expectedReceiptDate=").append(expectedReceiptDate);
        sb.append(", customerBillId=").append(customerBillId);
        sb.append(", customerBillPropertyId=").append(customerBillPropertyId);
        sb.append(", customerBillCode=").append(customerBillCode);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}