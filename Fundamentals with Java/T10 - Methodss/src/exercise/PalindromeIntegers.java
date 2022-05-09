package exercise;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            System.out.println(isPalindrome(input));
            input = scanner.nextLine();
        }
    }

    private static boolean isPalindrome(String input) {
        String reverseString = getReverseString(input);
        return input.equals(reverseString);
    }

    private static String getReverseString(String input) {
        String reverseString = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            char currentChar = input.charAt(i);
            reverseString += currentChar;
        }
        return reverseString;
    }
}