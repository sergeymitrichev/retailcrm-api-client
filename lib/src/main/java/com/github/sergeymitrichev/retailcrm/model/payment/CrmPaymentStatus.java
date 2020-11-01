package com.github.sergeymitrichev.retailcrm.model.payment;

import com.github.sergeymitrichev.retailcrm.model.CrmEntity;

import java.util.List;

public class CrmPaymentStatus extends CrmEntity {
    private String name;
    private String code;
    private boolean active;
    private boolean defaultForCrm;
    private boolean defaultForApi;
    private boolean paymentComplete;
    private int ordering;
    private String description;
    private List<String> paymentTypes;

    public CrmPaymentStatus() {
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

    public boolean isPaymentComplete() {
        return paymentComplete;
    }

    public void setPaymentComplete(boolean paymentComplete) {
        this.paymentComplete = paymentComplete;
    }

    public int getOrdering() {
        return ordering;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getPaymentTypes() {
        return paymentTypes;
    }

    public void setPaymentTypes(List<String> paymentTypes) {
        this.paymentTypes = paymentTypes;
    }
}
