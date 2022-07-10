package lecture;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double sum = 0;
        boolean isNegative = false;
        while (!input.equals("NoMoreMoney")) {
            double amount = Double.parseDouble(input);

            if (amount < 0) {
                isNegative = true;
                break;
            }

            sum = sum + amount;
            System.out.printf("Increase: %.2f%n", amount);

            input = scanner.nextLine();
        }

        if (isNegative) {
            System.out.println("Invalid operation!");
        }
        System.out.printf("Total: %.2f", sum);
    }
}