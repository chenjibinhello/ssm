package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpPurchaseReviseBills implements Serializable {
    private Integer reviseBillId;

    private Integer erpId;

    private Long billId;

    private Integer reviseDate;

    private String wholeSettleCode;

    private Integer warehouseId;

    private Integer currencyId;

    private String priceCondition;

    private String paymentCondition;

    private String reviseCondition;

    private String confirmationCode;

    private String updateCode;

    private String transmissionCode;

    private Integer originWarehouseId;

    private Integer originCurrencyId;

    private String originPriceCondition;

    private String originPaymentCondition;

    private String reviseReason;

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

    public Integer getErpId() {
        return erpId;
    }

    public void setErpId(Integer erpId) {
        this.erpId = erpId;
    }

    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
    }

    public Integer getReviseDate() {
        return reviseDate;
    }

    public void setReviseDate(Integer reviseDate) {
        this.reviseDate = reviseDate;
    }

    public String getWholeSettleCode() {
        return wholeSettleCode;
    }

    public void setWholeSettleCode(String wholeSettleCode) {
        this.wholeSettleCode = wholeSettleCode == null ? null : wholeSettleCode.trim();
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
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

    public String getReviseCondition() {
        return reviseCondition;
    }

    public void setReviseCondition(String reviseCondition) {
        this.reviseCondition = reviseCondition == null ? null : reviseCondition.trim();
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

    public Integer getOriginWarehouseId() {
        return originWarehouseId;
    }

    public void setOriginWarehouseId(Integer originWarehouseId) {
        this.originWarehouseId = originWarehouseId;
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

    public String getReviseReason() {
        return reviseReason;
    }

    public void setReviseReason(String reviseReason) {
        this.reviseReason = reviseReason == null ? null : reviseReason.trim();
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
        sb.append(", erpId=").append(erpId);
        sb.append(", billId=").append(billId);
        sb.append(", reviseDate=").append(reviseDate);
        sb.append(", wholeSettleCode=").append(wholeSettleCode);
        sb.append(", warehouseId=").append(warehouseId);
        sb.append(", currencyId=").append(currencyId);
        sb.append(", priceCondition=").append(priceCondition);
        sb.append(", paymentCondition=").append(paymentCondition);
        sb.append(", reviseCondition=").append(reviseCondition);
        sb.append(", confirmationCode=").append(confirmationCode);
        sb.append(", updateCode=").append(updateCode);
        sb.append(", transmissionCode=").append(transmissionCode);
        sb.append(", originWarehouseId=").append(originWarehouseId);
        sb.append(", originCurrencyId=").append(originCurrencyId);
        sb.append(", originPriceCondition=").append(originPriceCondition);
        sb.append(", originPaymentCondition=").append(originPaymentCondition);
        sb.append(", reviseReason=").append(reviseReason);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}