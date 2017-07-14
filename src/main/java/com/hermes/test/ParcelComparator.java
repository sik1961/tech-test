package com.hermes.test;

import java.util.Comparator;

/**
 * Created by hisg401 on 14/07/2017.
 */
public class ParcelComparator implements Comparator<Parcel> {

	public int compare(Parcel o1, Parcel o2) {
		if (o1.getId() > o2.getId()) return 1;
		else if (o1.getId() == o2.getId()) return 0;
		else return -1;
	}
}
