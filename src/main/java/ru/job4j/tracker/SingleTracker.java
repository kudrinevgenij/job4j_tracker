package ru.job4j.tracker;

public final class SingleTracker {

    private static Tracker tracker = null;

    private SingleTracker() {

    }

    public static Tracker getInstance() {
        if (tracker == null) {
            tracker = new Tracker();
        }
        return tracker;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item[] findAll() {
        return tracker.findAll();
    }

    public Item[] findByName(String key) {
        return findByName(key);
    }

    public int indexOf(int id) {
        return tracker.indexOf(id);
    }

    public boolean replace(int id, Item item) {
        return tracker.replace(id, item);
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public void delete(int id) {
        tracker.delete(id);
    }
}