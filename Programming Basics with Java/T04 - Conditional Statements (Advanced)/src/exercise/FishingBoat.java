package exercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherman = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0.0;

        switch (season) {
            case "Spring":
                totalPrice = 3000;
                break;
            case "Summer":
            case "Autumn":
                totalPrice = 4200;
                break;
            case "Winter":
                totalPrice = 2600;
                break;
            default:
                break;
        }

        if (fisherman <= 6) {
            totalPrice = totalPrice - (totalPrice * 0.10);
        } else if (fisherman > 7 && fisherman <= 11) {
            totalPrice = totalPrice - (totalPrice * 0.15);
        } else if (fisherman > 12) {
            totalPrice = totalPrice - (totalPrice * 0.25);
        }

        if (fisherman % 2 == 0 && !(season.equals("Autumn"))){
            totalPrice = totalPrice - (totalPrice * 0.05);
        }

        if (totalPrice <= budget) {
            System.out.printf("Yes! You have %.2f leva left.", budget - totalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", totalPrice - budget);
        }
    }
}
