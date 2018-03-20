package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpMaterials implements Serializable {
    private Integer materialId;

    private Integer erpId;

    private String name;

    private String code;

    private String spec;

    private Integer categoryId;

    private String stockUnit;

    private String weightUnit;

    private String convertUnitOne;

    private Long convertRateOne;

    private String convertUnitTwo;

    private Long convertRateTwo;

    private Long unitWeight;

    private String source;

    private String isBonded;

    private String isFictitious;

    private Integer lowLevelCode;

    private String isBatchManager;

    private Integer warehouseId;

    private Integer supplierId;

    private Integer planUserId;

    private String replenishmentPolicy;

    private Boolean replenishmentPeriod;

    private Integer preposeDays;

    private Long securityStock;

    private Long replenishmentPoint;

    private Long economicBatch;

    private Long lowestBacch;

    private Long replenishmentTimes;

    private Long requestTimes;

    private String abcLevel;

    private String checkCode;

    private Long standardPurchasePrice;

    private Long standardSalePrice;

    private Long materialCost;

    private Long labourCost;

    private Long makeCost;

    private Long currentLabourCost;

    private Long currentMakeCost;

    private Long recentPurchasePrice;

    private Long stockQuantity;

    private Long stockCost;

    private Long monthQuantity;

    private Long monthCost;

    private Integer recentStorageInDate;

    private Integer recentStorageOutDate;

    private Integer effectiveDays;

    private Integer recheckDays;

    private Long batchQuantity;

    private Boolean drawMethod;

    private Boolean checkMethod;

    private String remark;

    private Long processingCost;

    private Long currentProcessingCost;

    private Long overReceiveRate;

    private String selectionMethod;

    private Integer created;

    private Integer updated;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    public Integer getErpId() {
        return erpId;
    }

    public void setErpId(Integer erpId) {
        this.erpId = erpId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec == null ? null : spec.trim();
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getStockUnit() {
        return stockUnit;
    }

    public void setStockUnit(String stockUnit) {
        this.stockUnit = stockUnit == null ? null : stockUnit.trim();
    }

    public String getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit == null ? null : weightUnit.trim();
    }

    public String getConvertUnitOne() {
        return convertUnitOne;
    }

    public void setConvertUnitOne(String convertUnitOne) {
        this.convertUnitOne = convertUnitOne == null ? null : convertUnitOne.trim();
    }

    public Long getConvertRateOne() {
        return convertRateOne;
    }

    public void setConvertRateOne(Long convertRateOne) {
        this.convertRateOne = convertRateOne;
    }

    public String getConvertUnitTwo() {
        return convertUnitTwo;
    }

    public void setConvertUnitTwo(String convertUnitTwo) {
        this.convertUnitTwo = convertUnitTwo == null ? null : convertUnitTwo.trim();
    }

    public Long getConvertRateTwo() {
        return convertRateTwo;
    }

    public void setConvertRateTwo(Long convertRateTwo) {
        this.convertRateTwo = convertRateTwo;
    }

    public Long getUnitWeight() {
        return unitWeight;
    }

    public void setUnitWeight(Long unitWeight) {
        this.unitWeight = unitWeight;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getIsBonded() {
        return isBonded;
    }

    public void setIsBonded(String isBonded) {
        this.isBonded = isBonded == null ? null : isBonded.trim();
    }

    public String getIsFictitious() {
        return isFictitious;
    }

    public void setIsFictitious(String isFictitious) {
        this.isFictitious = isFictitious == null ? null : isFictitious.trim();
    }

    public Integer getLowLevelCode() {
        return lowLevelCode;
    }

    public void setLowLevelCode(Integer lowLevelCode) {
        this.lowLevelCode = lowLevelCode;
    }

    public String getIsBatchManager() {
        return isBatchManager;
    }

    public void setIsBatchManager(String isBatchManager) {
        this.isBatchManager = isBatchManager == null ? null : isBatchManager.trim();
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getPlanUserId() {
        return planUserId;
    }

    public void setPlanUserId(Integer planUserId) {
        this.planUserId = planUserId;
    }

    public String getReplenishmentPolicy() {
        return replenishmentPolicy;
    }

    public void setReplenishmentPolicy(String replenishmentPolicy) {
        this.replenishmentPolicy = replenishmentPolicy == null ? null : replenishmentPolicy.trim();
    }

    public Boolean getReplenishmentPeriod() {
        return replenishmentPeriod;
    }

    public void setReplenishmentPeriod(Boolean replenishmentPeriod) {
        this.replenishmentPeriod = replenishmentPeriod;
    }

    public Integer getPreposeDays() {
        return preposeDays;
    }

    public void setPreposeDays(Integer preposeDays) {
        this.preposeDays = preposeDays;
    }

    public Long getSecurityStock() {
        return securityStock;
    }

    public void setSecurityStock(Long securityStock) {
        this.securityStock = securityStock;
    }

    public Long getReplenishmentPoint() {
        return replenishmentPoint;
    }

    public void setReplenishmentPoint(Long replenishmentPoint) {
        this.replenishmentPoint = replenishmentPoint;
    }

    public Long getEconomicBatch() {
        return economicBatch;
    }

    public void setEconomicBatch(Long economicBatch) {
        this.economicBatch = economicBatch;
    }

    public Long getLowestBacch() {
        return lowestBacch;
    }

    public void setLowestBacch(Long lowestBacch) {
        this.lowestBacch = lowestBacch;
    }

    public Long getReplenishmentTimes() {
        return replenishmentTimes;
    }

    public void setReplenishmentTimes(Long replenishmentTimes) {
        this.replenishmentTimes = replenishmentTimes;
    }

    public Long getRequestTimes() {
        return requestTimes;
    }

    public void setRequestTimes(Long requestTimes) {
        this.requestTimes = requestTimes;
    }

    public String getAbcLevel() {
        return abcLevel;
    }

    public void setAbcLevel(String abcLevel) {
        this.abcLevel = abcLevel == null ? null : abcLevel.trim();
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode == null ? null : checkCode.trim();
    }

    public Long getStandardPurchasePrice() {
        return standardPurchasePrice;
    }

    public void setStandardPurchasePrice(Long standardPurchasePrice) {
        this.standardPurchasePrice = standardPurchasePrice;
    }

    public Long getStandardSalePrice() {
        return standardSalePrice;
    }

    public void setStandardSalePrice(Long standardSalePrice) {
        this.standardSalePrice = standardSalePrice;
    }

    public Long getMaterialCost() {
        return materialCost;
    }

    public void setMaterialCost(Long materialCost) {
        this.materialCost = materialCost;
    }

    public Long getLabourCost() {
        return labourCost;
    }

    public void setLabourCost(Long labourCost) {
        this.labourCost = labourCost;
    }

    public Long getMakeCost() {
        return makeCost;
    }

    public void setMakeCost(Long makeCost) {
        this.makeCost = makeCost;
    }

    public Long getCurrentLabourCost() {
        return currentLabourCost;
    }

    public void setCurrentLabourCost(Long currentLabourCost) {
        this.currentLabourCost = currentLabourCost;
    }

    public Long getCurrentMakeCost() {
        return currentMakeCost;
    }

    public void setCurrentMakeCost(Long currentMakeCost) {
        this.currentMakeCost = currentMakeCost;
    }

    public Long getRecentPurchasePrice() {
        return recentPurchasePrice;
    }

    public void setRecentPurchasePrice(Long recentPurchasePrice) {
        this.recentPurchasePrice = recentPurchasePrice;
    }

    public Long getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Long stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public Long getStockCost() {
        return stockCost;
    }

    public void setStockCost(Long stockCost) {
        this.stockCost = stockCost;
    }

    public Long getMonthQuantity() {
        return monthQuantity;
    }

    public void setMonthQuantity(Long monthQuantity) {
        this.monthQuantity = monthQuantity;
    }

    public Long getMonthCost() {
        return monthCost;
    }

    public void setMonthCost(Long monthCost) {
        this.monthCost = monthCost;
    }

    public Integer getRecentStorageInDate() {
        return recentStorageInDate;
    }

    public void setRecentStorageInDate(Integer recentStorageInDate) {
        this.recentStorageInDate = recentStorageInDate;
    }

    public Integer getRecentStorageOutDate() {
        return recentStorageOutDate;
    }

    public void setRecentStorageOutDate(Integer recentStorageOutDate) {
        this.recentStorageOutDate = recentStorageOutDate;
    }

    public Integer getEffectiveDays() {
        return effectiveDays;
    }

    public void setEffectiveDays(Integer effectiveDays) {
        this.effectiveDays = effectiveDays;
    }

    public Integer getRecheckDays() {
        return recheckDays;
    }

    public void setRecheckDays(Integer recheckDays) {
        this.recheckDays = recheckDays;
    }

    public Long getBatchQuantity() {
        return batchQuantity;
    }

    public void setBatchQuantity(Long batchQuantity) {
        this.batchQuantity = batchQuantity;
    }

    public Boolean getDrawMethod() {
        return drawMethod;
    }

    public void setDrawMethod(Boolean drawMethod) {
        this.drawMethod = drawMethod;
    }

    public Boolean getCheckMethod() {
        return checkMethod;
    }

    public void setCheckMethod(Boolean checkMethod) {
        this.checkMethod = checkMethod;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getProcessingCost() {
        return processingCost;
    }

    public void setProcessingCost(Long processingCost) {
        this.processingCost = processingCost;
    }

    public Long getCurrentProcessingCost() {
        return currentProcessingCost;
    }

    public void setCurrentProcessingCost(Long currentProcessingCost) {
        this.currentProcessingCost = currentProcessingCost;
    }

    public Long getOverReceiveRate() {
        return overReceiveRate;
    }

    public void setOverReceiveRate(Long overReceiveRate) {
        this.overReceiveRate = overReceiveRate;
    }

    public String getSelectionMethod() {
        return selectionMethod;
    }

    public void setSelectionMethod(String selectionMethod) {
        this.selectionMethod = selectionMethod == null ? null : selectionMethod.trim();
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
        sb.append(", materialId=").append(materialId);
        sb.append(", erpId=").append(erpId);
        sb.append(", name=").append(name);
        sb.append(", code=").append(code);
        sb.append(", spec=").append(spec);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", stockUnit=").append(stockUnit);
        sb.append(", weightUnit=").append(weightUnit);
        sb.append(", convertUnitOne=").append(convertUnitOne);
        sb.append(", convertRateOne=").append(convertRateOne);
        sb.append(", convertUnitTwo=").append(convertUnitTwo);
        sb.append(", convertRateTwo=").append(convertRateTwo);
        sb.append(", unitWeight=").append(unitWeight);
        sb.append(", source=").append(source);
        sb.append(", isBonded=").append(isBonded);
        sb.append(", isFictitious=").append(isFictitious);
        sb.append(", lowLevelCode=").append(lowLevelCode);
        sb.append(", isBatchManager=").append(isBatchManager);
        sb.append(", warehouseId=").append(warehouseId);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", planUserId=").append(planUserId);
        sb.append(", replenishmentPolicy=").append(replenishmentPolicy);
        sb.append(", replenishmentPeriod=").append(replenishmentPeriod);
        sb.append(", preposeDays=").append(preposeDays);
        sb.append(", securityStock=").append(securityStock);
        sb.append(", replenishmentPoint=").append(replenishmentPoint);
        sb.append(", economicBatch=").append(economicBatch);
        sb.append(", lowestBacch=").append(lowestBacch);
        sb.append(", replenishmentTimes=").append(replenishmentTimes);
        sb.append(", requestTimes=").append(requestTimes);
        sb.append(", abcLevel=").append(abcLevel);
        sb.append(", checkCode=").append(checkCode);
        sb.append(", standardPurchasePrice=").append(standardPurchasePrice);
        sb.append(", standardSalePrice=").append(standardSalePrice);
        sb.append(", materialCost=").append(materialCost);
        sb.append(", labourCost=").append(labourCost);
        sb.append(", makeCost=").append(makeCost);
        sb.append(", currentLabourCost=").append(currentLabourCost);
        sb.append(", currentMakeCost=").append(currentMakeCost);
        sb.append(", recentPurchasePrice=").append(recentPurchasePrice);
        sb.append(", stockQuantity=").append(stockQuantity);
        sb.append(", stockCost=").append(stockCost);
        sb.append(", monthQuantity=").append(monthQuantity);
        sb.append(", monthCost=").append(monthCost);
        sb.append(", recentStorageInDate=").append(recentStorageInDate);
        sb.append(", recentStorageOutDate=").append(recentStorageOutDate);
        sb.append(", effectiveDays=").append(effectiveDays);
        sb.append(", recheckDays=").append(recheckDays);
        sb.append(", batchQuantity=").append(batchQuantity);
        sb.append(", drawMethod=").append(drawMethod);
        sb.append(", checkMethod=").append(checkMethod);
        sb.append(", remark=").append(remark);
        sb.append(", processingCost=").append(processingCost);
        sb.append(", currentProcessingCost=").append(currentProcessingCost);
        sb.append(", overReceiveRate=").append(overReceiveRate);
        sb.append(", selectionMethod=").append(selectionMethod);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}