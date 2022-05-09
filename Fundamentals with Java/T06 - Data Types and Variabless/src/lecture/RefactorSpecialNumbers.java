package lecture;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int num = 1; num <= n; num++) {
            int digits = num;
            int sumOfDigits = 0;

            while (digits > 0) {
                sumOfDigits += digits % 10;
                digits = digits / 10;
            }
            boolean isSpecialNum = (sumOfDigits == 5) || (sumOfDigits == 7) || (sumOfDigits == 11);

            if (isSpecialNum) {
                System.out.printf("%d -> %s%n", num, "True");
            } else {
                System.out.printf("%d -> %s%n", num, "False");
            }
        }
    }
}
