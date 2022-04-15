package lecture;

import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (Character.isDigit(symbol)) {
                System.out.print(symbol);
            }
        }
        System.out.println();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (Character.isLetter(symbol)) {
                System.out.print(symbol);
            }
        }
        System.out.println();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (!Character.isLetter(symbol) && !Character.isDigit(symbol)) {
                System.out.print(symbol);
            }
        }
    }
}