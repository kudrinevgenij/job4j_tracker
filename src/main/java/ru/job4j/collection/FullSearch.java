package ru.job4j.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public List<String> extractNumber(List<Task> tasks) {
        List<String> result = new ArrayList<>();
        HashSet<String> numberSet = new HashSet<>();
        for (Task task : tasks) {
            numberSet.add(task.getNumber());
        }
        result.addAll(numberSet);
        return result;
    }
}
