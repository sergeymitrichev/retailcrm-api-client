package com.github.sergeymitrichev.retailcrm.model.customer;

public class CrmCustomerPhone {
  private String number;

  public CrmCustomerPhone() {
  }

  public CrmCustomerPhone(String number) {
    this.number = number;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }
}
