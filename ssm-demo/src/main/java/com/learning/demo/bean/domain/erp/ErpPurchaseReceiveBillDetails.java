package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpPurchaseReceiveBillDetails implements Serializable {
    private Integer receiveBillDetailId;

    private Integer erpId;

    private Integer receiveBillId;

    private Integer propertyId;

    private String code;

    private String serialNumber;

    private Integer receiveDate;

    private Integer supplierId;

    private Integer purchaseBillDetailId;

    private Integer materialId;

    private Integer materialCategoryId;

    private Integer currencyId;

    private String unit;

    private Long unitConvertRate;

    private Integer batchId;

    private String batchCode;

    private Long receiveQuantity;

    private Long checkInQuantity;

    private Long checkOutQuantity;

    private Integer checkDate;

    private String remark;

    private String overdueCode;

    private String unhealthyCode;

    private String checkBackCode;

    private Long unitPurchasePrice;

    private Long rmbUnitPurchasePrice;

    private Long purchasePrice;

    private Long rmbPurchasePrice;

    private Long rmbPurchaseFee;

    private String notPayCode;

    private String checkoutCode;

    private String confirmationCode;

    private String updateCode;

    private String transmissionCode;

    private Long debitPrice;

    private Long rmbDebitPrice;

    private String debitDesc;

    private Long valuationQuantity;

    private Integer receiveWarehouseId;

    private Integer created;

    private Integer updated;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getReceiveBillDetailId() {
        return receiveBillDetailId;
    }

    public void setReceiveBillDetailId(Integer receiveBillDetailId) {
        this.receiveBillDetailId = receiveBillDetailId;
    }

    public Integer getErpId() {
        return erpId;
    }

    public void setErpId(Integer erpId) {
        this.erpId = erpId;
    }

    public Integer getReceiveBillId() {
        return receiveBillId;
    }

    public void setReceiveBillId(Integer receiveBillId) {
        this.receiveBillId = receiveBillId;
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

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
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

    public Integer getPurchaseBillDetailId() {
        return purchaseBillDetailId;
    }

    public void setPurchaseBillDetailId(Integer purchaseBillDetailId) {
        this.purchaseBillDetailId = purchaseBillDetailId;
    }

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    public Integer getMaterialCategoryId() {
        return materialCategoryId;
    }

    public void setMaterialCategoryId(Integer materialCategoryId) {
        this.materialCategoryId = materialCategoryId;
    }

    public Integer getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Long getUnitConvertRate() {
        return unitConvertRate;
    }

    public void setUnitConvertRate(Long unitConvertRate) {
        this.unitConvertRate = unitConvertRate;
    }

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    public String getBatchCode() {
        return batchCode;
    }

    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode == null ? null : batchCode.trim();
    }

    public Long getReceiveQuantity() {
        return receiveQuantity;
    }

    public void setReceiveQuantity(Long receiveQuantity) {
        this.receiveQuantity = receiveQuantity;
    }

    public Long getCheckInQuantity() {
        return checkInQuantity;
    }

    public void setCheckInQuantity(Long checkInQuantity) {
        this.checkInQuantity = checkInQuantity;
    }

    public Long getCheckOutQuantity() {
        return checkOutQuantity;
    }

    public void setCheckOutQuantity(Long checkOutQuantity) {
        this.checkOutQuantity = checkOutQuantity;
    }

    public Integer getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Integer checkDate) {
        this.checkDate = checkDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getOverdueCode() {
        return overdueCode;
    }

    public void setOverdueCode(String overdueCode) {
        this.overdueCode = overdueCode == null ? null : overdueCode.trim();
    }

    public String getUnhealthyCode() {
        return unhealthyCode;
    }

    public void setUnhealthyCode(String unhealthyCode) {
        this.unhealthyCode = unhealthyCode == null ? null : unhealthyCode.trim();
    }

    public String getCheckBackCode() {
        return checkBackCode;
    }

    public void setCheckBackCode(String checkBackCode) {
        this.checkBackCode = checkBackCode == null ? null : checkBackCode.trim();
    }

    public Long getUnitPurchasePrice() {
        return unitPurchasePrice;
    }

    public void setUnitPurchasePrice(Long unitPurchasePrice) {
        this.unitPurchasePrice = unitPurchasePrice;
    }

    public Long getRmbUnitPurchasePrice() {
        return rmbUnitPurchasePrice;
    }

    public void setRmbUnitPurchasePrice(Long rmbUnitPurchasePrice) {
        this.rmbUnitPurchasePrice = rmbUnitPurchasePrice;
    }

    public Long getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Long purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Long getRmbPurchasePrice() {
        return rmbPurchasePrice;
    }

    public void setRmbPurchasePrice(Long rmbPurchasePrice) {
        this.rmbPurchasePrice = rmbPurchasePrice;
    }

    public Long getRmbPurchaseFee() {
        return rmbPurchaseFee;
    }

    public void setRmbPurchaseFee(Long rmbPurchaseFee) {
        this.rmbPurchaseFee = rmbPurchaseFee;
    }

    public String getNotPayCode() {
        return notPayCode;
    }

    public void setNotPayCode(String notPayCode) {
        this.notPayCode = notPayCode == null ? null : notPayCode.trim();
    }

    public String getCheckoutCode() {
        return checkoutCode;
    }

    public void setCheckoutCode(String checkoutCode) {
        this.checkoutCode = checkoutCode == null ? null : checkoutCode.trim();
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

    public Long getDebitPrice() {
        return debitPrice;
    }

    public void setDebitPrice(Long debitPrice) {
        this.debitPrice = debitPrice;
    }

    public Long getRmbDebitPrice() {
        return rmbDebitPrice;
    }

    public void setRmbDebitPrice(Long rmbDebitPrice) {
        this.rmbDebitPrice = rmbDebitPrice;
    }

    public String getDebitDesc() {
        return debitDesc;
    }

    public void setDebitDesc(String debitDesc) {
        this.debitDesc = debitDesc == null ? null : debitDesc.trim();
    }

    public Long getValuationQuantity() {
        return valuationQuantity;
    }

    public void setValuationQuantity(Long valuationQuantity) {
        this.valuationQuantity = valuationQuantity;
    }

    public Integer getReceiveWarehouseId() {
        return receiveWarehouseId;
    }

    public void setReceiveWarehouseId(Integer receiveWarehouseId) {
        this.receiveWarehouseId = receiveWarehouseId;
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
        sb.append(", receiveBillDetailId=").append(receiveBillDetailId);
        sb.append(", erpId=").append(erpId);
        sb.append(", receiveBillId=").append(receiveBillId);
        sb.append(", propertyId=").append(propertyId);
        sb.append(", code=").append(code);
        sb.append(", serialNumber=").append(serialNumber);
        sb.append(", receiveDate=").append(receiveDate);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", purchaseBillDetailId=").append(purchaseBillDetailId);
        sb.append(", materialId=").append(materialId);
        sb.append(", materialCategoryId=").append(materialCategoryId);
        sb.append(", currencyId=").append(currencyId);
        sb.append(", unit=").append(unit);
        sb.append(", unitConvertRate=").append(unitConvertRate);
        sb.append(", batchId=").append(batchId);
        sb.append(", batchCode=").append(batchCode);
        sb.append(", receiveQuantity=").append(receiveQuantity);
        sb.append(", checkInQuantity=").append(checkInQuantity);
        sb.append(", checkOutQuantity=").append(checkOutQuantity);
        sb.append(", checkDate=").append(checkDate);
        sb.append(", remark=").append(remark);
        sb.append(", overdueCode=").append(overdueCode);
        sb.append(", unhealthyCode=").append(unhealthyCode);
        sb.append(", checkBackCode=").append(checkBackCode);
        sb.append(", unitPurchasePrice=").append(unitPurchasePrice);
        sb.append(", rmbUnitPurchasePrice=").append(rmbUnitPurchasePrice);
        sb.append(", purchasePrice=").append(purchasePrice);
        sb.append(", rmbPurchasePrice=").append(rmbPurchasePrice);
        sb.append(", rmbPurchaseFee=").append(rmbPurchaseFee);
        sb.append(", notPayCode=").append(notPayCode);
        sb.append(", checkoutCode=").append(checkoutCode);
        sb.append(", confirmationCode=").append(confirmationCode);
        sb.append(", updateCode=").append(updateCode);
        sb.append(", transmissionCode=").append(transmissionCode);
        sb.append(", debitPrice=").append(debitPrice);
        sb.append(", rmbDebitPrice=").append(rmbDebitPrice);
        sb.append(", debitDesc=").append(debitDesc);
        sb.append(", valuationQuantity=").append(valuationQuantity);
        sb.append(", receiveWarehouseId=").append(receiveWarehouseId);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}