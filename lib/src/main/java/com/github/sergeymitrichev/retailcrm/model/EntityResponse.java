package com.github.sergeymitrichev.retailcrm.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.github.sergeymitrichev.retailcrm.model.customer.CrmCustomer;
import com.github.sergeymitrichev.retailcrm.model.order.CrmOrder;

public class EntityResponse<T extends CrmEntity> extends ApiResponse {

  @JsonSubTypes(value = {
    @JsonSubTypes.Type(value = CrmCustomer.class),
    @JsonSubTypes.Type(value = CrmOrder.class),
  })
  @JsonAlias({ "customer", "order" })
  private T entity;

  public EntityResponse() {
  }

  public T getEntity() {
    return entity;
  }

  public void setEntity(T entity) {
    this.entity = entity;
  }
}
