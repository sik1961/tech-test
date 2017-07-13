package com.hermes.test.domain;

import java.util.ArrayList;
import java.util.List;

public class Sack extends Item {


    public static final class SackBuilder {
        List<Item> items = new ArrayList<>();
        private String id;

        private SackBuilder() {
        }

        public static SackBuilder aSack() {
            return new SackBuilder();
        }

        public SackBuilder withId(String id) {
            this.id = id;
            return this;
        }

        public SackBuilder withItems(List<Item> items) {
            this.items = items;
            return this;
        }

        public Sack build() {
            Sack sack = new Sack();
            sack.setId(id);
            sack.items = this.items;
            return sack;
        }
    }
}
