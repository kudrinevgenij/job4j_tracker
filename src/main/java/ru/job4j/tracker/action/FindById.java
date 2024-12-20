package ru.job4j.tracker.action;

import ru.job4j.tracker.*;

public class FindById implements UserAction {
    private final Output output;

    public FindById(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Показать заявку по id";
    }

    @Override
    public boolean execute(Input input, Store store, Output output) {
        output.println("=== Вывод заявки по id ===");
        int id = input.askInt("Введите id: ");
        Item item = store.findById(id);
        if (item != null) {
            output.println(item);
        } else {
           output.println("Заявка с введенным id: " + id + " не найдена");
        }
        return true;
    }
}
