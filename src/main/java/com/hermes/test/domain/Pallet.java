package com.hermes.test.domain;

import java.util.ArrayList;
import java.util.List;

public class Pallet extends Item {


    public static final class PalletBuilder {
        List<Item> items = new ArrayList<>();
        private String id;

        private PalletBuilder() {
        }

        public static PalletBuilder aPallet() {
            return new PalletBuilder();
        }

        public PalletBuilder withId(String id) {
            this.id = id;
            return this;
        }

        public PalletBuilder withItems(List<Item> items) {
            this.items = items;
            return this;
        }

        public Pallet build() {
            Pallet pallet = new Pallet();
            pallet.setId(id);
            pallet.items = this.items;
            return pallet;
        }
    }
}
