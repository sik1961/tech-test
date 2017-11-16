package com.hermes.test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Container {
	protected List<Container> container = new ArrayList<Container>();
	UUID id = UUID.randomUUID();

	public void add(Container container) {
		this.container.add(container);
	}

	public int getParcelCount() {
		int count = 0;
		
		for (int itemIndex = 0; itemIndex < container.size(); itemIndex++) {
			count += container.get(itemIndex).getParcelCount();
		}

		return count;
	}

	public String getId() {
		return id.toString();
	}

	public Container getItem(String id) {
		for (int itemIndex = 0; itemIndex < container.size(); itemIndex++) {
			if (container.get(itemIndex).getId().equals(id)) {
				return container.get(itemIndex);
			}
		}
		return null;
	}
}
