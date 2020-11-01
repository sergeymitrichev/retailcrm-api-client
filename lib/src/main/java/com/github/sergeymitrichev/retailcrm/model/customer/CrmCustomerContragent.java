package com.github.sergeymitrichev.retailcrm.model.customer;

import java.time.LocalDateTime;

public class CrmCustomerContragent {
  private CrmContragentType contragentType;
  private String legalName;
  private String legalAddress;
  private String INN;
  private String OKPO;
  private String KPP;
  private String OGRN;
  private String OGRNIP;
  private String certificateNumber;
  private LocalDateTime certificateDate;
  private String BIK;
  private String bank;
  private String bankAddress;
  private String corrAccount;
  private String bankAccount;

  public CrmCustomerContragent() {
  }

  public CrmContragentType getContragentType() {
    return contragentType;
  }

  public void setContragentType(CrmContragentType contragentType) {
    this.contragentType = contragentType;
  }

  public String getLegalName() {
    return legalName;
  }

  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }

  public String getLegalAddress() {
    return legalAddress;
  }

  public void setLegalAddress(String legalAddress) {
    this.legalAddress = legalAddress;
  }

  public String getINN() {
    return INN;
  }

  public void setINN(String INN) {
    this.INN = INN;
  }

  public String getOKPO() {
    return OKPO;
  }

  public void setOKPO(String OKPO) {
    this.OKPO = OKPO;
  }

  public String getKPP() {
    return KPP;
  }

  public void setKPP(String KPP) {
    this.KPP = KPP;
  }

  public String getOGRN() {
    return OGRN;
  }

  public void setOGRN(String OGRN) {
    this.OGRN = OGRN;
  }

  public String getOGRNIP() {
    return OGRNIP;
  }

  public void setOGRNIP(String OGRNIP) {
    this.OGRNIP = OGRNIP;
  }

  public String getCertificateNumber() {
    return certificateNumber;
  }

  public void setCertificateNumber(String certificateNumber) {
    this.certificateNumber = certificateNumber;
  }

  public LocalDateTime getCertificateDate() {
    return certificateDate;
  }

  public void setCertificateDate(LocalDateTime certificateDate) {
    this.certificateDate = certificateDate;
  }

  public String getBIK() {
    return BIK;
  }

  public void setBIK(String BIK) {
    this.BIK = BIK;
  }

  public String getBank() {
    return bank;
  }

  public void setBank(String bank) {
    this.bank = bank;
  }

  public String getBankAddress() {
    return bankAddress;
  }

  public void setBankAddress(String bankAddress) {
    this.bankAddress = bankAddress;
  }

  public String getCorrAccount() {
    return corrAccount;
  }

  public void setCorrAccount(String corrAccount) {
    this.corrAccount = corrAccount;
  }

  public String getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
  }
}
