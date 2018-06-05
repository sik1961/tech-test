package com.hermes.test;

import java.util.ArrayList;

public class PalletService {

	public void addParcel(final Parcel parcel, final Pallet pallet) {
		pallet.add(parcel);
	}

	public void addParcel(final Parcel parcel, final Sack sack) {
		sack.add(parcel);
	}

	public void addSack(final Sack sack, final Pallet pallet) {
		pallet.add(sack);
	}

	private long countParcelsInPallet(final ArrayList<Container> containerCollection) {
		long count = containerCollection.size();

		for (final Container container : containerCollection) {

			if (container instanceof Sack) {
				final Sack sackContainer = (Sack) container;

				this.countParcelsInPallet(sackContainer);
				count = count + this.countParcelsInPallet(sackContainer);;
			} else {
				count += count;
			}

		}

		return count;
	}

	public long countParcelsInPallet(final Pallet pallet) {

		return this.countParcelsInPallet(pallet);
	}


}
