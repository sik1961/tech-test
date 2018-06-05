package com.hermes.test;

import java.util.ArrayList;
import java.util.UUID;

public class Sack extends ArrayList<Container> implements Container {

	private final String id;

	public Sack() {
		this.id = UUID.randomUUID().toString();
	}

	public String getID() {
		return this.id;
	}

}
