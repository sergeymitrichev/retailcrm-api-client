package com.github.sergeymitrichev.retailcrm.model.delivery;

import com.github.sergeymitrichev.retailcrm.model.CrmEntity;

import java.util.List;

public class CrmDeliveryType extends CrmEntity {
    private String name;
    private String code;
    private boolean active;
    private double defaultCost;
    private double defaultNetCost;
    private String description;
    private List<String> paymentTypes;
    private String integrationCode;
    private List<String> deliveryServices;
    private boolean defaultForCrm;
    private String vatRate;

    public CrmDeliveryType() {
    }

    public List<String> getDeliveryServices() {
        return deliveryServices;
    }

    public void setDeliveryServices(List<String> deliveryServices) {
        this.deliveryServices = deliveryServices;
    }

    public List<String> getPaymentTypes() {
        return paymentTypes;
    }

    public void setPaymentTypes(List<String> paymentTypes) {
        this.paymentTypes = paymentTypes;
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

    public double getDefaultCost() {
        return defaultCost;
    }

    public void setDefaultCost(double defaultCost) {
        this.defaultCost = defaultCost;
    }

    public double getDefaultNetCost() {
        return defaultNetCost;
    }

    public void setDefaultNetCost(double defaultNetCost) {
        this.defaultNetCost = defaultNetCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIntegrationCode() {
        return integrationCode;
    }

    public void setIntegrationCode(String integrationCode) {
        this.integrationCode = integrationCode;
    }

    public boolean isDefaultForCrm() {
        return defaultForCrm;
    }

    public void setDefaultForCrm(boolean defaultForCrm) {
        this.defaultForCrm = defaultForCrm;
    }

    public String getVatRate() {
        return vatRate;
    }

    public void setVatRate(String vatRate) {
        this.vatRate = vatRate;
    }
}
