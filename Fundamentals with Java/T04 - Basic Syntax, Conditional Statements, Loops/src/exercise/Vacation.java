package exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;
//------------------------------------------------------------------
        if (typeGroup.equals("Students")) {
            if (day.equals("Friday")) {
                if (number >= 30) {
                    price = number * 8.45 * 0.85;
                } else {
                    price = number * 8.45;
                }
            } else if (day.equals("Saturday")) {
                if (number >= 30) {
                    price = number * 9.80 * 0.85;
                } else {
                    price = number * 9.80;
                }
            } else if (day.equals("Sunday")) {
                if (number >= 30) {
                    price = number * 10.46 * 0.85;
                } else {
                    price = number * 10.46;
                }
            }
//------------------------------------------------------------------
        } else if (typeGroup.equals("Business")) {
            if (day.equals("Friday")) {
                if (number >= 100) {
                    price = (number - 10) * 10.90;
                } else {
                    price = number * 10.90;
                }
            } else if (day.equals("Saturday")) {
                if (number >= 100) {
                    price = (number - 10) * 15.60;
                } else {
                    price = number * 15.60;
                }
            } else if (day.equals("Sunday")) {
                if (number >= 100) {
                    price = (number - 10) * 16;
                } else {
                    price = number * 16;
                }
            }
//------------------------------------------------------------------
        } else if (typeGroup.equals("Regular")) {
            if (day.equals("Friday")) {
                if (number >= 10 && number <= 20) {
                    price = number * 15 * 0.95;
                } else {
                    price = number * 15;
                }
            } else if (day.equals("Saturday")) {
                if (number >= 10 && number <= 20) {
                    price = number * 20 * 0.95;
                } else {
                    price = number * 20;
                }
            } else if (day.equals("Sunday")) {
                if (number >= 10 && number <= 20) {
                    price = number * 22.50 * 0.95;
                } else {
                    price = number * 22.50;
                }
            }
//------------------------------------------------------------------
        }
        System.out.printf("Total price: %.2f", price);
    }
}