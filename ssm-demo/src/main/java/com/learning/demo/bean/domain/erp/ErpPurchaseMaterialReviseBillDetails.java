package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpPurchaseMaterialReviseBillDetails implements Serializable {
    private Integer materialReviseBillDetailId;

    private Integer materialReviseBillId;

    private Integer erpId;

    private Integer propertyId;

    private String code;

    private String serialNumber;

    private Integer materialId;

    private String manufacturerMaterialCode;

    private String valuationUnit;

    private String instruction;

    private Long unitPrice;

    private Integer checkDate;

    private Long originUnitPrice;

    private Integer originCheckDate;

    private String originManufacturerMaterialCode;

    private String orginValuationUnit;

    private Integer supplierId;

    private String confirmationCode;

    private Integer created;

    private Integer updated;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getMaterialReviseBillDetailId() {
        return materialReviseBillDetailId;
    }

    public void setMaterialReviseBillDetailId(Integer materialReviseBillDetailId) {
        this.materialReviseBillDetailId = materialReviseBillDetailId;
    }

    public Integer getMaterialReviseBillId() {
        return materialReviseBillId;
    }

    public void setMaterialReviseBillId(Integer materialReviseBillId) {
        this.materialReviseBillId = materialReviseBillId;
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

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    public String getManufacturerMaterialCode() {
        return manufacturerMaterialCode;
    }

    public void setManufacturerMaterialCode(String manufacturerMaterialCode) {
        this.manufacturerMaterialCode = manufacturerMaterialCode == null ? null : manufacturerMaterialCode.trim();
    }

    public String getValuationUnit() {
        return valuationUnit;
    }

    public void setValuationUnit(String valuationUnit) {
        this.valuationUnit = valuationUnit == null ? null : valuationUnit.trim();
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction == null ? null : instruction.trim();
    }

    public Long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Integer checkDate) {
        this.checkDate = checkDate;
    }

    public Long getOriginUnitPrice() {
        return originUnitPrice;
    }

    public void setOriginUnitPrice(Long originUnitPrice) {
        this.originUnitPrice = originUnitPrice;
    }

    public Integer getOriginCheckDate() {
        return originCheckDate;
    }

    public void setOriginCheckDate(Integer originCheckDate) {
        this.originCheckDate = originCheckDate;
    }

    public String getOriginManufacturerMaterialCode() {
        return originManufacturerMaterialCode;
    }

    public void setOriginManufacturerMaterialCode(String originManufacturerMaterialCode) {
        this.originManufacturerMaterialCode = originManufacturerMaterialCode == null ? null : originManufacturerMaterialCode.trim();
    }

    public String getOrginValuationUnit() {
        return orginValuationUnit;
    }

    public void setOrginValuationUnit(String orginValuationUnit) {
        this.orginValuationUnit = orginValuationUnit == null ? null : orginValuationUnit.trim();
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getConfirmationCode() {
        return confirmationCode;
    }

    public void setConfirmationCode(String confirmationCode) {
        this.confirmationCode = confirmationCode == null ? null : confirmationCode.trim();
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
        sb.append(", materialReviseBillDetailId=").append(materialReviseBillDetailId);
        sb.append(", materialReviseBillId=").append(materialReviseBillId);
        sb.append(", erpId=").append(erpId);
        sb.append(", propertyId=").append(propertyId);
        sb.append(", code=").append(code);
        sb.append(", serialNumber=").append(serialNumber);
        sb.append(", materialId=").append(materialId);
        sb.append(", manufacturerMaterialCode=").append(manufacturerMaterialCode);
        sb.append(", valuationUnit=").append(valuationUnit);
        sb.append(", instruction=").append(instruction);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append(", checkDate=").append(checkDate);
        sb.append(", originUnitPrice=").append(originUnitPrice);
        sb.append(", originCheckDate=").append(originCheckDate);
        sb.append(", originManufacturerMaterialCode=").append(originManufacturerMaterialCode);
        sb.append(", orginValuationUnit=").append(orginValuationUnit);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", confirmationCode=").append(confirmationCode);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}