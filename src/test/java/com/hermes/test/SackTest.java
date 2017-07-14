package com.hermes.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by hisg401 on 14/07/2017.
 */
public class SackTest {
	private Parcel parcel1;
	private Parcel parcel12;
	private Sack sack;

	@Before
	public void setup() {
		parcel1 = new Parcel(1234);
		parcel12 = new Parcel(4567);
		sack = new Sack(8989);
	}

	@Test
	public void shouldBeAbleToCreateASack() {
		Assert.assertNotNull(sack);
	}

	@Test
	public void shouldBeABleToAddParcels() {
		sack.addParcel(parcel1);
		sack.addParcel(parcel12);
		Assert.assertEquals(sack.getParcels().size(), 2);
		Assert.assertTrue(sack.getParcels().contains(parcel1));
	}
}
