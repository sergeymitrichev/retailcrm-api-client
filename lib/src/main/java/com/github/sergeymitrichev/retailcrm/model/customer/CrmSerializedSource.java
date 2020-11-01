package com.github.sergeymitrichev.retailcrm.model.customer;

public class CrmSerializedSource {
  private String source;
  private String medium;
  private String campaign;
  private String keyword;
  private String content;

  public CrmSerializedSource() {
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public String getMedium() {
    return medium;
  }

  public void setMedium(String medium) {
    this.medium = medium;
  }

  public String getCampaign() {
    return campaign;
  }

  public void setCampaign(String campaign) {
    this.campaign = campaign;
  }

  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
