package com.hermes.test;

import java.util.HashSet;
import java.util.Set;

public class Pallet {

	private Long palletId;

	private Set<Stack> stacks;
	private Set<Parcel> parcels;


	public Pallet(Long palletId) {
		this.palletId = palletId;
		stacks = new HashSet<>();
		parcels = new HashSet<>();
	}

	public int numParcels(){

		int count = 0;

		count = count+parcels.size();

		for(Stack stack: stacks){
			count = count+stack.getParcels().size();
		}

		return count;
	}




	public void addStack(Stack stack){
		stacks.add(stack);
	}

	public void addParcel(Parcel parcel){
		parcels.add(parcel);
	}


	public Long getPalletId() {
		return palletId;
	}

	public void setPalletId(Long palletId) {
		this.palletId = palletId;
	}

	public Set<Stack> getStacks() {
		return stacks;
	}

	public void setStacks(Set<Stack> stacks) {
		this.stacks = stacks;
	}

	public Set<Parcel> getParcels() {
		return parcels;
	}

	public void setParcels(Set<Parcel> parcels) {
		this.parcels = parcels;
	}
}
