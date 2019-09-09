package com.hermes.test.model;


import java.util.ArrayList;
import java.util.List;

public class Pallet {

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

    public List<Sack> getSackList() {
        return sackList;
    }

    public void setSackList(List<Sack> sackList) {
        this.sackList = sackList;
    }

    private String id;
    private List<Parcel> parcelList;
    private List<Sack> sackList;

    public Pallet(String id) {
        this.id = id;
        this.parcelList = new ArrayList<>();
        this.sackList = new ArrayList<>();
    }

    public void addParcel(Parcel parcel){
        this.parcelList.add(parcel);
    }

    public void addSack(Sack sack){
        this.sackList.add(sack);
    }

    public Integer countParcels(){

        int count = 0;
        for (Sack sack : sackList) {
            count += sack.getParcelList().size();
        }
        count += parcelList.size();

        return count;
    }
}
