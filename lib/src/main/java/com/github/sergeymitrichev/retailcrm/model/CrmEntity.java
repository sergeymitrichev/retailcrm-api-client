package com.github.sergeymitrichev.retailcrm.model;

abstract public class CrmEntity {
  private Long id;

  public CrmEntity() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
