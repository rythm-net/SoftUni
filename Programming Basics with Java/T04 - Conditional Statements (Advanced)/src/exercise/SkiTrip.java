package exercise;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String positiveOrNegative = scanner.nextLine();

        double priceForHoliday = 0;

        switch (roomType) {
            case "room for one person":
                priceForHoliday = (days - 1) * 18.0;
                break;
            case "apartment":
                priceForHoliday = (days - 1) * 25.0;
                if (days < 10) {
                    priceForHoliday = priceForHoliday - (priceForHoliday * 0.30);
                } else if (days >= 10 && days <= 15) {
                    priceForHoliday = priceForHoliday - (priceForHoliday * 0.35);
                } else if (days > 15) {
                    priceForHoliday = priceForHoliday - (priceForHoliday * 0.50);
                }
                break;
            case "president apartment":
                priceForHoliday = (days -1) * 35.0;
                if (days < 10) {
                    priceForHoliday = priceForHoliday - (priceForHoliday * 0.10);
                } else if (days >= 10 && days <= 15) {
                    priceForHoliday = priceForHoliday - (priceForHoliday * 0.15);
                } else if (days > 15) {
                    priceForHoliday = priceForHoliday - (priceForHoliday * 0.20);
                }
                break;
        }
        if (positiveOrNegative.equals("positive")) {
            priceForHoliday = priceForHoliday + (priceForHoliday * 0.25);
        } else if (positiveOrNegative.equals("negative")) {
            priceForHoliday = priceForHoliday - (priceForHoliday * 0.10);
        }

        System.out.printf("%.2f", priceForHoliday);
    }
}