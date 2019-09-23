package com.hermes.test;

import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.assertEquals;

public class ParcelTest {

    @Test
    public void whenaddparcelstoaSackThenParcelsShouldBePresent() {
        Sack sack = new Sack(UUID.randomUUID());
        UUID parcelid = UUID.randomUUID();
        Parcel parcel = new Parcel(parcelid);
        sack.addParcel(parcel);

        assertEquals(sack.getParcels().size(), 1);
        Parcel retrievedParcel = sack.getParcels().get(0);
        assertEquals(retrievedParcel.getId(), parcelid);

    }
}
