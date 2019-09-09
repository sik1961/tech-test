package com.hermes.test.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalletTest {

    @Test
    public void shouldAddParcel(){
        //given
        Pallet pallet = new Pallet("pallet1");

        //when
        pallet.addParcel(new Parcel("parcel1"));

        //then
        assertEquals(1, pallet.getParcelList().size());
        assertEquals("parcel1", pallet.getParcelList().get(0).getId());

    }

    @Test
    public void shouldAddSack(){
        //given
        Pallet pallet = new Pallet("pallet1");

        //when
        pallet.addSack(new Sack("sack1"));

        //then
        assertEquals(1, pallet.getSackList().size());
        assertEquals("sack1", pallet.getSackList().get(0).getId());

    }


}
