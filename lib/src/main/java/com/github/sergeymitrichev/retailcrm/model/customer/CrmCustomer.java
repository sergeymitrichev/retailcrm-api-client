package com.github.sergeymitrichev.retailcrm.model.customer;

import com.github.sergeymitrichev.retailcrm.model.CrmExternalEntity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CrmCustomer extends CrmExternalEntity {

  private CrmCustomerType type;
  private boolean isContact;
  private LocalDateTime createdAt;
  private Integer managerId;
  private boolean vip;
  private boolean bad;
  private String site;
  private CrmCustomerContragent contragent;
  private Set<CrmCustomerTag> tags;
  private float avgMarginSumm;
  private float marginSumm;
  private float totalSumm;
  private float averageSumm;
  private int ordersCount;
  private int costSumm;

  //  customFields[]

  private double personalDiscount;
  private double cumulativeDiscount;
  private String discountCardNumber;
  private String firstClientId;
  private String lastClientId;
  private CrmCustomerAddress address;
  private List<CrmCustomerSegment> segments;
  private int maturationTime;
  private String firstName;
  private String lastName;
  private String patronymic;
  private CrmGenderType sex;
  private CrmGenderType presumableSex;
  private String email;
  private LocalDateTime emailMarketingUnsubscribedAt;
  private List<CrmCustomerPhone> phones = new ArrayList<>();
  private LocalDateTime birthday;
  private CrmSerializedSource source;
  private String photoUrl;

  public CrmCustomer() {
  }

  public CrmCustomer(String externalId, String phone) {
    super(externalId);
    this.addPhone(phone);
  }

  public Integer getManagerId() {
    return managerId;
  }

  public void setManagerId(Integer managerId) {
    this.managerId = managerId;
  }

  public List<CrmCustomerSegment> getSegments() {
    return segments;
  }

  public void setSegments(List<CrmCustomerSegment> segments) {
    this.segments = segments;
  }

  public CrmCustomerContragent getContragent() {
    return contragent;
  }

  public void setContragent(CrmCustomerContragent contragent) {
    this.contragent = contragent;
  }

  public Set<CrmCustomerTag> getTags() {
    return tags;
  }

  public void setTags(Set<CrmCustomerTag> tags) {
    this.tags = tags;
  }

  public CrmSerializedSource getSource() {
    return source;
  }

  public void setSource(CrmSerializedSource source) {
    this.source = source;
  }

  public CrmCustomerType getType() {
    return type;
  }

  public void setType(CrmCustomerType type) {
    this.type = type;
  }

  public boolean isContact() {
    return isContact;
  }

  public void setContact(boolean contact) {
    isContact = contact;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public boolean isVip() {
    return vip;
  }

  public void setVip(boolean vip) {
    this.vip = vip;
  }

  public boolean isBad() {
    return bad;
  }

  public void setBad(boolean bad) {
    this.bad = bad;
  }

  public String getSite() {
    return site;
  }

  public void setSite(String site) {
    this.site = site;
  }

  public float getAvgMarginSumm() {
    return avgMarginSumm;
  }

  public void setAvgMarginSumm(float avgMarginSumm) {
    this.avgMarginSumm = avgMarginSumm;
  }

  public float getMarginSumm() {
    return marginSumm;
  }

  public void setMarginSumm(float marginSumm) {
    this.marginSumm = marginSumm;
  }

  public float getTotalSumm() {
    return totalSumm;
  }

  public List<CrmCustomerPhone> getPhones() {
    return phones;
  }

  public void setPhones(List<CrmCustomerPhone> phones) {
    this.phones.clear(); this.phones.addAll(phones);
  }

  public CrmCustomerAddress getAddress() {
    return address;
  }

  public void setAddress(CrmCustomerAddress address) {
    this.address = address;
  }

  public void setTotalSumm(float totalSumm) {
    this.totalSumm = totalSumm;
  }

  public float getAverageSumm() {
    return averageSumm;
  }

  public void setAverageSumm(float averageSumm) {
    this.averageSumm = averageSumm;
  }

  public int getOrdersCount() {
    return ordersCount;
  }

  public void setOrdersCount(int ordersCount) {
    this.ordersCount = ordersCount;
  }

  public int getCostSumm() {
    return costSumm;
  }

  public void setCostSumm(int costSumm) {
    this.costSumm = costSumm;
  }

  public double getPersonalDiscount() {
    return personalDiscount;
  }

  public void setPersonalDiscount(double personalDiscount) {
    this.personalDiscount = personalDiscount;
  }

  public double getCumulativeDiscount() {
    return cumulativeDiscount;
  }

  public void setCumulativeDiscount(double cumulativeDiscount) {
    this.cumulativeDiscount = cumulativeDiscount;
  }

  public String getDiscountCardNumber() {
    return discountCardNumber;
  }

  public void setDiscountCardNumber(String discountCardNumber) {
    this.discountCardNumber = discountCardNumber;
  }

  public String getFirstClientId() {
    return firstClientId;
  }

  public void setFirstClientId(String firstClientId) {
    this.firstClientId = firstClientId;
  }

  public String getLastClientId() {
    return lastClientId;
  }

  public void setLastClientId(String lastClientId) {
    this.lastClientId = lastClientId;
  }

  public int getMaturationTime() {
    return maturationTime;
  }

  public void setMaturationTime(int maturationTime) {
    this.maturationTime = maturationTime;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPatronymic() {
    return patronymic;
  }

  public void setPatronymic(String patronymic) {
    this.patronymic = patronymic;
  }

  public CrmGenderType getSex() {
    return sex;
  }

  public void setSex(CrmGenderType sex) {
    this.sex = sex;
  }

  public CrmGenderType getPresumableSex() {
    return presumableSex;
  }

  public void setPresumableSex(CrmGenderType presumableSex) {
    this.presumableSex = presumableSex;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public LocalDateTime getEmailMarketingUnsubscribedAt() {
    return emailMarketingUnsubscribedAt;
  }

  public void setEmailMarketingUnsubscribedAt(LocalDateTime emailMarketingUnsubscribedAt) {
    this.emailMarketingUnsubscribedAt = emailMarketingUnsubscribedAt;
  }

  public LocalDateTime getBirthday() {
    return birthday;
  }

  public void setBirthday(LocalDateTime birthday) {
    this.birthday = birthday;
  }

  public String getPhotoUrl() {
    return photoUrl;
  }

  public void setPhotoUrl(String photoUrl) {
    this.photoUrl = photoUrl;
  }

  public void addPhone(String number) {
    this.phones.add(new CrmCustomerPhone(number));
  }
}
