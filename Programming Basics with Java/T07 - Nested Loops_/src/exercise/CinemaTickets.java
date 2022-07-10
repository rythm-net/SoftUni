package exercise;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int countStandard     = 0;
        int countKids         = 0;
        int countStudents     = 0;
        int countTotalTickets = 0;

        while (!command.equals("Finish")) {
            String movie = command;
            int seats = Integer.parseInt(scanner.nextLine());

            int countCurrentTickets = 0;

            String ticketType = scanner.nextLine();

            while (!ticketType.equals("End")) {
                countCurrentTickets++;
                countTotalTickets++;

                if(ticketType.equals("standard")) {
                    countStandard++;
                } else if (ticketType.equals("student")) {
                    countStudents++;
                } else if (ticketType.equals("kid")) {
                    countKids++;
                }

                if(countCurrentTickets >= seats) {
                    break;
                }
                ticketType = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movie, countCurrentTickets * 1.0 / seats * 100);

            command = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", countTotalTickets);
        System.out.printf("%.2f%% student tickets.%n", countStudents * 1.0 / countTotalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", countStandard * 1.0 / countTotalTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", countKids * 1.0 / countTotalTickets * 100);
    }
}