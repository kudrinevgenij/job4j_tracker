package ru.job4j.tracker;

import java.util.List;

public final class SingleTracker {

    private MemTracker memTracker = new MemTracker();
    private static SingleTracker singleTracker = null;

    private SingleTracker() {

    }

    public static SingleTracker getInstance() {
        if (singleTracker == null) {
            singleTracker = new SingleTracker();
        }
        return singleTracker;
    }

    public Item add(Item item) {
        return memTracker.add(item);
    }

    public List<Item> findAll() {
        return memTracker.findAll();
    }

    public List<Item> findByName(String key) {
        return findByName(key);
    }

    public int indexOf(int id) {
        return memTracker.indexOf(id);
    }

    public boolean replace(int id, Item item) {
        return memTracker.replace(id, item);
    }

    public Item findById(int id) {
        return memTracker.findById(id);
    }

    public void delete(int id) {
        memTracker.delete(id);
    }
}