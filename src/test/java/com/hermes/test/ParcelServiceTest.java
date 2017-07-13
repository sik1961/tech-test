package com.hermes.test;

import com.hermes.test.domain.Item;
import com.hermes.test.domain.Pallet;
import com.hermes.test.domain.Parcel;
import com.hermes.test.domain.Sack;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;

public class ParcelServiceTest
{
	@Test
	public void canCreateAParcel() {
		Item parcel = new Parcel();
		assertThat(parcel, is(notNullValue()));
	}

	@Test
	public void canCreateAParcelWithId() {
		String id = "1";
		Item parcel = aParcel(id);
		assertThat(parcel, is(notNullValue()));
		assertThat(parcel.getId(), is(id));
	}

	@Test
	public void canCreateASack() {
		Item sack = new Sack();
		assertThat(sack, is(notNullValue()));
	}

	@Test
	public void canCreateAPallet() {
		Item pallet = new Pallet();
		assertThat(pallet, is(notNullValue()));
	}

	@Test
	public void canAddAParcelsToASack() {
		Item sack = new Sack();
		Item parcel1 = aParcel("1");
		Item parcel2 = aParcel("2");
		Item parcel3 = aParcel("3");
		sack.addItem(parcel1);
		sack.addItem(parcel2);
		sack.addItem(parcel3);
		assertThat(sack, is(notNullValue()));
		assertThat(sack.getItems().size(), is(3));
		assertThat(sack.getItems().get(0).getId(), is(equalTo("1")));
		assertThat(sack.getItems().get(1).getId(), is(equalTo("2")));
		assertThat(sack.getItems().get(2).getId(), is(equalTo("3")));
	}

	@Test
	public void canAddASacksToAPallet() {
		Item pallet = new Pallet();
		Item sack1 = aSack("1");
		Item sack2 = aSack("2");
		Item sack3 = aSack("3");
		pallet.addItem(sack1);
		pallet.addItem(sack2);
		pallet.addItem(sack3);
		assertThat(pallet, is(notNullValue()));
		assertThat(pallet.getItems().size(), is(3));
		assertThat(pallet.getItems().get(0).getId(), is(equalTo("1")));
		assertThat(pallet.getItems().get(1).getId(), is(equalTo("2")));
		assertThat(pallet.getItems().get(2).getId(), is(equalTo("3")));
	}

	@Test
	public void canAddAParcelsToAPallet() {
		Item pallet = new Pallet();
		pallet.setId("Pall1");

		Item sack1 = aSack("S1");
		Item parcel1 = aParcel("P11");
		sack1.addItem(parcel1);
		Item sack2 = aSack("2");
		Item parcel2 = aParcel("P12");
		Item parcel3 = aParcel("P13");
		sack2.addItem(parcel2);
		sack2.addItem(parcel3);
		Item sack3 = aSack("3");
		Item parcel4 = aParcel("P14");
		Item parcel5 = aParcel("P15");
		Item parcel6 = aParcel("P16");
		sack3.addItem(parcel4);
		sack3.addItem(parcel5);
		sack3.addItem(parcel6);

		pallet.addItem(sack1);
		pallet.addItem(sack2);
		pallet.addItem(sack3);

		Item parcel = aParcel("P1");
		pallet.addItem(parcel);
		assertThat(pallet, is(notNullValue()));
//		assertThat(pallet.getItems().size(), is(3));
//		assertThat(pallet.getItems().get(0).getId(), is(equalTo("1")));
//		assertThat(pallet.getItems().get(1).getId(), is(equalTo("2")));
//		assertThat(pallet.getItems().get(2).getId(), is(equalTo("3")));

		assertThat(pallet.getAllItems().size(), is(7));
	}

	private Sack aSack(String id) {
		return Sack.SackBuilder.aSack().withId(id).build();
	}


	private Parcel aParcel(String id) {
		return Parcel.ParcelBuilder.aParcel().withId(id).build();
	}


}
