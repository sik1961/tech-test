package com.hermes.test;

public class Parcel {

	private Long  parcelId;
	private String name;

	public Parcel(Long parcelId) {
		this.parcelId = parcelId;
	}

	public Long getParcelId() {
		return parcelId;
	}

	public void setParcelId(Long parcelId) {
		this.parcelId = parcelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Parcel)) return false;

		Parcel parcel = (Parcel) o;

		return getParcelId().equals(parcel.getParcelId());
	}

	@Override
	public int hashCode() {
		return getParcelId().hashCode();
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Parcel{");
		sb.append("parcelId=").append(parcelId);
		sb.append(", name='").append(name).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
