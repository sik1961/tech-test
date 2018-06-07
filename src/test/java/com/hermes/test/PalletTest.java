package com.hermes.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalletTest {

	@Test
	public void testCreateParcelsAndSacks() {
		
		
		Parcel firstParcel = new Parcel("P1");
		Sack firstSack = new Sack("S1");
		firstSack.addParcel(firstParcel);
		
			Parcel secondParcel = new Parcel("P2");
			Sack secondSack = new Sack("S2");
			secondSack.addParcel(secondParcel);
			
			Parcel thirdParcel = new Parcel("P3");
			
			Pallet firstPallet = new Pallet("PLL1");
			firstPallet.addSack(firstSack);
			firstPallet.addSack(secondSack);
			firstPallet.addParcel(thirdParcel);
			
			assertTrue(firstPallet.getAllSacks().size() == 2);
			
	}
	

	@Test
	public void testCountParcelsAndSacks() {
		
		
		Parcel firstParcel = new Parcel("P1");
		Sack firstSack = new Sack("S1");
		firstSack.addParcel(firstParcel);
		
			Parcel secondParcel = new Parcel("P2");
			Sack secondSack = new Sack("S2");
			secondSack.addParcel(secondParcel);
			
			Parcel thirdParcel = new Parcel("P3");
			
			Pallet firstPallet = new Pallet("PLL1");
			firstPallet.addSack(firstSack);
			firstPallet.addSack(secondSack);
			firstPallet.addParcel(thirdParcel);
			
			assertTrue(firstPallet.getCount() == 3);
			
			
	}

}
