package ru.job4j.collection;

import java.util.Comparator;

public class DepartmentsDescComparator implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] leftString = left.split("/", 2);
        String[] rightString = right.split("/", 2);
        int firstCompare = rightString[0].compareTo(leftString[0]);
        return firstCompare == 0
                ? leftString[leftString.length - 1].compareTo(rightString[rightString.length - 1]) : firstCompare;
    }
}