package com.github.sergeymitrichev.retailcrm.model;

abstract public class CrmExternalEntity extends CrmEntity {
  private String externalId;

  public CrmExternalEntity() {
  }

  public CrmExternalEntity(String externalId) {
    this.externalId = externalId;
  }

  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }
}
