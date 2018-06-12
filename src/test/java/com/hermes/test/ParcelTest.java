package com.hermes.test;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParcelTest {


	@Test
	public void shouldCreateParcel(){

		Parcel testParcel = new Parcel(22l);

		Long expectedResult = 22L;
		Long actualResult = testParcel.getParcelId();

		assertEquals(expectedResult, actualResult);
	}


}