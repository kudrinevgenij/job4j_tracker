package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public List<Item> findAll() {
        return items;
    }

    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<>();
        int count = 0;
        for (Item item : items) {
            if (key.equals(item.getName())) {
                result.add(item);
            }
        }
        return result;
    }

    public int indexOf(int id) {
        int result = -1;
        for (Item item : items) {
            if (item.getId() == id) {
                result = items.indexOf(item);
                break;
            }
        }
        return result;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            item.setId(id);
            items.add(index, item);
        }
        return result;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public void delete(int id) {
        int index = indexOf(id);
        if (index != -1) {
            items.remove(index);
        }
    }
}