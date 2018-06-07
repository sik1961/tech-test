package com.hermes.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SackTest {

	@Test
	public void testCreateParcel() {
		Parcel firstParcel = new Parcel("1");
		assertTrue("1".equalsIgnoreCase(firstParcel.getIdentifier()));
	}
	
	@Test
	public void testAddParcelToSack() throws Exception {
		Parcel firstParcel = new Parcel("P1");
		Sack firstSack = new Sack("S1");
		firstSack.addParcel(firstParcel);
		assertTrue(firstSack.getAllParcels().contains(firstParcel));
		
	}

}
