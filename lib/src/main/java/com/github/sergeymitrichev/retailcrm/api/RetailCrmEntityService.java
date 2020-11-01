package com.github.sergeymitrichev.retailcrm.api;

import com.github.sergeymitrichev.retailcrm.model.CrmEntity;
import com.github.sergeymitrichev.retailcrm.model.PageResponse;

import java.util.Map;

public interface RetailCrmEntityService<T extends CrmEntity> {

  PageResponse<T> getAll(Map<String, ?> params);

  T get(Long id);

  T create(T entity);

  T update(T entity);

}
