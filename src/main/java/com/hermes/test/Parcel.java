package com.hermes.test;

import java.util.UUID;

public class Parcel implements Container {

	private final String id;

	public Parcel() {
		this.id = UUID.randomUUID().toString();
	}

	public String getID() {
		return this.id;
	}
}
