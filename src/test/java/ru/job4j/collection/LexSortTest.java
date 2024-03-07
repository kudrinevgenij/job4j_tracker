package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class LexSortTest {
    @Test
    public void when1and2and10() {
        String[] input = new String[] {
                "10. Task.",
                "1. Task.",
                "2. Task."
        };
        String[] output = new String[] {
                "1. Task.",
                "2. Task.",
                "10. Task."
        };
        Arrays.sort(input, new LexSort());
        assertThat(input).containsExactly(output);
    }
}