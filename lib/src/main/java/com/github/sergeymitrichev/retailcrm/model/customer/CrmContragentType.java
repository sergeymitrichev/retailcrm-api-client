package com.github.sergeymitrichev.retailcrm.model.customer;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum CrmContragentType {
  @JsonProperty("legal-entity")
  LEGAL_ENTITY,
  @JsonProperty("individual")
  INDIVIDUAL;
}
