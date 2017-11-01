package com.hermes.test;

import org.junit.Assert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

public class TestSack {


	@Test
	public void GivenEmptySack_addParcel_success() throws Exception {


		Container p = new Parcel();
		Container sack =   new Sack();
			sack.add(new Parcel())  ;

		List<Container> res = sack.getParcels();
		assertThat(res.size()).isEqualTo(1);
	}


	@Test
	public void GivenEmptySack_addParcel2_success() throws Exception {


		Container p = new Parcel();
		Container sack =   new Sack();
		sack.add(new Parcel())  ;
		sack.add(new Parcel());

		List<Container> res = sack.getParcels();
		assertThat(res.size()).isEqualTo(2);
	}


}
