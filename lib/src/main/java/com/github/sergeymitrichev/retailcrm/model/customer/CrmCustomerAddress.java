package com.github.sergeymitrichev.retailcrm.model.customer;

import com.github.sergeymitrichev.retailcrm.model.CrmEntity;

public class CrmCustomerAddress extends CrmEntity {
  private String index;
  private String countryIso;
  private String region;
  private Integer regionId;
  private String city;
  private Integer cityId;
  private CrmCityType cityType;
  private String street;
  private Integer streetId;
  private CrmStreetType streetType;
  private String building;
  private String flat;
  private Integer floor;
  private Integer block;
  private String house;
  private String housing;
  private String metro;
  private String notes;
  private String text;
  private String externalId;
  private String name;

  public CrmCustomerAddress() {
  }

  public String getIndex() {
    return index;
  }

  public void setIndex(String index) {
    this.index = index;
  }

  public String getCountryIso() {
    return countryIso;
  }

  public void setCountryIso(String countryIso) {
    this.countryIso = countryIso;
  }

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public int getRegionId() {
    return regionId;
  }

  public void setRegionId(int regionId) {
    this.regionId = regionId;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public int getCityId() {
    return cityId;
  }

  public void setCityId(int cityId) {
    this.cityId = cityId;
  }

  public CrmCityType getCityType() {
    return cityType;
  }

  public void setCityType(CrmCityType cityType) {
    this.cityType = cityType;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public int getStreetId() {
    return streetId;
  }

  public void setStreetId(int streetId) {
    this.streetId = streetId;
  }

  public CrmStreetType getStreetType() {
    return streetType;
  }

  public void setStreetType(CrmStreetType streetType) {
    this.streetType = streetType;
  }

  public String getBuilding() {
    return building;
  }

  public void setBuilding(String building) {
    this.building = building;
  }

  public String getFlat() {
    return flat;
  }

  public void setFlat(String flat) {
    this.flat = flat;
  }

  public int getFloor() {
    return floor;
  }

  public void setFloor(int floor) {
    this.floor = floor;
  }

  public int getBlock() {
    return block;
  }

  public void setBlock(int block) {
    this.block = block;
  }

  public String getHouse() {
    return house;
  }

  public void setHouse(String house) {
    this.house = house;
  }

  public String getHousing() {
    return housing;
  }

  public void setHousing(String housing) {
    this.housing = housing;
  }

  public String getMetro() {
    return metro;
  }

  public void setMetro(String metro) {
    this.metro = metro;
  }

  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
