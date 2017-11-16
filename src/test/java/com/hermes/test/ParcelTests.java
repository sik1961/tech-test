package com.hermes.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

public class ParcelTests {

	@Test
	public void addAParcelToSack() {
		String sackId = ParcelTestHelper.addSackToPallet();
		assertNotNull(sackId);

		String parcel1Id = ParcelTestHelper.addParcelToSack(sackId);
		assertNotNull(parcel1Id);
		
		String parcel2Id = ParcelTestHelper.addParcelToSack(sackId);
		assertNotSame(parcel1Id, parcel2Id);
	}

	@Test
	public void addASackToPallet() {
		String id = ParcelTestHelper.addSackToPallet();
		assertNotNull(id);
		
		String id2 = ParcelTestHelper.addSackToPallet();
		assertNotSame(id, id2);
	}

	@Test
	public void addAParcelToPallet() {
		String id = ParcelTestHelper.addParcelToPallet();
		assertNotNull(id);
		
		String id2 = ParcelTestHelper.addParcelToPallet();
		assertNotSame(id, id2);
	}

	@Test
	public void getParcelCount() {
		int count = ParcelTestHelper.getParcelCount();
		assertEquals(4, count);
	}

}
