package exercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double totalSum = 0;

        while (!input.equals("Start")) {
            double currentSum = Double.parseDouble(input);
            if (currentSum == 0.10 || currentSum == 0.20 ||
                    currentSum == 0.50 || currentSum == 1.00 || currentSum == 2.00) {
                totalSum += currentSum;
            } else {
                System.out.printf("Cannot accept %.2f\n", currentSum);
            }
            input = scanner.nextLine();
        }

        String purchased = scanner.nextLine();

        while (!purchased.equals("End")) {
            if (purchased.equals("Nuts")) {
//---------------------------------------------------------------------------
                if (totalSum < 2.00) {
                    System.out.println("Sorry, not enough money");
                } else {
                    totalSum -= 2.00;
                    System.out.printf("Purchased %s\n", purchased);
                }
//---------------------------------------------------------------------------
            } else if (purchased.equals("Water")) {
                if (totalSum < 0.70) {
                    System.out.println("Sorry, not enough money");
                } else {
                    totalSum -= 0.70;
                    System.out.printf("Purchased %s\n", purchased);
                }
//---------------------------------------------------------------------------
            } else if (purchased.equals("Crisps")) {
                if (totalSum < 1.50) {
                    System.out.println("Sorry, not enough money");
                } else {
                    totalSum -= 1.50;
                    System.out.printf("Purchased %s\n", purchased);
                }
//---------------------------------------------------------------------------
            } else if (purchased.equals("Soda")) {
                if (totalSum < 0.80) {
                    System.out.println("Sorry, not enough money");
                } else {
                    totalSum -= 0.80;
                    System.out.printf("Purchased %s\n", purchased);
                }
//---------------------------------------------------------------------------
            } else if (purchased.equals("Coke")) {
                if (totalSum < 1.00) {
                    System.out.println("Sorry, not enough money");
                } else {
                    totalSum -= 1.00;
                    System.out.printf("Purchased %s\n", purchased);
                }
//---------------------------------------------------------------------------
            } else {
                System.out.println("Invalid product");
            }
            purchased = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", totalSum);
    }
}