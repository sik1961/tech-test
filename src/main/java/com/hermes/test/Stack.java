package com.hermes.test;

import java.util.HashSet;
import java.util.Set;

public class Stack {

	Long stackId;
	Set<Parcel> parcels;

	public Stack(Long stackId) {
		this.stackId = stackId;
		parcels = new HashSet<>();
	}

	public void addParcel(Parcel parcel){
		parcels.add(parcel);
	}


	public Long getStackId() {
		return stackId;
	}

	public void setStackId(Long stackId) {
		this.stackId = stackId;
	}

	public Set<Parcel> getParcels() {
		return parcels;
	}

	public void setParcels(Set<Parcel> parcels) {
		this.parcels = parcels;
	}
}
