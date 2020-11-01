package com.github.sergeymitrichev.retailcrm.api;

import com.github.sergeymitrichev.retailcrm.model.CrmExternalEntity;

public interface RetailCrmExternalEntityService<T extends CrmExternalEntity> extends RetailCrmEntityService<T> {
  T getByExternalId(String externalId);

  T updateByExternalId(T entity);
}
