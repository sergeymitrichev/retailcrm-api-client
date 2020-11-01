package com.github.sergeymitrichev.retailcrm.api;

import com.github.sergeymitrichev.retailcrm.TestClient;
import com.github.sergeymitrichev.retailcrm.model.MapResponse;
import com.github.sergeymitrichev.retailcrm.model.delivery.CrmDeliveryType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RetailCrmReferenceDeliveryTypeServiceTest {

    public static RetailCrmReferenceDeliveryTypeService service =
            new RetailCrmReferenceDeliveryTypeService(TestClient.getInstance());

    @Test
    void testGetAll() {
        MapResponse<CrmDeliveryType> response = service.getAll();
        assertNotNull(response);
        assertTrue(response.isSuccess());
        assertNotNull(response.getContent());
    }

    @Test
    void testCreate() {

    }

    @Test
    void testUpdate() {

    }
}
