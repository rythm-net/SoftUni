package exercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printAllTopNumbers(number);
    }

    private static void printAllTopNumbers(int number) {
        for (int i = 1; i <= number; i++) {
            int sum = 0;
            int checkNum = i;
            boolean odd = false;

            while (checkNum > 0) {
                int lastDigit = checkNum % 10;

                if ((lastDigit % 2 != 0)) {
                    odd = true;
                }
                sum += lastDigit;
                checkNum /= 10;
            }
            if ((sum % 8 == 0) && (odd)) {
                System.out.println(i);
            }
        }
    }
}