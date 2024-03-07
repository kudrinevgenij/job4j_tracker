package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] s1 = left.split("\\.");
        String[] s2 = right.split("\\.");
        return Integer.compare(Integer.parseInt(s1[0]), Integer.parseInt(s2[0]));
    }
}
