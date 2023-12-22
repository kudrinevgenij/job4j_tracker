package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 450);
        Book onegin = new Book("Onegin", 250);
        Book twentyMonth = new Book("Twenty month", 130);
        Book harryPotter = new Book("Harry Potter", 350);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = twentyMonth;
        books[2] = onegin;
        books[3] = harryPotter;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getPages());
        }
        books[0] = harryPotter;
        books[3] = cleanCode;
        System.out.println(System.lineSeparator() + "After swap");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getPages());
        }
        System.out.println(System.lineSeparator() + "Only clean code");
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean code")) {
                System.out.println(books[i].getName() + " - " + books[i].getPages());
            }
        }
    }
}
