package com.hermes.test.domain;

import java.util.ArrayList;
import java.util.List;

public abstract class Item {
    private String id;

    List<Item> items = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        return id != null ? id.equals(item.id) : item.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    public List<Item> getAllItems() {
        return childItems(this);
    }

    public List<Item> childItems(Item item) {
        List<Item> items = new ArrayList<>();
        if(!item.getItems().isEmpty()) {
            item.getItems().stream().flatMap(it -> childItems(it).stream()).forEach(items::add);
        }
        else {
            items.add(item);
        }
        return items;

    }
}
