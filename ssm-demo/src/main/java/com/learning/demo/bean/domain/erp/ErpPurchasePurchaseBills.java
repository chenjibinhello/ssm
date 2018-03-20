package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpPurchasePurchaseBills implements Serializable {
    private Integer purchaseBillId;

    private Integer erpId;

    private Integer propertyId;

    private String code;

    private Integer purchaseDate;

    private Integer supplierId;

    private Integer currencyId;

    private String priceCondition;

    private String paymentCondition;

    private Integer warehouseId;

    private Integer purchaserId;

    private String remark;

    private String printFormat;

    private Integer printCount;

    private String confirmationCode;

    private String updateCode;

    private String transmissionCode;

    private String deliveryAddress;

    private String billAddress;

    private String invoiceAddress;

    private Long exchangeRate;

    private Integer piDate;

    private Integer piCode;

    private Integer created;

    private Integer updated;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getPurchaseBillId() {
        return purchaseBillId;
    }

    public void setPurchaseBillId(Integer purchaseBillId) {
        this.purchaseBillId = purchaseBillId;
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

    public Integer getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Integer purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
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

    public String getPaymentCondition() {
        return paymentCondition;
    }

    public void setPaymentCondition(String paymentCondition) {
        this.paymentCondition = paymentCondition == null ? null : paymentCondition.trim();
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Integer getPurchaserId() {
        return purchaserId;
    }

    public void setPurchaserId(Integer purchaserId) {
        this.purchaserId = purchaserId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getPrintFormat() {
        return printFormat;
    }

    public void setPrintFormat(String printFormat) {
        this.printFormat = printFormat == null ? null : printFormat.trim();
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

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress == null ? null : deliveryAddress.trim();
    }

    public String getBillAddress() {
        return billAddress;
    }

    public void setBillAddress(String billAddress) {
        this.billAddress = billAddress == null ? null : billAddress.trim();
    }

    public String getInvoiceAddress() {
        return invoiceAddress;
    }

    public void setInvoiceAddress(String invoiceAddress) {
        this.invoiceAddress = invoiceAddress == null ? null : invoiceAddress.trim();
    }

    public Long getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Long exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Integer getPiDate() {
        return piDate;
    }

    public void setPiDate(Integer piDate) {
        this.piDate = piDate;
    }

    public Integer getPiCode() {
        return piCode;
    }

    public void setPiCode(Integer piCode) {
        this.piCode = piCode;
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
        sb.append(", purchaseBillId=").append(purchaseBillId);
        sb.append(", erpId=").append(erpId);
        sb.append(", propertyId=").append(propertyId);
        sb.append(", code=").append(code);
        sb.append(", purchaseDate=").append(purchaseDate);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", currencyId=").append(currencyId);
        sb.append(", priceCondition=").append(priceCondition);
        sb.append(", paymentCondition=").append(paymentCondition);
        sb.append(", warehouseId=").append(warehouseId);
        sb.append(", purchaserId=").append(purchaserId);
        sb.append(", remark=").append(remark);
        sb.append(", printFormat=").append(printFormat);
        sb.append(", printCount=").append(printCount);
        sb.append(", confirmationCode=").append(confirmationCode);
        sb.append(", updateCode=").append(updateCode);
        sb.append(", transmissionCode=").append(transmissionCode);
        sb.append(", deliveryAddress=").append(deliveryAddress);
        sb.append(", billAddress=").append(billAddress);
        sb.append(", invoiceAddress=").append(invoiceAddress);
        sb.append(", exchangeRate=").append(exchangeRate);
        sb.append(", piDate=").append(piDate);
        sb.append(", piCode=").append(piCode);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}