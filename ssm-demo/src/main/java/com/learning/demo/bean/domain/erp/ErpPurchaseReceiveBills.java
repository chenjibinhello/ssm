package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpPurchaseReceiveBills implements Serializable {
    private Integer receiveBillId;

    private Integer erpId;

    private Byte type;

    private Integer billCount;

    private Integer propertyId;

    private String code;

    private Integer receiveDate;

    private Integer supplierId;

    private String supplierCode;

    private Integer receiveWarehouseId;

    private Integer currencyId;

    private Long exchangeRate;

    private Integer printCount;

    private String confirmationCode;

    private String invoiceLianshuCode;

    private String taxCode;

    private Integer created;

    private Integer updated;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getReceiveBillId() {
        return receiveBillId;
    }

    public void setReceiveBillId(Integer receiveBillId) {
        this.receiveBillId = receiveBillId;
    }

    public Integer getErpId() {
        return erpId;
    }

    public void setErpId(Integer erpId) {
        this.erpId = erpId;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getBillCount() {
        return billCount;
    }

    public void setBillCount(Integer billCount) {
        this.billCount = billCount;
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

    public Integer getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Integer receiveDate) {
        this.receiveDate = receiveDate;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode == null ? null : supplierCode.trim();
    }

    public Integer getReceiveWarehouseId() {
        return receiveWarehouseId;
    }

    public void setReceiveWarehouseId(Integer receiveWarehouseId) {
        this.receiveWarehouseId = receiveWarehouseId;
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
        sb.append(", receiveBillId=").append(receiveBillId);
        sb.append(", erpId=").append(erpId);
        sb.append(", type=").append(type);
        sb.append(", billCount=").append(billCount);
        sb.append(", propertyId=").append(propertyId);
        sb.append(", code=").append(code);
        sb.append(", receiveDate=").append(receiveDate);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", supplierCode=").append(supplierCode);
        sb.append(", receiveWarehouseId=").append(receiveWarehouseId);
        sb.append(", currencyId=").append(currencyId);
        sb.append(", exchangeRate=").append(exchangeRate);
        sb.append(", printCount=").append(printCount);
        sb.append(", confirmationCode=").append(confirmationCode);
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