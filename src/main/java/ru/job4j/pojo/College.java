package ru.job4j.pojo;
import java.util.GregorianCalendar;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Evgenij");
        student.setSurname("Kudrin");
        student.setPatronymic("Sergeevich");
        student.setGroup(1);
        student.setDate(new GregorianCalendar(2023, 10, 17));

        System.out.println("Surname: " + student.getSurname() + System.lineSeparator() + "Name: " + student.getName()
                            + System.lineSeparator() + "Patronymic: " + student.getPatronymic() + System.lineSeparator()
                            + "group: " + student.getGroup() + System.lineSeparator() + "date: "
                            + (student.getDate()).getTime());
    }
}
