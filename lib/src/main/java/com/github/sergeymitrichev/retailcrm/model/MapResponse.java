package com.github.sergeymitrichev.retailcrm.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.github.sergeymitrichev.retailcrm.model.delivery.CrmDeliveryType;
import com.github.sergeymitrichev.retailcrm.model.payment.CrmPaymentType;

import java.util.Map;

public class MapResponse<T extends CrmEntity> extends ApiResponse {

  @JsonSubTypes(value = {
    @JsonSubTypes.Type(value = CrmDeliveryType.class),
    @JsonSubTypes.Type(value = CrmPaymentType.class),
  })
  @JsonAlias({ "deliveryTypes", "paymentTypes" })
  private Map<String, T> content;

  public MapResponse() {
  }

  public Map<String, T> getContent() {
    return content;
  }

  public void setContent(Map<String, T> content) {
    this.content = content;
  }
}
