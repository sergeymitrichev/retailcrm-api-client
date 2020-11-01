package com.github.sergeymitrichev.retailcrm.model.customer;

import com.github.sergeymitrichev.retailcrm.model.CrmEntity;

import java.time.LocalDateTime;

public class CrmCustomerSegment extends CrmEntity {
  private String code;
  private String name;
  private LocalDateTime createdAt;
  private boolean isDynamic;
  private Integer customersCount;
  private boolean active;

  public CrmCustomerSegment() {
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public boolean isDynamic() {
    return isDynamic;
  }

  public void setDynamic(boolean dynamic) {
    isDynamic = dynamic;
  }

  public Integer getCustomersCount() {
    return customersCount;
  }

  public void setCustomersCount(Integer customersCount) {
    this.customersCount = customersCount;
  }

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }
}
