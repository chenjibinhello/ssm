package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpPurchaseReturnBills implements Serializable {
    private Integer returnBillId;

    private Integer erpId;

    private Integer propertyId;

    private String code;

    private Integer returnDate;

    private Integer supplierId;

    private String remark;

    private Long returnPrice;

    private Long rmbReturnPrice;

    private Integer printCount;

    private String confirmationCode;

    private String checkoutCode;

    private String updateCode;

    private String transmissionCode;

    private Integer currencyId;

    private Long exchangeRate;

    private String invoiceLianshuCode;

    private String taxCode;

    private Integer created;

    private Integer updated;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getReturnBillId() {
        return returnBillId;
    }

    public void setReturnBillId(Integer returnBillId) {
        this.returnBillId = returnBillId;
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

    public Integer getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Integer returnDate) {
        this.returnDate = returnDate;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getReturnPrice() {
        return returnPrice;
    }

    public void setReturnPrice(Long returnPrice) {
        this.returnPrice = returnPrice;
    }

    public Long getRmbReturnPrice() {
        return rmbReturnPrice;
    }

    public void setRmbReturnPrice(Long rmbReturnPrice) {
        this.rmbReturnPrice = rmbReturnPrice;
    }

    public Integer getPrintCount() {
        return printCount;
    }

    public void setPrintCount(Integer printCount) {
        this.printCount = printCount;
    }

    public String getConfirmationCode() {
        return confirmationCode;
    }

    public void setConfirmationCode(String confirmationCode) {
        this.confirmationCode = confirmationCode == null ? null : confirmationCode.trim();
    }

    public String getCheckoutCode() {
        return checkoutCode;
    }

    public void setCheckoutCode(String checkoutCode) {
        this.checkoutCode = checkoutCode == null ? null : checkoutCode.trim();
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
        sb.append(", returnBillId=").append(returnBillId);
        sb.append(", erpId=").append(erpId);
        sb.append(", propertyId=").append(propertyId);
        sb.append(", code=").append(code);
        sb.append(", returnDate=").append(returnDate);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", remark=").append(remark);
        sb.append(", returnPrice=").append(returnPrice);
        sb.append(", rmbReturnPrice=").append(rmbReturnPrice);
        sb.append(", printCount=").append(printCount);
        sb.append(", confirmationCode=").append(confirmationCode);
        sb.append(", checkoutCode=").append(checkoutCode);
        sb.append(", updateCode=").append(updateCode);
        sb.append(", transmissionCode=").append(transmissionCode);
        sb.append(", currencyId=").append(currencyId);
        sb.append(", exchangeRate=").append(exchangeRate);
        sb.append(", invoiceLianshuCode=").append(invoiceLianshuCode);
        sb.append(", taxCode=").append(taxCode);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}