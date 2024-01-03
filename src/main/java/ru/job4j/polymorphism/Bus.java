package ru.job4j.polymorphism;

public class Bus implements Transport {
    private int passengers;

    @Override
    public void drives() {
        System.out.println("Автобус едет.");
    }

    @Override
    public void passengers(int number) {
        this.passengers = number;
    }

    @Override
    public int refill(int liters) {
        int price = 60;
        return liters * price;
    }
}
