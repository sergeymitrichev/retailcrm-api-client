package com.github.sergeymitrichev.retailcrm.model;

public class PaginationResponse extends ApiResponse {

  private int limit;
  private int totalCount;
  private int currentPage;
  private int totalPageCount;

  public PaginationResponse() {
  }

  public int getLimit() {
    return limit;
  }

  public void setLimit(int limit) {
    this.limit = limit;
  }

  public int getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(int totalCount) {
    this.totalCount = totalCount;
  }

  public int getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(int currentPage) {
    this.currentPage = currentPage;
  }

  public int getTotalPageCount() {
    return totalPageCount;
  }

  public void setTotalPageCount(int totalPageCount) {
    this.totalPageCount = totalPageCount;
  }
}
