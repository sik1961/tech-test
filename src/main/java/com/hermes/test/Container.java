package com.hermes.test;

import java.util.List;

public interface Container {
	void add(Container parcel);

	List<Container> getParcels();
}
