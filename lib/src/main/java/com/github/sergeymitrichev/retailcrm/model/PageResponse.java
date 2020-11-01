package com.github.sergeymitrichev.retailcrm.model;

import com.fasterxml.jackson.annotation.*;
import com.github.sergeymitrichev.retailcrm.model.customer.CrmCustomer;
import com.github.sergeymitrichev.retailcrm.model.order.CrmOrder;

import java.util.Set;

public class PageResponse<T extends CrmEntity> extends ApiResponse {
  private PaginationResponse pagination;

  @JsonSubTypes(value = {
    @JsonSubTypes.Type(value = CrmCustomer.class),
    @JsonSubTypes.Type(value = CrmOrder.class),
  })
  @JsonAlias({ "customers", "orders" })
  private Set<T> content;

  public PageResponse() {
  }

  public PaginationResponse getPagination() {
    return pagination;
  }

  public void setPagination(PaginationResponse pagination) {
    this.pagination = pagination;
  }

  public Set<T> getContent() {
    return content;
  }

  public void setContent(Set<T> content) {
    this.content = content;
  }
}
