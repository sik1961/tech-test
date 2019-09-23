package com.hermes.test;

import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.assertEquals;

public class SacksTest {

    @Test
    public void whenAddsackstoPalletThenensureSacksArepresent() {
        Pallet pallet = new Pallet(UUID.randomUUID());

        UUID sackid = UUID.randomUUID();
        Sack sack = new Sack(sackid);

        pallet.addSack(sack);

        assertEquals(pallet.getSacks().size(), 1);

    }

    @Test
    public void whenAddParcelToPalletThenensureParcelsArepresent() {
        Pallet pallet = new Pallet(UUID.randomUUID());

        UUID parcelId = UUID.randomUUID();
        Parcel parcel = new Parcel(parcelId);
        pallet.addParcel(parcel);

        assertEquals(pallet.getParcels().size(), 1);
    }

    @Test
    public void whenpopulatePalletWith2parcelsinSackAndAParcelShouldHave3Items() {
        Pallet pallet = new Pallet(UUID.randomUUID());

        // add third parcel to a pallet
        pallet.addParcel(new Parcel(UUID.randomUUID()));

        // add 2 pacrels to a sack
        Sack sack = new Sack(UUID.randomUUID());
        sack.addParcel(new Parcel(UUID.randomUUID()));
        sack.addParcel(new Parcel(UUID.randomUUID()));
        pallet.addSack(sack);

        assertEquals(pallet.getNumberOfAllParcels(), 3);
    }


}
