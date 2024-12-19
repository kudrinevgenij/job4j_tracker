package ru.job4j.tracker.action;

import ru.job4j.tracker.*;

public class Create implements UserAction {
    private final Output output;

    public Create(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Добавить новую заявку";
    }

    @Override
    public boolean execute(Input input, Store store, Output output) {
        output.println("=== Create a new Item ===");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        store.add(item);
        output.println("Добавленная заявка: " + item);
        return true;
    }
}
