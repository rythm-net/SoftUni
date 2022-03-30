package moreExercise;

import java.util.Scanner;

public class RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 2; number <= n; number++) {
            boolean isTrue = true;

            for (int divider = 2; divider < number; divider++) {
                if (number % divider == 0) {
                    isTrue = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", number, isTrue);
        }
    }
}
