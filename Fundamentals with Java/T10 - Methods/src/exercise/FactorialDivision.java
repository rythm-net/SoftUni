package exercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum    = Integer.parseInt(scanner.nextLine());
        int secondNum   = Integer.parseInt(scanner.nextLine());
        double division = getFactorial(firstNum) / getFactorial(secondNum);

        System.out.printf("%.2f", division);
    }

    public static Double getFactorial(int numbers) {
        double factorial = 1;
        for (int i = 1; i <= numbers; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}