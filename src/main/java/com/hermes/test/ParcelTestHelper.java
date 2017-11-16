package com.hermes.test;

public class ParcelTestHelper {
	
	private static Container pallet = new Pallet();
	public static String addParcelToSack(String sackId) {
		Parcel parcel = new Parcel();
		Container sack = pallet.getItem(sackId);
		sack.add(parcel);
		return parcel.getId();
	}
	
	public static String addSackToPallet() {
		Container sack = new Sack();
		pallet.add(sack);
		return sack.getId();
	}
	
	public static String addParcelToPallet() {
		Container parcel = new Parcel();
		pallet.add(parcel);
		return parcel.getId();
	}
	
	public static int getParcelCount() {
		return pallet.getParcelCount();
	}
}
