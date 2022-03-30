package exercise;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sum = 0;
        int number = Integer.parseInt(input);

        for (int i = 0; i < input.length(); i++) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }
        System.out.println(sum);
    }
}