package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpPurchaseVoucherBills implements Serializable {
    private Integer voucherBillId;

    private Integer erpId;

    private Integer propertyId;

    private String code;

    private Integer voucherDate;

    private Integer supplierId;

    private String invoiceNumber;

    private Integer invoiceDate;

    private Long businessTaxRate;

    private String remark;

    private Long payablePrice;

    private Long businessTaxPrice;

    private Long paidPrice;

    private String confirmationCode;

    private String updateCode;

    private String transmissionCode;

    private Integer currencyId;

    private Long exchangeRate;

    private String unifiedNumber;

    private String invoiceLianshuCode;

    private String taxCode;

    private String deductionCode;

    private Long invoicePaymentPrice;

    private Long invoiceTaxPrice;

    private Integer forecastPayDate;

    private Integer forecastCashDate;

    private Integer created;

    private Integer updated;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getVoucherBillId() {
        return voucherBillId;
    }

    public void setVoucherBillId(Integer voucherBillId) {
        this.voucherBillId = voucherBillId;
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

    public Integer getVoucherDate() {
        return voucherDate;
    }

    public void setVoucherDate(Integer voucherDate) {
        this.voucherDate = voucherDate;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber == null ? null : invoiceNumber.trim();
    }

    public Integer getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Integer invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Long getBusinessTaxRate() {
        return businessTaxRate;
    }

    public void setBusinessTaxRate(Long businessTaxRate) {
        this.businessTaxRate = businessTaxRate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getPayablePrice() {
        return payablePrice;
    }

    public void setPayablePrice(Long payablePrice) {
        this.payablePrice = payablePrice;
    }

    public Long getBusinessTaxPrice() {
        return businessTaxPrice;
    }

    public void setBusinessTaxPrice(Long businessTaxPrice) {
        this.businessTaxPrice = businessTaxPrice;
    }

    public Long getPaidPrice() {
        return paidPrice;
    }

    public void setPaidPrice(Long paidPrice) {
        this.paidPrice = paidPrice;
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

    public String getUnifiedNumber() {
        return unifiedNumber;
    }

    public void setUnifiedNumber(String unifiedNumber) {
        this.unifiedNumber = unifiedNumber == null ? null : unifiedNumber.trim();
    }

    public String getInvoiceLianshuCode() {
        return invoiceLianshuCode;
    }

    public void setInvoiceLianshuCode(String invoiceLianshuCode) {
        this.invoiceLianshuCode = invoiceLianshuCode == null ? null : invoiceLianshuCode.trim();
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode == null ? null : taxCode.trim();
    }

    public String getDeductionCode() {
        return deductionCode;
    }

    public void setDeductionCode(String deductionCode) {
        this.deductionCode = deductionCode == null ? null : deductionCode.trim();
    }

    public Long getInvoicePaymentPrice() {
        return invoicePaymentPrice;
    }

    public void setInvoicePaymentPrice(Long invoicePaymentPrice) {
        this.invoicePaymentPrice = invoicePaymentPrice;
    }

    public Long getInvoiceTaxPrice() {
        return invoiceTaxPrice;
    }

    public void setInvoiceTaxPrice(Long invoiceTaxPrice) {
        this.invoiceTaxPrice = invoiceTaxPrice;
    }

    public Integer getForecastPayDate() {
        return forecastPayDate;
    }

    public void setForecastPayDate(Integer forecastPayDate) {
        this.forecastPayDate = forecastPayDate;
    }

    public Integer getForecastCashDate() {
        return forecastCashDate;
    }

    public void setForecastCashDate(Integer forecastCashDate) {
        this.forecastCashDate = forecastCashDate;
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
        sb.append(", voucherBillId=").append(voucherBillId);
        sb.append(", erpId=").append(erpId);
        sb.append(", propertyId=").append(propertyId);
        sb.append(", code=").append(code);
        sb.append(", voucherDate=").append(voucherDate);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", invoiceNumber=").append(invoiceNumber);
        sb.append(", invoiceDate=").append(invoiceDate);
        sb.append(", businessTaxRate=").append(businessTaxRate);
        sb.append(", remark=").append(remark);
        sb.append(", payablePrice=").append(payablePrice);
        sb.append(", businessTaxPrice=").append(businessTaxPrice);
        sb.append(", paidPrice=").append(paidPrice);
        sb.append(", confirmationCode=").append(confirmationCode);
        sb.append(", updateCode=").append(updateCode);
        sb.append(", transmissionCode=").append(transmissionCode);
        sb.append(", currencyId=").append(currencyId);
        sb.append(", exchangeRate=").append(exchangeRate);
        sb.append(", unifiedNumber=").append(unifiedNumber);
        sb.append(", invoiceLianshuCode=").append(invoiceLianshuCode);
        sb.append(", taxCode=").append(taxCode);
        sb.append(", deductionCode=").append(deductionCode);
        sb.append(", invoicePaymentPrice=").append(invoicePaymentPrice);
        sb.append(", invoiceTaxPrice=").append(invoiceTaxPrice);
        sb.append(", forecastPayDate=").append(forecastPayDate);
        sb.append(", forecastCashDate=").append(forecastCashDate);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}