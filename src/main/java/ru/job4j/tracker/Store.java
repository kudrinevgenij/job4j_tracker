package ru.job4j.tracker;

import ru.job4j.tracker.Item;

import java.sql.SQLException;
import java.util.List;

public interface Store extends AutoCloseable {

    Item add(Item item);

    boolean replace(int id, Item item);

    void delete(int id);

    List<Item> findAll() throws SQLException;

    List<Item> findByName(String key);

    Item findById(int id);
}