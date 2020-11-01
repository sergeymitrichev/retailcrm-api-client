package com.github.sergeymitrichev.retailcrm.api;

import com.github.sergeymitrichev.retailcrm.RetailCrmApiClient;
import com.github.sergeymitrichev.retailcrm.model.MapResponse;
import com.github.sergeymitrichev.retailcrm.model.payment.CrmPaymentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RetailCrmReferencePaymentTypeService implements RetailCrmMappedEntityService<CrmPaymentType> {
    private final RetailCrmApiClient client;
    private final String API_PATH = "reference/payment-types";

    @Autowired
    public RetailCrmReferencePaymentTypeService(RetailCrmApiClient client) {
        this.client = client;
    }

    @Override
    public MapResponse<CrmPaymentType> getAll() {
        return client.get(
                API_PATH,
                new ParameterizedTypeReference<MapResponse<CrmPaymentType>>() {
                }
        ).getBody();
    }

    @Override
    public CrmPaymentType save(CrmPaymentType entity) {
        return client.post(
                String.format("%s/%s/%s", API_PATH, entity.getCode(), "edit"),
                CrmPaymentType.class,
                Map.of("paymentType", entity)
        ).getBody();
    }

}
