package ru.job4j.collection;

import java.util.*;

public class FullSearch {
    public Set<String> extractNumber(List<Task> tasks) {
        List<String> result = new ArrayList<>();
        for (Task task : tasks) {
            result.add(task.getNumber());
        }
        return new HashSet<>(result);
    }
}
