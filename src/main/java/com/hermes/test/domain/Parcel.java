package com.hermes.test.domain;

import java.util.ArrayList;
import java.util.List;

public class Parcel extends Item {


    public static final class ParcelBuilder {
        List<Item> items = new ArrayList<>();
        private String id;

        private ParcelBuilder() {
        }

        public static ParcelBuilder aParcel() {
            return new ParcelBuilder();
        }

        public ParcelBuilder withId(String id) {
            this.id = id;
            return this;
        }

        public ParcelBuilder withItems(List<Item> items) {
            this.items = items;
            return this;
        }

        public Parcel build() {
            Parcel parcel = new Parcel();
            parcel.setId(id);
            parcel.items = this.items;
            return parcel;
        }
    }
}
