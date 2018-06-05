package com.hermes.test;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class PalletServiceTest {


	@Test
	public void addParcel_shouldAddSuccesfullyAddParcelToPalet() {
		final PalletService palletServiceInTest = new PalletService();
		final Pallet pallet = new Pallet();
		final Parcel parcelInTest = new Parcel();

		palletServiceInTest.addParcel(parcelInTest, pallet);

		final long numberOfMatchingParcels = pallet.stream().filter( c -> c.getID().equals(parcelInTest.getID())).count();

		assertThat(numberOfMatchingParcels).isEqualTo(1);
	}

	@Test
	public void addParcel_shouldSuccesfullyAddParcelToSack() {
		final PalletService palletServiceInTest = new PalletService();
		final Sack sack = new Sack();
		final Parcel parcelInTest = new Parcel();

		palletServiceInTest.addParcel(parcelInTest, sack);

		final long numberOfMatchingParcels = sack.stream().filter( c -> c.getID().equals(parcelInTest.getID())).count();

		assertThat(numberOfMatchingParcels).isEqualTo(1);
	}

	@Test
	public void addSack_shouldSuccesfullyAddSackToPallet() {
		final PalletService palletServiceInTest = new PalletService();
		final Pallet pallet = new Pallet();
		final Sack sackInTest = new Sack();

		palletServiceInTest.addSack(sackInTest, pallet);

		final long numberOfMatchingSacks = pallet.stream().filter( c -> c.getID().equals(sackInTest.getID())).count();

		assertThat(numberOfMatchingSacks).isEqualTo(1);
	}


	@Test
	public void countParcelsInPallet_succesfullyCountGivenThreeParcelsAndTwoSacks() {
		final PalletService palletServiceInTest = new PalletService();

		final Pallet pallet = new Pallet();

		final Sack sack1 = new Sack();
		final Sack sack2 = new Sack();

		final Parcel parcel1 = new Parcel();
		final Parcel parcel2 = new Parcel();
		final Parcel parcel3 = new Parcel();

		palletServiceInTest.addParcel(parcel1, sack1);
		palletServiceInTest.addParcel(parcel2, sack2);

		palletServiceInTest.addParcel(parcel3, pallet);

		palletServiceInTest.addSack(sack1, pallet);
		palletServiceInTest.addSack(sack2, pallet);


		assertThat(palletServiceInTest.countParcelsInPallet(pallet)).isEqualTo(5);
	}

}
