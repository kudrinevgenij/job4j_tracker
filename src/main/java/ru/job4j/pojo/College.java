package ru.job4j.pojo;

import java.util.Date;
import java.util.GregorianCalendar;

public class College {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Evgenij");
        student1.setSurname("Kudrin");
        student1.setPatronymic("Sergeevich");
        student1.setGroup(1);
        student1.setDate(new GregorianCalendar(2023, 10, 17));

        System.out.println("Surname: " + student1.getSurname() + System.lineSeparator() + "Name: " + student1.getName()
                            + System.lineSeparator() + "Patronymic: " + student1.getPatronymic() + System.lineSeparator()
                            + "group: " + student1.getGroup() + System.lineSeparator() + "date: "
                            + (student1.getDate()).getTime());
    }
}
