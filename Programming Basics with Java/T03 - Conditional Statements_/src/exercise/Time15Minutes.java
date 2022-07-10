package exercise;

import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMin = hour * 60 + minutes + 15;

        hour = totalMin / 60;    // намираме часа
        minutes = totalMin % 60; // намираме минутите

        if(hour > 23) {
            hour = 0;
        }
        if (minutes < 10) {
            System.out.printf("%d:0%d", hour, minutes);
        } else {
            System.out.printf("%d:%d", hour, minutes);
        }
    }
}