package com.hermes.test;

import java.util.ArrayList;
import java.util.List;

public class Sack {
	
	private String identifier;
	
	private List<Parcel> parcels = new ArrayList<Parcel>();

	public Sack(String identifier) {
		this.identifier = identifier;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((identifier == null) ? 0 : identifier.hashCode());
		result = prime * result + ((parcels == null) ? 0 : parcels.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sack other = (Sack) obj;
		if (identifier == null) {
			if (other.identifier != null)
				return false;
		} else if (!identifier.equals(other.identifier))
			return false;
		if (parcels == null) {
			if (other.parcels != null)
				return false;
		} else if (!parcels.equals(other.parcels))
			return false;
		return true;
	}

	public void addParcel(Parcel firstParcel) {
		this.parcels.add(firstParcel);
	}

	public List<Parcel> getAllParcels() {
		return parcels;
	}

}
