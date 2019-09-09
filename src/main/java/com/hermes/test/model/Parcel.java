package com.hermes.test.model;


public class Parcel {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Parcel(String id) {
        this.id = id;
    }

    private String id;
}
