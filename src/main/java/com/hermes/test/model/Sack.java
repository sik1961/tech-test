package com.hermes.test.model;


import java.util.ArrayList;
import java.util.List;

public class Sack {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Parcel> getParcelList() {
        return parcelList;
    }

    public void setParcelList(List<Parcel> parcelList) {
        this.parcelList = parcelList;
    }

    private String id;
    private List<Parcel> parcelList;

    public Sack(String id) {
        this.id = id;
        this.parcelList = new ArrayList<>();
    }

    public void addParcel(Parcel parcel){
        this.parcelList.add(parcel);
    }
}
