package com.github.sergeymitrichev.retailcrm.api;

import com.github.sergeymitrichev.retailcrm.model.CrmEntity;
import com.github.sergeymitrichev.retailcrm.model.MapResponse;

public interface RetailCrmMappedEntityService<T extends CrmEntity> {

  MapResponse<T> getAll();

  T save(T entity);

}
