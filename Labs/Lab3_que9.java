//calculate num of days since 1 jan 1970

import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Lab3_que9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a date (dd/mm/yyyy): ");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        LocalDate epochDate = LocalDate.of(1970, 1, 1);
        LocalDate inputDate = LocalDate.of(year, month, day);
        long daysBetween = ChronoUnit.DAYS.between(epochDate, inputDate);
        System.out.println("Number of days since 1 Jan 1970: " + daysBetween);
        sc.close();
    }
}
