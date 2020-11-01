package com.github.sergeymitrichev.retailcrm.model.customer;

public class CrmCustomerTag {
  private String name;
  private String color;
  private boolean attached;

  public CrmCustomerTag() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean isAttached() {
    return attached;
  }

  public void setAttached(boolean attached) {
    this.attached = attached;
  }
}
