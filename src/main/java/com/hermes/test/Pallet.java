package com.hermes.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class Pallet {

    private UUID id;
    private List<Sack> sacks = new ArrayList<>();
    private List<Parcel> parcels = new ArrayList<>();

    public Pallet(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public void addSack(Sack sack) {
        this.sacks.add(sack);
    }

    public List<Sack> getSacks() {
        return sacks;
    }

    public void addParcel(Parcel parcel) {
        parcels.add(parcel);
    }

    public List<Parcel> getParcels() {
        return parcels;
    }

    public int getNumberOfAllParcels() {

        int numberOfParcelsInSacks = getSacks().stream().mapToInt(value -> value.getParcels().size()).sum();

        return getParcels().size() + numberOfParcelsInSacks;
    }
}
