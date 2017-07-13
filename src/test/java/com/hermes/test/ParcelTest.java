package com.hermes.test;

import com.hermes.test.domain.Item;
import com.hermes.test.domain.Pallet;
import com.hermes.test.domain.Parcel;
import com.hermes.test.domain.Sack;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ParcelTest {

    @Test
    public void canCreatePallet() {
        Item pallet = aPallet("Pallet1");
        Sack sack1 = aSack("Sack1");
        pallet.addItem(sack1);
        sack1.addItem(aParcel("Parcel1"));
        Sack sack2 = aSack("Sack2");
        pallet.addItem(sack2);
        sack2.addItem(aParcel("Parcel2"));
        sack2.addItem(aParcel("Parcel3"));
        Sack sack3 = aSack("Sack3");
        pallet.addItem(sack3);
        sack3.addItem(aParcel("Parcel4"));
        sack3.addItem(aParcel("Parcel5"));
        sack3.addItem(aParcel("Parcel6"));
        pallet.addItem(aParcel("Parcel7"));

        assertThat(pallet.getAllItems().size(), is(7));
    }

    private Pallet aPallet(String id) {
        return Pallet.PalletBuilder.aPallet().withId(id).build();
    }

    private Sack aSack(String id) {
        return Sack.SackBuilder.aSack().withId(id).build();
    }

    private Parcel aParcel(String id) {
        return Parcel.ParcelBuilder.aParcel().withId(id).build();
    }
}
