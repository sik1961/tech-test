package com.hermes.test;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by hisg401 on 14/07/2017.
 */
public class Sack {
	private long id;

	private Set<Parcel> parcels;

	public Sack(long id) {
		this.id = id;
		this.parcels = new TreeSet<Parcel>(new ParcelComparator());
	}

	public long getId() {
		return id;
	}

	public Set<Parcel> getParcels() {
		return parcels;
	}

	public void addParcel(Parcel parcel) {
		parcels.add(parcel);
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Sack{");
		sb.append("id=").append(id);
		sb.append('}');
		return sb.toString();
	}
}
