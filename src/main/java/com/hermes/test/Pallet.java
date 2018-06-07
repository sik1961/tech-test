package com.hermes.test;

import java.util.ArrayList;
import java.util.List;

public class Pallet {
	
	private String identifier;
	
	private int palletCount;
	
	private List<Parcel> parcels = new ArrayList<Parcel>();
	private List<Sack> sacks = new ArrayList<Sack>();
	
	public Pallet(String identifier) {
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
		result = prime * result + ((sacks == null) ? 0 : sacks.hashCode());
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
		Pallet other = (Pallet) obj;
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
		if (sacks == null) {
			if (other.sacks != null)
				return false;
		} else if (!sacks.equals(other.sacks))
			return false;
		return true;
	}

	public void addSack(Sack sack) {
		this.sacks.add(sack);
		
	}
	
	public void addParcel(Parcel parcel) {
		this.parcels.add(parcel);
	}

	public List<Sack> getAllSacks() {
		return this.sacks;
	}
	
	public List<Parcel> getAllParcels() {
		return this.parcels;
	}

	public int getCount() {
		palletCount = this.getAllParcels().size();
		for (Sack sack : getAllSacks()) {
			palletCount = palletCount + sack.getAllParcels().size();
		}
		
		return palletCount;
	}

}
