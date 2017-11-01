package com.hermes.test;

import java.util.ArrayList;
import java.util.List;;
import java.util.List;

public class ContainerImplemented implements Container {





	List<Container> parcels = new ArrayList<Container>();


	public void add(Container c) {

		parcels.add(c);


	}


	public List<Container> getParcels() {


		return parcels;
	}
}
}
