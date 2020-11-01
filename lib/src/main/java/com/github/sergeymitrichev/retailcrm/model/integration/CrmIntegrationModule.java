package com.github.sergeymitrichev.retailcrm.model.integration;

public class CrmIntegrationModule {
    private boolean active;
    private String name;
    private String logo;

    public CrmIntegrationModule() {
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
