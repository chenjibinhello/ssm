package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpSuppliers implements Serializable {
    private Integer supplierId;

    private Integer erpId;

    private String name;

    private String code;

    private String unifiedCode;

    private Integer openingDay;

    private Long capitalAmount;

    private Integer staffCount;

    private Integer beginTrade;

    private Integer lastTrade;

    private String abcLevel;

    private String deliveryLevel;

    private String qualityLevel;

    private String companyName;

    private Integer province;

    private Integer city;

    private Integer district;

    private String address;

    private String responsiblePersonName;

    private String liaisonName;

    private Integer currencyId;

    private String priceConditions;

    private String paymentConditions;

    private String phone;

    private String mobilePhone;

    private String faxNumber;

    private Integer accountingSubjectId;

    private String remark;

    private Long purchasePriceJan;

    private Integer purchaseCountJan;

    private Integer overdueCountJan;

    private Integer harmfulCountJan;

    private Long purchasePriceFeb;

    private Integer purchaseCountFeb;

    private Integer overdueCountFeb;

    private Integer harmfulCountFeb;

    private Long purchasePriceMar;

    private Integer purchaseCountMar;

    private Integer overdueCountMar;

    private Integer harmfulCountMar;

    private Long purchasePriceApr;

    private Integer purchaseCountApr;

    private Integer overdueCountApr;

    private Integer harmfulCountApr;

    private Long purchasePriceMay;

    private Integer purchaseCountMay;

    private Integer overdueCountMay;

    private Integer harmfulCountMay;

    private Long purchasePriceJune;

    private Integer purchaseCountJune;

    private Integer overdueCountJune;

    private Integer harmfulCountJune;

    private Long purchasePriceJuly;

    private Integer purchaseCountJuly;

    private Integer overdueCountJuly;

    private Integer harmfulCountJuly;

    private Long purchasePriceAug;

    private Integer purchaseCountAug;

    private Integer overdueCountAug;

    private Integer harmfulCountAug;

    private Long purchasePriceSept;

    private Integer purchaseCountSept;

    private Integer overdueCountSept;

    private Integer harmfulCountSept;

    private Long purchasePriceOct;

    private Integer purchaseCountOct;

    private Integer overdueCountOct;

    private Integer harmfulCountOct;

    private Long purchasePriceNov;

    private Integer purchaseCountNov;

    private Integer overdueCountNov;

    private Integer harmfulCountNov;

    private Long purchasePriceDec;

    private Integer purchaseCountDec;

    private Integer overdueCountDec;

    private Integer harmfulCountDec;

    private Byte checkoutMonth;

    private Byte checkoutDay;

    private Byte paymentMonth;

    private Byte paymentDay;

    private Byte voucherMonth;

    private Byte voucherDay;

    private Integer created;

    private Integer updated;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
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

    public String getUnifiedCode() {
        return unifiedCode;
    }

    public void setUnifiedCode(String unifiedCode) {
        this.unifiedCode = unifiedCode == null ? null : unifiedCode.trim();
    }

    public Integer getOpeningDay() {
        return openingDay;
    }

    public void setOpeningDay(Integer openingDay) {
        this.openingDay = openingDay;
    }

    public Long getCapitalAmount() {
        return capitalAmount;
    }

    public void setCapitalAmount(Long capitalAmount) {
        this.capitalAmount = capitalAmount;
    }

    public Integer getStaffCount() {
        return staffCount;
    }

    public void setStaffCount(Integer staffCount) {
        this.staffCount = staffCount;
    }

    public Integer getBeginTrade() {
        return beginTrade;
    }

    public void setBeginTrade(Integer beginTrade) {
        this.beginTrade = beginTrade;
    }

    public Integer getLastTrade() {
        return lastTrade;
    }

    public void setLastTrade(Integer lastTrade) {
        this.lastTrade = lastTrade;
    }

    public String getAbcLevel() {
        return abcLevel;
    }

    public void setAbcLevel(String abcLevel) {
        this.abcLevel = abcLevel == null ? null : abcLevel.trim();
    }

    public String getDeliveryLevel() {
        return deliveryLevel;
    }

    public void setDeliveryLevel(String deliveryLevel) {
        this.deliveryLevel = deliveryLevel == null ? null : deliveryLevel.trim();
    }

    public String getQualityLevel() {
        return qualityLevel;
    }

    public void setQualityLevel(String qualityLevel) {
        this.qualityLevel = qualityLevel == null ? null : qualityLevel.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public Integer getDistrict() {
        return district;
    }

    public void setDistrict(Integer district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getResponsiblePersonName() {
        return responsiblePersonName;
    }

    public void setResponsiblePersonName(String responsiblePersonName) {
        this.responsiblePersonName = responsiblePersonName == null ? null : responsiblePersonName.trim();
    }

    public String getLiaisonName() {
        return liaisonName;
    }

    public void setLiaisonName(String liaisonName) {
        this.liaisonName = liaisonName == null ? null : liaisonName.trim();
    }

    public Integer getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public String getPriceConditions() {
        return priceConditions;
    }

    public void setPriceConditions(String priceConditions) {
        this.priceConditions = priceConditions == null ? null : priceConditions.trim();
    }

    public String getPaymentConditions() {
        return paymentConditions;
    }

    public void setPaymentConditions(String paymentConditions) {
        this.paymentConditions = paymentConditions == null ? null : paymentConditions.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber == null ? null : faxNumber.trim();
    }

    public Integer getAccountingSubjectId() {
        return accountingSubjectId;
    }

    public void setAccountingSubjectId(Integer accountingSubjectId) {
        this.accountingSubjectId = accountingSubjectId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getPurchasePriceJan() {
        return purchasePriceJan;
    }

    public void setPurchasePriceJan(Long purchasePriceJan) {
        this.purchasePriceJan = purchasePriceJan;
    }

    public Integer getPurchaseCountJan() {
        return purchaseCountJan;
    }

    public void setPurchaseCountJan(Integer purchaseCountJan) {
        this.purchaseCountJan = purchaseCountJan;
    }

    public Integer getOverdueCountJan() {
        return overdueCountJan;
    }

    public void setOverdueCountJan(Integer overdueCountJan) {
        this.overdueCountJan = overdueCountJan;
    }

    public Integer getHarmfulCountJan() {
        return harmfulCountJan;
    }

    public void setHarmfulCountJan(Integer harmfulCountJan) {
        this.harmfulCountJan = harmfulCountJan;
    }

    public Long getPurchasePriceFeb() {
        return purchasePriceFeb;
    }

    public void setPurchasePriceFeb(Long purchasePriceFeb) {
        this.purchasePriceFeb = purchasePriceFeb;
    }

    public Integer getPurchaseCountFeb() {
        return purchaseCountFeb;
    }

    public void setPurchaseCountFeb(Integer purchaseCountFeb) {
        this.purchaseCountFeb = purchaseCountFeb;
    }

    public Integer getOverdueCountFeb() {
        return overdueCountFeb;
    }

    public void setOverdueCountFeb(Integer overdueCountFeb) {
        this.overdueCountFeb = overdueCountFeb;
    }

    public Integer getHarmfulCountFeb() {
        return harmfulCountFeb;
    }

    public void setHarmfulCountFeb(Integer harmfulCountFeb) {
        this.harmfulCountFeb = harmfulCountFeb;
    }

    public Long getPurchasePriceMar() {
        return purchasePriceMar;
    }

    public void setPurchasePriceMar(Long purchasePriceMar) {
        this.purchasePriceMar = purchasePriceMar;
    }

    public Integer getPurchaseCountMar() {
        return purchaseCountMar;
    }

    public void setPurchaseCountMar(Integer purchaseCountMar) {
        this.purchaseCountMar = purchaseCountMar;
    }

    public Integer getOverdueCountMar() {
        return overdueCountMar;
    }

    public void setOverdueCountMar(Integer overdueCountMar) {
        this.overdueCountMar = overdueCountMar;
    }

    public Integer getHarmfulCountMar() {
        return harmfulCountMar;
    }

    public void setHarmfulCountMar(Integer harmfulCountMar) {
        this.harmfulCountMar = harmfulCountMar;
    }

    public Long getPurchasePriceApr() {
        return purchasePriceApr;
    }

    public void setPurchasePriceApr(Long purchasePriceApr) {
        this.purchasePriceApr = purchasePriceApr;
    }

    public Integer getPurchaseCountApr() {
        return purchaseCountApr;
    }

    public void setPurchaseCountApr(Integer purchaseCountApr) {
        this.purchaseCountApr = purchaseCountApr;
    }

    public Integer getOverdueCountApr() {
        return overdueCountApr;
    }

    public void setOverdueCountApr(Integer overdueCountApr) {
        this.overdueCountApr = overdueCountApr;
    }

    public Integer getHarmfulCountApr() {
        return harmfulCountApr;
    }

    public void setHarmfulCountApr(Integer harmfulCountApr) {
        this.harmfulCountApr = harmfulCountApr;
    }

    public Long getPurchasePriceMay() {
        return purchasePriceMay;
    }

    public void setPurchasePriceMay(Long purchasePriceMay) {
        this.purchasePriceMay = purchasePriceMay;
    }

    public Integer getPurchaseCountMay() {
        return purchaseCountMay;
    }

    public void setPurchaseCountMay(Integer purchaseCountMay) {
        this.purchaseCountMay = purchaseCountMay;
    }

    public Integer getOverdueCountMay() {
        return overdueCountMay;
    }

    public void setOverdueCountMay(Integer overdueCountMay) {
        this.overdueCountMay = overdueCountMay;
    }

    public Integer getHarmfulCountMay() {
        return harmfulCountMay;
    }

    public void setHarmfulCountMay(Integer harmfulCountMay) {
        this.harmfulCountMay = harmfulCountMay;
    }

    public Long getPurchasePriceJune() {
        return purchasePriceJune;
    }

    public void setPurchasePriceJune(Long purchasePriceJune) {
        this.purchasePriceJune = purchasePriceJune;
    }

    public Integer getPurchaseCountJune() {
        return purchaseCountJune;
    }

    public void setPurchaseCountJune(Integer purchaseCountJune) {
        this.purchaseCountJune = purchaseCountJune;
    }

    public Integer getOverdueCountJune() {
        return overdueCountJune;
    }

    public void setOverdueCountJune(Integer overdueCountJune) {
        this.overdueCountJune = overdueCountJune;
    }

    public Integer getHarmfulCountJune() {
        return harmfulCountJune;
    }

    public void setHarmfulCountJune(Integer harmfulCountJune) {
        this.harmfulCountJune = harmfulCountJune;
    }

    public Long getPurchasePriceJuly() {
        return purchasePriceJuly;
    }

    public void setPurchasePriceJuly(Long purchasePriceJuly) {
        this.purchasePriceJuly = purchasePriceJuly;
    }

    public Integer getPurchaseCountJuly() {
        return purchaseCountJuly;
    }

    public void setPurchaseCountJuly(Integer purchaseCountJuly) {
        this.purchaseCountJuly = purchaseCountJuly;
    }

    public Integer getOverdueCountJuly() {
        return overdueCountJuly;
    }

    public void setOverdueCountJuly(Integer overdueCountJuly) {
        this.overdueCountJuly = overdueCountJuly;
    }

    public Integer getHarmfulCountJuly() {
        return harmfulCountJuly;
    }

    public void setHarmfulCountJuly(Integer harmfulCountJuly) {
        this.harmfulCountJuly = harmfulCountJuly;
    }

    public Long getPurchasePriceAug() {
        return purchasePriceAug;
    }

    public void setPurchasePriceAug(Long purchasePriceAug) {
        this.purchasePriceAug = purchasePriceAug;
    }

    public Integer getPurchaseCountAug() {
        return purchaseCountAug;
    }

    public void setPurchaseCountAug(Integer purchaseCountAug) {
        this.purchaseCountAug = purchaseCountAug;
    }

    public Integer getOverdueCountAug() {
        return overdueCountAug;
    }

    public void setOverdueCountAug(Integer overdueCountAug) {
        this.overdueCountAug = overdueCountAug;
    }

    public Integer getHarmfulCountAug() {
        return harmfulCountAug;
    }

    public void setHarmfulCountAug(Integer harmfulCountAug) {
        this.harmfulCountAug = harmfulCountAug;
    }

    public Long getPurchasePriceSept() {
        return purchasePriceSept;
    }

    public void setPurchasePriceSept(Long purchasePriceSept) {
        this.purchasePriceSept = purchasePriceSept;
    }

    public Integer getPurchaseCountSept() {
        return purchaseCountSept;
    }

    public void setPurchaseCountSept(Integer purchaseCountSept) {
        this.purchaseCountSept = purchaseCountSept;
    }

    public Integer getOverdueCountSept() {
        return overdueCountSept;
    }

    public void setOverdueCountSept(Integer overdueCountSept) {
        this.overdueCountSept = overdueCountSept;
    }

    public Integer getHarmfulCountSept() {
        return harmfulCountSept;
    }

    public void setHarmfulCountSept(Integer harmfulCountSept) {
        this.harmfulCountSept = harmfulCountSept;
    }

    public Long getPurchasePriceOct() {
        return purchasePriceOct;
    }

    public void setPurchasePriceOct(Long purchasePriceOct) {
        this.purchasePriceOct = purchasePriceOct;
    }

    public Integer getPurchaseCountOct() {
        return purchaseCountOct;
    }

    public void setPurchaseCountOct(Integer purchaseCountOct) {
        this.purchaseCountOct = purchaseCountOct;
    }

    public Integer getOverdueCountOct() {
        return overdueCountOct;
    }

    public void setOverdueCountOct(Integer overdueCountOct) {
        this.overdueCountOct = overdueCountOct;
    }

    public Integer getHarmfulCountOct() {
        return harmfulCountOct;
    }

    public void setHarmfulCountOct(Integer harmfulCountOct) {
        this.harmfulCountOct = harmfulCountOct;
    }

    public Long getPurchasePriceNov() {
        return purchasePriceNov;
    }

    public void setPurchasePriceNov(Long purchasePriceNov) {
        this.purchasePriceNov = purchasePriceNov;
    }

    public Integer getPurchaseCountNov() {
        return purchaseCountNov;
    }

    public void setPurchaseCountNov(Integer purchaseCountNov) {
        this.purchaseCountNov = purchaseCountNov;
    }

    public Integer getOverdueCountNov() {
        return overdueCountNov;
    }

    public void setOverdueCountNov(Integer overdueCountNov) {
        this.overdueCountNov = overdueCountNov;
    }

    public Integer getHarmfulCountNov() {
        return harmfulCountNov;
    }

    public void setHarmfulCountNov(Integer harmfulCountNov) {
        this.harmfulCountNov = harmfulCountNov;
    }

    public Long getPurchasePriceDec() {
        return purchasePriceDec;
    }

    public void setPurchasePriceDec(Long purchasePriceDec) {
        this.purchasePriceDec = purchasePriceDec;
    }

    public Integer getPurchaseCountDec() {
        return purchaseCountDec;
    }

    public void setPurchaseCountDec(Integer purchaseCountDec) {
        this.purchaseCountDec = purchaseCountDec;
    }

    public Integer getOverdueCountDec() {
        return overdueCountDec;
    }

    public void setOverdueCountDec(Integer overdueCountDec) {
        this.overdueCountDec = overdueCountDec;
    }

    public Integer getHarmfulCountDec() {
        return harmfulCountDec;
    }

    public void setHarmfulCountDec(Integer harmfulCountDec) {
        this.harmfulCountDec = harmfulCountDec;
    }

    public Byte getCheckoutMonth() {
        return checkoutMonth;
    }

    public void setCheckoutMonth(Byte checkoutMonth) {
        this.checkoutMonth = checkoutMonth;
    }

    public Byte getCheckoutDay() {
        return checkoutDay;
    }

    public void setCheckoutDay(Byte checkoutDay) {
        this.checkoutDay = checkoutDay;
    }

    public Byte getPaymentMonth() {
        return paymentMonth;
    }

    public void setPaymentMonth(Byte paymentMonth) {
        this.paymentMonth = paymentMonth;
    }

    public Byte getPaymentDay() {
        return paymentDay;
    }

    public void setPaymentDay(Byte paymentDay) {
        this.paymentDay = paymentDay;
    }

    public Byte getVoucherMonth() {
        return voucherMonth;
    }

    public void setVoucherMonth(Byte voucherMonth) {
        this.voucherMonth = voucherMonth;
    }

    public Byte getVoucherDay() {
        return voucherDay;
    }

    public void setVoucherDay(Byte voucherDay) {
        this.voucherDay = voucherDay;
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
        sb.append(", supplierId=").append(supplierId);
        sb.append(", erpId=").append(erpId);
        sb.append(", name=").append(name);
        sb.append(", code=").append(code);
        sb.append(", unifiedCode=").append(unifiedCode);
        sb.append(", openingDay=").append(openingDay);
        sb.append(", capitalAmount=").append(capitalAmount);
        sb.append(", staffCount=").append(staffCount);
        sb.append(", beginTrade=").append(beginTrade);
        sb.append(", lastTrade=").append(lastTrade);
        sb.append(", abcLevel=").append(abcLevel);
        sb.append(", deliveryLevel=").append(deliveryLevel);
        sb.append(", qualityLevel=").append(qualityLevel);
        sb.append(", companyName=").append(companyName);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", district=").append(district);
        sb.append(", address=").append(address);
        sb.append(", responsiblePersonName=").append(responsiblePersonName);
        sb.append(", liaisonName=").append(liaisonName);
        sb.append(", currencyId=").append(currencyId);
        sb.append(", priceConditions=").append(priceConditions);
        sb.append(", paymentConditions=").append(paymentConditions);
        sb.append(", phone=").append(phone);
        sb.append(", mobilePhone=").append(mobilePhone);
        sb.append(", faxNumber=").append(faxNumber);
        sb.append(", accountingSubjectId=").append(accountingSubjectId);
        sb.append(", remark=").append(remark);
        sb.append(", purchasePriceJan=").append(purchasePriceJan);
        sb.append(", purchaseCountJan=").append(purchaseCountJan);
        sb.append(", overdueCountJan=").append(overdueCountJan);
        sb.append(", harmfulCountJan=").append(harmfulCountJan);
        sb.append(", purchasePriceFeb=").append(purchasePriceFeb);
        sb.append(", purchaseCountFeb=").append(purchaseCountFeb);
        sb.append(", overdueCountFeb=").append(overdueCountFeb);
        sb.append(", harmfulCountFeb=").append(harmfulCountFeb);
        sb.append(", purchasePriceMar=").append(purchasePriceMar);
        sb.append(", purchaseCountMar=").append(purchaseCountMar);
        sb.append(", overdueCountMar=").append(overdueCountMar);
        sb.append(", harmfulCountMar=").append(harmfulCountMar);
        sb.append(", purchasePriceApr=").append(purchasePriceApr);
        sb.append(", purchaseCountApr=").append(purchaseCountApr);
        sb.append(", overdueCountApr=").append(overdueCountApr);
        sb.append(", harmfulCountApr=").append(harmfulCountApr);
        sb.append(", purchasePriceMay=").append(purchasePriceMay);
        sb.append(", purchaseCountMay=").append(purchaseCountMay);
        sb.append(", overdueCountMay=").append(overdueCountMay);
        sb.append(", harmfulCountMay=").append(harmfulCountMay);
        sb.append(", purchasePriceJune=").append(purchasePriceJune);
        sb.append(", purchaseCountJune=").append(purchaseCountJune);
        sb.append(", overdueCountJune=").append(overdueCountJune);
        sb.append(", harmfulCountJune=").append(harmfulCountJune);
        sb.append(", purchasePriceJuly=").append(purchasePriceJuly);
        sb.append(", purchaseCountJuly=").append(purchaseCountJuly);
        sb.append(", overdueCountJuly=").append(overdueCountJuly);
        sb.append(", harmfulCountJuly=").append(harmfulCountJuly);
        sb.append(", purchasePriceAug=").append(purchasePriceAug);
        sb.append(", purchaseCountAug=").append(purchaseCountAug);
        sb.append(", overdueCountAug=").append(overdueCountAug);
        sb.append(", harmfulCountAug=").append(harmfulCountAug);
        sb.append(", purchasePriceSept=").append(purchasePriceSept);
        sb.append(", purchaseCountSept=").append(purchaseCountSept);
        sb.append(", overdueCountSept=").append(overdueCountSept);
        sb.append(", harmfulCountSept=").append(harmfulCountSept);
        sb.append(", purchasePriceOct=").append(purchasePriceOct);
        sb.append(", purchaseCountOct=").append(purchaseCountOct);
        sb.append(", overdueCountOct=").append(overdueCountOct);
        sb.append(", harmfulCountOct=").append(harmfulCountOct);
        sb.append(", purchasePriceNov=").append(purchasePriceNov);
        sb.append(", purchaseCountNov=").append(purchaseCountNov);
        sb.append(", overdueCountNov=").append(overdueCountNov);
        sb.append(", harmfulCountNov=").append(harmfulCountNov);
        sb.append(", purchasePriceDec=").append(purchasePriceDec);
        sb.append(", purchaseCountDec=").append(purchaseCountDec);
        sb.append(", overdueCountDec=").append(overdueCountDec);
        sb.append(", harmfulCountDec=").append(harmfulCountDec);
        sb.append(", checkoutMonth=").append(checkoutMonth);
        sb.append(", checkoutDay=").append(checkoutDay);
        sb.append(", paymentMonth=").append(paymentMonth);
        sb.append(", paymentDay=").append(paymentDay);
        sb.append(", voucherMonth=").append(voucherMonth);
        sb.append(", voucherDay=").append(voucherDay);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}