package ru.job4j.polymorphism;

public interface Transport {
    void drives();

    void passengers(int number);

    int refill(int liters);
}
