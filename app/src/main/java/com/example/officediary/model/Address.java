package com.example.officediary.model;

import java.io.Serializable;
import java.util.Map;

public class Address implements Serializable {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Map<String, String> geo;

    public Address(String street, String suite, String city, String zipcode, Map<String, String> geo) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.geo = geo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Map<String, String> getGeo() {
        return geo;
    }

    public void setGeo(Map<String, String> geo) {
        this.geo = geo;
    }
}


//"address": {
//   "street": "Kulas Light",
//   "suite": "Apt. 556",
//   "city": "Gwenborough",
//   "zipcode": "92998-3874",
//   "geo": {
//      "lat": "-37.3159",
//      "lng": "81.1496"
//    }
//}
