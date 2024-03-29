package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class PeekExample {
    public static void main(String[] args) {
        List<StringBuilder> names = Arrays.asList(
                new StringBuilder("Михаил"), new StringBuilder("Иван"), new StringBuilder("Елена"));
        List<String> editedNames = names
                .stream()
                .peek((element) -> element.append(" (Ученик Job4j)"))
                .map(StringBuilder::toString)
                .sorted()
                .toList();
        System.out.println(editedNames);
    }
}