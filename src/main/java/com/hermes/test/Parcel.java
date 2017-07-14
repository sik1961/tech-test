package com.hermes.test;

/**
 * Created by hisg401 on 14/07/2017.
 */
public class Parcel {
	private long id;

	public Parcel(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Parcel{");
		sb.append("id=").append(id);
		sb.append('}');
		return sb.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Parcel)) return false;

		Parcel parcel = (Parcel) o;

		return getId() == parcel.getId();
	}

	@Override
	public int hashCode() {
		return (int) (getId() ^ (getId() >>> 32));
	}
}
