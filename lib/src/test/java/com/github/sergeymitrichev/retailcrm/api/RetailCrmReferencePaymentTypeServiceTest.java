package com.github.sergeymitrichev.retailcrm.api;

import com.github.sergeymitrichev.retailcrm.TestClient;
import com.github.sergeymitrichev.retailcrm.model.MapResponse;
import com.github.sergeymitrichev.retailcrm.model.payment.CrmPaymentType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RetailCrmReferencePaymentTypeServiceTest {

    public static RetailCrmReferencePaymentTypeService service =
            new RetailCrmReferencePaymentTypeService(TestClient.getInstance());

    @Test
    void testGetAll() {
        MapResponse<CrmPaymentType> response = service.getAll();
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
