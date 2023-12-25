package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(item.getCreated().format(formatter));
        System.out.println(item.toString());
    }
}
