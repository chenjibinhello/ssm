package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpOrderReviseBills implements Serializable {
    private Integer reviseBillId;

    private Integer customerBillId;

    private Integer erpId;

    private Integer propertyId;

    private String code;

    private Integer reviseDate;

    private Integer customerId;

    private String wholeSettleCode;

    private Integer deliverWarehouseId;

    private Integer currencyId;

    private String priceCondition;

    private String paymentCondition;

    private String reviseReason;

    private String confirmationCode;

    private Integer printCount;

    private String updateCode;

    private String transmissionCode;

    private Integer originDeliverWarehouseId;

    private Integer originCurrencyId;

    private String originPriceCondition;

    private String originPaymentCondition;

    private Integer created;

    private Integer updated;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getReviseBillId() {
        return reviseBillId;
    }

    public void setReviseBillId(Integer reviseBillId) {
        this.reviseBillId = reviseBillId;
    }

    public Integer getCustomerBillId() {
        return customerBillId;
    }

    public void setCustomerBillId(Integer customerBillId) {
        this.customerBillId = customerBillId;
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

    public Integer getReviseDate() {
        return reviseDate;
    }

    public void setReviseDate(Integer reviseDate) {
        this.reviseDate = reviseDate;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getWholeSettleCode() {
        return wholeSettleCode;
    }

    public void setWholeSettleCode(String wholeSettleCode) {
        this.wholeSettleCode = wholeSettleCode == null ? null : wholeSettleCode.trim();
    }

    public Integer getDeliverWarehouseId() {
        return deliverWarehouseId;
    }

    public void setDeliverWarehouseId(Integer deliverWarehouseId) {
        this.deliverWarehouseId = deliverWarehouseId;
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

    public String getReviseReason() {
        return reviseReason;
    }

    public void setReviseReason(String reviseReason) {
        this.reviseReason = reviseReason == null ? null : reviseReason.trim();
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

    public Integer getOriginDeliverWarehouseId() {
        return originDeliverWarehouseId;
    }

    public void setOriginDeliverWarehouseId(Integer originDeliverWarehouseId) {
        this.originDeliverWarehouseId = originDeliverWarehouseId;
    }

    public Integer getOriginCurrencyId() {
        return originCurrencyId;
    }

    public void setOriginCurrencyId(Integer originCurrencyId) {
        this.originCurrencyId = originCurrencyId;
    }

    public String getOriginPriceCondition() {
        return originPriceCondition;
    }

    public void setOriginPriceCondition(String originPriceCondition) {
        this.originPriceCondition = originPriceCondition == null ? null : originPriceCondition.trim();
    }

    public String getOriginPaymentCondition() {
        return originPaymentCondition;
    }

    public void setOriginPaymentCondition(String originPaymentCondition) {
        this.originPaymentCondition = originPaymentCondition == null ? null : originPaymentCondition.trim();
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
        sb.append(", reviseBillId=").append(reviseBillId);
        sb.append(", customerBillId=").append(customerBillId);
        sb.append(", erpId=").append(erpId);
        sb.append(", propertyId=").append(propertyId);
        sb.append(", code=").append(code);
        sb.append(", reviseDate=").append(reviseDate);
        sb.append(", customerId=").append(customerId);
        sb.append(", wholeSettleCode=").append(wholeSettleCode);
        sb.append(", deliverWarehouseId=").append(deliverWarehouseId);
        sb.append(", currencyId=").append(currencyId);
        sb.append(", priceCondition=").append(priceCondition);
        sb.append(", paymentCondition=").append(paymentCondition);
        sb.append(", reviseReason=").append(reviseReason);
        sb.append(", confirmationCode=").append(confirmationCode);
        sb.append(", printCount=").append(printCount);
        sb.append(", updateCode=").append(updateCode);
        sb.append(", transmissionCode=").append(transmissionCode);
        sb.append(", originDeliverWarehouseId=").append(originDeliverWarehouseId);
        sb.append(", originCurrencyId=").append(originCurrencyId);
        sb.append(", originPriceCondition=").append(originPriceCondition);
        sb.append(", originPaymentCondition=").append(originPaymentCondition);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}