package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

class ItemAscByNameTest {

    @Test
    void whenAscCompareByName() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Third"));
        items.add(new Item("Second"));
        items.add(new Item("First"));
        List<Item> expected = new ArrayList<>();
        expected.add(items.get(2));
        expected.add(items.get(1));
        expected.add(items.get(0));
        Collections.sort(items, new ItemAscByName());
        assertThat(items).isEqualTo(expected);
    }

    @Test
    void whenDescCompareByName() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("First"));
        items.add(new Item("Second"));
        items.add(new Item("Third"));
        List<Item> expected = new ArrayList<>();
        expected.add(items.get(2));
        expected.add(items.get(1));
        expected.add(items.get(0));
        Collections.sort(items, new ItemDescByName());
        assertThat(items).isEqualTo(expected);
    }
}