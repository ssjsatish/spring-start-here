package com.tcm.model;

public class Country {
    private String name;
    private int yearsOfIndependence;
    public static Country of(String name, int yearsOfIndependence) {
        Country country = new Country();
        country.setName(name);
        country.setYearsOfIndependence(yearsOfIndependence);
        return country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOfIndependence() {
        return yearsOfIndependence;
    }

    public void setYearsOfIndependence(int yearsOfIndependence) {
        this.yearsOfIndependence = yearsOfIndependence;
    }
}
