package ru.job4j.tracker.action;

import ru.job4j.tracker.*;

import java.sql.SQLException;
import java.util.List;

public class FindAll implements UserAction {
    private final Output output;

    public FindAll(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Показать все заявки";
    }

    @Override
    public boolean execute(Input input, Store store, Output output) throws SQLException {
        output.println("=== Вывод всех заявок ===");
        List<Item> items = store.findAll();
        if (items.size() > 0) {
            for (Item item : items) {
                output.println(item);
            }
        } else {
            output.println("Хранилище еще не содержит заявок");
        }
        return true;
    }
}
