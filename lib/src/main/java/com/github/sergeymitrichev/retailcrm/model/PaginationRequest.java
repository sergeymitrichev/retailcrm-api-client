package com.github.sergeymitrichev.retailcrm.model;

public class PaginationRequest {
  private int limit;
  private int page;

  public PaginationRequest(int limit, int page) {
    this.limit = limit;
    this.page = page;
  }

  public int getLimit() {
    return limit;
  }

  public void setLimit(int limit) {
    this.limit = limit;
  }

  public int getPage() {
    return page;
  }

  public void setPage(int page) {
    this.page = page;
  }
}
