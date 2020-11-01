package com.github.sergeymitrichev.retailcrm.model.payment;

import com.github.sergeymitrichev.retailcrm.model.CrmEntity;
import com.github.sergeymitrichev.retailcrm.model.integration.CrmIntegrationModule;

import java.util.List;

public class CrmPaymentType extends CrmEntity {
    private String name;
    private String code;
    private boolean active;
    private boolean defaultForCrm;
    private boolean defaultForApi;
    private String description;
    private List<String> deliveryTypes;
    private List<String> paymentStatuses;
    private CrmIntegrationModule integrationModule;

    public CrmPaymentType() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isDefaultForCrm() {
        return defaultForCrm;
    }

    public void setDefaultForCrm(boolean defaultForCrm) {
        this.defaultForCrm = defaultForCrm;
    }

    public boolean isDefaultForApi() {
        return defaultForApi;
    }

    public void setDefaultForApi(boolean defaultForApi) {
        this.defaultForApi = defaultForApi;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getDeliveryTypes() {
        return deliveryTypes;
    }

    public void setDeliveryTypes(List<String> deliveryTypes) {
        this.deliveryTypes = deliveryTypes;
    }

    public List<String> getPaymentStatuses() {
        return paymentStatuses;
    }

    public void setPaymentStatuses(List<String> paymentStatuses) {
        this.paymentStatuses = paymentStatuses;
    }

    public CrmIntegrationModule getIntegrationModule() {
        return integrationModule;
    }

    public void setIntegrationModule(CrmIntegrationModule integrationModule) {
        this.integrationModule = integrationModule;
    }
}
