package com.hermes.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public class Sack {

    private UUID id;
    private List<Parcel> parcels = new ArrayList<>();
    public Sack(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public void addParcel(Parcel parcel) {
        this.parcels.add(parcel);
    }

    public List<Parcel> getParcels() {
        return parcels;
    }
}
