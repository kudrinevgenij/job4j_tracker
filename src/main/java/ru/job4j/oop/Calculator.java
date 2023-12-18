package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int min(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + multiply(y) + min(y) + divide(y);
    }

    public static void main(String[] args) {
       Calculator calculator = new Calculator();
        System.out.println(Calculator.sum(10));
        System.out.println(calculator.multiply(10));
        System.out.println(Calculator.min(10));
        System.out.println(calculator.divide(10));
        System.out.println(calculator.sumAllOperation(10));
    }
}