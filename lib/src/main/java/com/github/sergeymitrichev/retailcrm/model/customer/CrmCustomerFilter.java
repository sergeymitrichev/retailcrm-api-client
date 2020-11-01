package com.github.sergeymitrichev.retailcrm.model.customer;

public class CrmCustomerFilter {
  private String name;

  public CrmCustomerFilter() {
  }

  public CrmCustomerFilter(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
