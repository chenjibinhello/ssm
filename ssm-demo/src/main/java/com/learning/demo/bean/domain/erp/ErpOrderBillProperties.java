package com.learning.demo.bean.domain.erp;

import java.io.Serializable;

public class ErpOrderBillProperties implements Serializable {
    private Integer propertyId;

    private Integer erpId;

    private String code;

    private String name;

    private Byte type;

    private String isAutocoding;

    private String usedNumber;

    private Boolean moneyPrecision;

    private String directConfirm;

    private String directPrint;

    private String updateCheckPrice;

    private String directSettleAccount;

    private Integer settleAccountBillId;

    private Integer created;

    private Integer updated;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    public Integer getErpId() {
        return erpId;
    }

    public void setErpId(Integer erpId) {
        this.erpId = erpId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getIsAutocoding() {
        return isAutocoding;
    }

    public void setIsAutocoding(String isAutocoding) {
        this.isAutocoding = isAutocoding == null ? null : isAutocoding.trim();
    }

    public String getUsedNumber() {
        return usedNumber;
    }

    public void setUsedNumber(String usedNumber) {
        this.usedNumber = usedNumber == null ? null : usedNumber.trim();
    }

    public Boolean getMoneyPrecision() {
        return moneyPrecision;
    }

    public void setMoneyPrecision(Boolean moneyPrecision) {
        this.moneyPrecision = moneyPrecision;
    }

    public String getDirectConfirm() {
        return directConfirm;
    }

    public void setDirectConfirm(String directConfirm) {
        this.directConfirm = directConfirm == null ? null : directConfirm.trim();
    }

    public String getDirectPrint() {
        return directPrint;
    }

    public void setDirectPrint(String directPrint) {
        this.directPrint = directPrint == null ? null : directPrint.trim();
    }

    public String getUpdateCheckPrice() {
        return updateCheckPrice;
    }

    public void setUpdateCheckPrice(String updateCheckPrice) {
        this.updateCheckPrice = updateCheckPrice == null ? null : updateCheckPrice.trim();
    }

    public String getDirectSettleAccount() {
        return directSettleAccount;
    }

    public void setDirectSettleAccount(String directSettleAccount) {
        this.directSettleAccount = directSettleAccount == null ? null : directSettleAccount.trim();
    }

    public Integer getSettleAccountBillId() {
        return settleAccountBillId;
    }

    public void setSettleAccountBillId(Integer settleAccountBillId) {
        this.settleAccountBillId = settleAccountBillId;
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
        sb.append(", propertyId=").append(propertyId);
        sb.append(", erpId=").append(erpId);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", isAutocoding=").append(isAutocoding);
        sb.append(", usedNumber=").append(usedNumber);
        sb.append(", moneyPrecision=").append(moneyPrecision);
        sb.append(", directConfirm=").append(directConfirm);
        sb.append(", directPrint=").append(directPrint);
        sb.append(", updateCheckPrice=").append(updateCheckPrice);
        sb.append(", directSettleAccount=").append(directSettleAccount);
        sb.append(", settleAccountBillId=").append(settleAccountBillId);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}