package com.github.sergeymitrichev.retailcrm.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import com.github.sergeymitrichev.retailcrm.RetailCrmApiClient;
import com.github.sergeymitrichev.retailcrm.model.EntityResponse;
import com.github.sergeymitrichev.retailcrm.model.PageResponse;
import com.github.sergeymitrichev.retailcrm.model.order.CrmOrder;

import java.util.Map;
import java.util.Objects;

@Service
public class RetailCrmOrderService implements RetailCrmExternalEntityService<CrmOrder> {
  private final RetailCrmApiClient client;
  private final String API_PATH = "orders";

  @Autowired
  public RetailCrmOrderService(RetailCrmApiClient client) {
    this.client = client;
  }


  @Override
  public PageResponse<CrmOrder> getAll(Map<String, ?> params) {
    return client.get(
      API_PATH,
      new ParameterizedTypeReference<PageResponse<CrmOrder>>() {
      },
      params
    ).getBody();
  }

  @Override
  public CrmOrder get(Long id) {
    return Objects.requireNonNull(client.get(
      String.format("%s/%s", API_PATH, id),
      new ParameterizedTypeReference<EntityResponse<CrmOrder>>() {
      },
      Map.of("by", "id")
    ).getBody()).getEntity();
  }

  @Override
  public CrmOrder create(CrmOrder entity) {
    return client.post(
      String.format("%s/%s", API_PATH, "create"),
      CrmOrder.class,
      Map.of("order", entity)
    ).getBody();
  }

  @Override
  public CrmOrder update(CrmOrder entity) {
    return client.post(
            String.format("%s/%s/%s", API_PATH, entity.getId(), "edit"),
            CrmOrder.class,
            Map.of("order", entity),
            Map.of("by", "id")
    ).getBody();
  }

  @Override
  public CrmOrder getByExternalId(String externalId) {
    return Objects.requireNonNull(client.get(
      String.format("%s/%s", API_PATH, externalId),
      new ParameterizedTypeReference<EntityResponse<CrmOrder>>() {
      }).getBody()).getEntity();
  }

  @Override
  public CrmOrder updateByExternalId(CrmOrder entity) {
    return client.post(
            String.format("%s/%s/%s", API_PATH, entity.getExternalId(), "edit"),
            CrmOrder.class,
            Map.of("order", entity)
    ).getBody();
  }
}
