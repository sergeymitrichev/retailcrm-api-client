package com.github.sergeymitrichev.retailcrm.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import com.github.sergeymitrichev.retailcrm.RetailCrmApiClient;
import com.github.sergeymitrichev.retailcrm.model.EntityResponse;
import com.github.sergeymitrichev.retailcrm.model.PageResponse;
import com.github.sergeymitrichev.retailcrm.model.customer.CrmCustomer;

import java.util.Map;
import java.util.Objects;

@Service
public class RetailCrmCustomerService implements RetailCrmExternalEntityService<CrmCustomer> {
  private final RetailCrmApiClient client;
  private final String API_PATH = "customers";

  @Autowired
  public RetailCrmCustomerService(RetailCrmApiClient client) {
    this.client = client;
  }

  @Override
  public PageResponse<CrmCustomer> getAll(Map<String, ?> params) {
    return client.get(
      API_PATH,
      new ParameterizedTypeReference<PageResponse<CrmCustomer>>() {
      },
      params
    ).getBody();
  }

  @Override
  public CrmCustomer get(Long id) {
    return Objects.requireNonNull(client.get(
      String.format("%s/%s", API_PATH, id),
      new ParameterizedTypeReference<EntityResponse<CrmCustomer>>() {
      },
      Map.of("by", "id")
    ).getBody()).getEntity();
  }

  @Override
  public CrmCustomer getByExternalId(String externalId) {
    return Objects.requireNonNull(client.get(
      String.format("%s/%s", API_PATH, externalId),
      new ParameterizedTypeReference<EntityResponse<CrmCustomer>>() {
      }).getBody()).getEntity();
  }


  /**
   * Returns a saved customer
   * <p>
   * Actually, Api request returns ApiResponse({ success: true, id: savedId })
   * <a href="https://help.retailcrm.ru/Developers/ApiVersion5#post--api-v5-customers-create">See RetailCRM API docs</a>
   */
  @Override
  public CrmCustomer create(CrmCustomer entity) {
    CrmCustomer saved = client.post(
      String.format("%s/%s", API_PATH, "create"),
      CrmCustomer.class,
      Map.of("customer", entity)
    ).getBody();
    entity.setId(saved.getId());
    entity.setExternalId(saved.getExternalId());
    return entity;
  }

  /**
   * Returns a saved customer
   * <p>
   * Actually, Api request returns ApiResponse({ success: true, id: savedId })
   * <a href="https://help.retailcrm.ru/Developers/ApiVersion5#post--api-v5-customers-create">See RetailCRM API docs</a>
   */
  @Override
  public CrmCustomer update(CrmCustomer entity) {
    CrmCustomer saved = client.post(
            String.format("%s/%s/%s", API_PATH, entity.getId(), "edit"),
            CrmCustomer.class,
            Map.of("customer", entity),
            Map.of("by", "id")
    ).getBody();
    entity.setId(saved.getId());
    entity.setExternalId(saved.getExternalId());
    return entity;
  }

  /**
   * Returns a saved customer
   * <p>
   * Actually, Api request returns ApiResponse({ success: true, id: savedId })
   * <a href="https://help.retailcrm.ru/Developers/ApiVersion5#post--api-v5-customers-create">See RetailCRM API docs</a>
   */
  @Override
  public CrmCustomer updateByExternalId(CrmCustomer entity) {
    CrmCustomer saved = client.post(
            String.format("%s/%s/%s", API_PATH, entity.getExternalId(), "edit"),
            CrmCustomer.class,
            Map.of("customer", entity)
    ).getBody();
    entity.setId(saved.getId());
    entity.setExternalId(saved.getExternalId());
    return entity;
  }
}
