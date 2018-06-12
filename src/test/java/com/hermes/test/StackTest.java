package com.hermes.test;

import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class StackTest {



	@Test
	public void shouldCreateStack(){

		Stack testStack = new Stack(23l);

		Long expectedResult = 23L;
		Long actualResult = testStack.getStackId();

		assertEquals(expectedResult, actualResult);
	}


	@Test
	public void shouldAddParcel() {

		Parcel parcelA = new Parcel(1l);
		Parcel parcelB = new Parcel(2l);

		Stack stack = new Stack(22l);

		stack.addParcel(parcelA);
		stack.addParcel(parcelB);

		int expectedNumParcels = 2;
		int actualNumParcel =  stack.getParcels().size();

		assertEquals(expectedNumParcels, actualNumParcel);

		Set<Parcel> parcelsInStack = stack.getParcels();

		assertTrue(parcelsInStack.contains(parcelA));
		assertTrue(parcelsInStack.contains(parcelB));
	}
}