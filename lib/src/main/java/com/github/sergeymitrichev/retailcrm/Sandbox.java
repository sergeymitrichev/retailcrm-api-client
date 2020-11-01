package com.github.sergeymitrichev.retailcrm;

import com.github.sergeymitrichev.retailcrm.model.order.CrmOrder;
import com.github.sergeymitrichev.retailcrm.api.RetailCrmOrderService;

public class Sandbox {
  public static void main(String[] args) {
    RetailCrmApiClient client = new RetailCrmApiClient("seid-nn.retailcrm.ru",
      "03GI2WyhFPhwDhaEg2o2SDL1hnT8NBBG"
    );
//    RetailCrmCustomerService service = new RetailCrmCustomerService(client);
    RetailCrmOrderService orderService = new RetailCrmOrderService(client);
    CrmOrder order = orderService.get(2245L);
    CrmOrder created = orderService.create(new CrmOrder());
//    CrmCustomer toCreate = new CrmCustomer();
//    toCreate.setPhones(List.of(new CrmCustomerPhone("+79200226481")));
//    CrmCustomer created = service.create(toCreate);
    System.out.println(order);
  }
}
