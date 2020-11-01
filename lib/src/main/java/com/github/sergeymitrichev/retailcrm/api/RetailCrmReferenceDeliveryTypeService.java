package com.github.sergeymitrichev.retailcrm.api;

import com.github.sergeymitrichev.retailcrm.RetailCrmApiClient;
import com.github.sergeymitrichev.retailcrm.model.MapResponse;
import com.github.sergeymitrichev.retailcrm.model.delivery.CrmDeliveryType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RetailCrmReferenceDeliveryTypeService implements RetailCrmMappedEntityService<CrmDeliveryType> {
    private final RetailCrmApiClient client;
    private final String API_PATH = "reference/delivery-types";

    @Autowired
    public RetailCrmReferenceDeliveryTypeService(RetailCrmApiClient client) {
        this.client = client;
    }

    @Override
    public MapResponse<CrmDeliveryType> getAll() {
        return client.get(
                API_PATH,
                new ParameterizedTypeReference<MapResponse<CrmDeliveryType>>() {
                }
        ).getBody();
    }

    @Override
    public CrmDeliveryType save(CrmDeliveryType entity) {
        return client.post(
                String.format("%s/%s/%s", API_PATH, entity.getCode(), "edit"),
                CrmDeliveryType.class,
                Map.of("deliveryType", entity)
        ).getBody();
    }

}
