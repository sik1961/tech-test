package com.hermes.test;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalletTest {

	@Test
	public void addStack() {

		Parcel parcelA = new Parcel(1l);
		Parcel parcelB = new Parcel(2l);

		Stack stackA = new Stack(22l);
		stackA.addParcel(parcelA);
		stackA.addParcel(parcelB);


		Parcel parcelC = new Parcel(3l);
		Parcel parcelD = new Parcel(4l);


		Stack stackB = new Stack(33l);
		stackB.addParcel(parcelC);
		stackB.addParcel(parcelD);


		Pallet pallet = new Pallet(44l);
		pallet.addStack(stackA);
		pallet.addStack(stackB);
		pallet.addParcel(new Parcel(5l));


		int expectedCount = 5;
		int actualCount = pallet.numParcels();

		assertEquals(expectedCount, actualCount);

	}


}