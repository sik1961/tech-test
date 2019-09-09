package com.hermes.test.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SackTest {

    @Test
    public void shouldAddParcel(){
        //given
        Sack sack = new Sack("sack1");

        //when
        sack.addParcel(new Parcel("parcel1"));

        //then
        assertEquals(1, sack.getParcelList().size());
        assertEquals("parcel1", sack.getParcelList().get(0).getId());

    }
}
