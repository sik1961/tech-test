package com.hermes.test;

import java.util.UUID;

public class Parcel {

    private UUID id;

    public Parcel(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}
