package com.hermes.test.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalletCountTest {

    @Test
    public void shouldCountParcels(){
        //given
        Pallet pallet = new Pallet("pallet1");

        Sack sack1 = new Sack("sack1");
        Parcel parcel1 = new Parcel("parcel1");
        Parcel parcel2 = new Parcel("parcel2");
        sack1.addParcel(parcel1);
        sack1.addParcel(parcel2);

        Sack sack2 = new Sack("sack2");
        Parcel parcel3 = new Parcel("parcel3");
        Parcel parcel4 = new Parcel("parcel4");
        sack2.addParcel(parcel3);
        sack2.addParcel(parcel4);

        pallet.addSack(sack1);
        pallet.addSack(sack2);

        pallet.addParcel(new Parcel("parcel5"));

        //then
        int count = pallet.countParcels();

        assertEquals(5, count);






    }
}
