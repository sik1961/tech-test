package com.hermes.test;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hisg401 on 14/07/2017.
 */
public class ParcelTest {
	@Test
	public void shouldBeAbleToCreateAParcel() {
		long id = 1234;
		Parcel parcel = new Parcel(id);
		Assert.assertEquals(parcel.getId(), id);
	}
}
