package com.github.sergeymitrichev.retailcrm.model.order;

import com.github.sergeymitrichev.retailcrm.model.customer.CrmCustomer;
import com.github.sergeymitrichev.retailcrm.model.customer.CrmSerializedSource;
import com.github.sergeymitrichev.retailcrm.model.CrmExternalEntity;
import com.github.sergeymitrichev.retailcrm.model.company.CrmCompany;
import com.github.sergeymitrichev.retailcrm.model.company.CrmContragent;
import com.github.sergeymitrichev.retailcrm.model.customer.CrmContact;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class CrmOrder extends CrmExternalEntity {

  private double summ;
  private String number;
  private String orderType;
  private String orderMethod;
  private String countryIso;
  private LocalDateTime createdAt;
  private LocalDateTime statusUpdatedAt;
  private double totalSumm;
  private double prepaySum;
  private double purchaseSumm;
  private int mark;
  private LocalDateTime markDatetime;
  private String lastName;
  private String firstName;
  private String patronymic;
  private String phone;
  private String additionalPhone;
  private String email;
  private boolean call;
  private boolean expired;
  private String customerComment;
  private String managerComment;
  private int managerId;
  private CrmCustomer customer;
  private CrmContact contact;
  private CrmCompany company;
  private CrmContragent contragent;
  private CrmOrderDelivery delivery;
// TODO private CrmMarketplaceData marketplace;
  private String site;
  private String status;
  private String statusComment;
  private CrmSerializedSource source;
  private List<CrmOrderProduct> items;
  private LocalDateTime fullPaidAt;
// TODO private List<CrmPayments> payments;
  private boolean fromApi;
  private double weight;
  private int length;
  private int width;
  private int height;
  private String shipmentStore;
  private LocalDate shipmentDate;
  private boolean shipped;
  // TODO private List<CustomField> customFields
  private String clientId;

  public CrmOrder() {
  }

  public double getSumm() {
    return summ;
  }

  public void setSumm(double summ) {
    this.summ = summ;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getOrderType() {
    return orderType;
  }

  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }

  public String getOrderMethod() {
    return orderMethod;
  }

  public void setOrderMethod(String orderMethod) {
    this.orderMethod = orderMethod;
  }

  public String getCountryIso() {
    return countryIso;
  }

  public void setCountryIso(String countryIso) {
    this.countryIso = countryIso;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public LocalDateTime getStatusUpdatedAt() {
    return statusUpdatedAt;
  }

  public void setStatusUpdatedAt(LocalDateTime statusUpdatedAt) {
    this.statusUpdatedAt = statusUpdatedAt;
  }

  public double getTotalSumm() {
    return totalSumm;
  }

  public void setTotalSumm(double totalSumm) {
    this.totalSumm = totalSumm;
  }

  public double getPrepaySum() {
    return prepaySum;
  }

  public void setPrepaySum(double prepaySum) {
    this.prepaySum = prepaySum;
  }

  public double getPurchaseSumm() {
    return purchaseSumm;
  }

  public void setPurchaseSumm(double purchaseSumm) {
    this.purchaseSumm = purchaseSumm;
  }

  public int getMark() {
    return mark;
  }

  public void setMark(int mark) {
    this.mark = mark;
  }

  public LocalDateTime getMarkDatetime() {
    return markDatetime;
  }

  public void setMarkDatetime(LocalDateTime markDatetime) {
    this.markDatetime = markDatetime;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getPatronymic() {
    return patronymic;
  }

  public void setPatronymic(String patronymic) {
    this.patronymic = patronymic;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getAdditionalPhone() {
    return additionalPhone;
  }

  public void setAdditionalPhone(String additionalPhone) {
    this.additionalPhone = additionalPhone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public boolean isCall() {
    return call;
  }

  public void setCall(boolean call) {
    this.call = call;
  }

  public boolean isExpired() {
    return expired;
  }

  public void setExpired(boolean expired) {
    this.expired = expired;
  }

  public String getCustomerComment() {
    return customerComment;
  }

  public void setCustomerComment(String customerComment) {
    this.customerComment = customerComment;
  }

  public String getManagerComment() {
    return managerComment;
  }

  public void setManagerComment(String managerComment) {
    this.managerComment = managerComment;
  }

  public int getManagerId() {
    return managerId;
  }

  public void setManagerId(int managerId) {
    this.managerId = managerId;
  }

  public CrmCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(CrmCustomer customer) {
    this.customer = customer;
  }

  public CrmContact getContact() {
    return contact;
  }

  public void setContact(CrmContact contact) {
    this.contact = contact;
  }

  public CrmCompany getCompany() {
    return company;
  }

  public void setCompany(CrmCompany company) {
    this.company = company;
  }

  public CrmContragent getContragent() {
    return contragent;
  }

  public void setContragent(CrmContragent contragent) {
    this.contragent = contragent;
  }

  public CrmOrderDelivery getDelivery() {
    return delivery;
  }

  public void setDelivery(CrmOrderDelivery delivery) {
    this.delivery = delivery;
  }

  public String getSite() {
    return site;
  }

  public void setSite(String site) {
    this.site = site;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getStatusComment() {
    return statusComment;
  }

  public void setStatusComment(String statusComment) {
    this.statusComment = statusComment;
  }

  public CrmSerializedSource getSource() {
    return source;
  }

  public void setSource(CrmSerializedSource source) {
    this.source = source;
  }

  public List<CrmOrderProduct> getItems() {
    return items;
  }

  public void setItems(List<CrmOrderProduct> items) {
    this.items = items;
  }

  public LocalDateTime getFullPaidAt() {
    return fullPaidAt;
  }

  public void setFullPaidAt(LocalDateTime fullPaidAt) {
    this.fullPaidAt = fullPaidAt;
  }

  public boolean isFromApi() {
    return fromApi;
  }

  public void setFromApi(boolean fromApi) {
    this.fromApi = fromApi;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public String getShipmentStore() {
    return shipmentStore;
  }

  public void setShipmentStore(String shipmentStore) {
    this.shipmentStore = shipmentStore;
  }

  public LocalDate getShipmentDate() {
    return shipmentDate;
  }

  public void setShipmentDate(LocalDate shipmentDate) {
    this.shipmentDate = shipmentDate;
  }

  public boolean isShipped() {
    return shipped;
  }

  public void setShipped(boolean shipped) {
    this.shipped = shipped;
  }

  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }
}
