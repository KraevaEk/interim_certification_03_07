package task2;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MyProgram {

    public static void main(String[] args) throws ParseException {

        System.out.println("Введите дату в формате dd.MM.yyyy");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        Scanner console = new Scanner(System.in);
        LocalDate dateLastWater = LocalDate.parse(console.next(), formatter);
        LocalDate dateWater = new DateWater().getDateWater(dateLastWater);
        if (dateWater.equals(LocalDate.now()) || dateWater.isBefore(LocalDate.now())) {
            System.out.println("Полейте кактус немедленно!!!");
        } else {
            System.out.println("Следующая дата полива кактуса: " + dateWater.format(formatter));
        }

    }
}
