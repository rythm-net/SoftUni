package exercise;

import java.util.Scanner;

public class OperationsBetweenNumbersV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);

        double result = 0;
        String evenOrOdd = "";
        boolean isZero = false;

        switch (operator) {
            case '+':
                result = numberOne + numberTwo;

                break;
            case '-':
                result = numberOne - numberTwo;

                break;
            case '*':
                result = numberOne * numberTwo;

                break;
            case '/':
                if (numberTwo == 0) {
                    isZero = true;
                } else {
                    result = numberOne * 1.0 / numberTwo;
                }

                break;
            case '%':
                if (numberTwo == 0) {
                    isZero = true;
                } else {
                    result = numberOne % numberTwo;
                }

                break;
        }

        if (result % 2 == 0) {
            evenOrOdd = "even";
        } else {
            evenOrOdd = "odd";
        }

        if(operator == '+' || operator == '-' || operator == '*') {
            System.out.printf("%d %c %d = %.0f - %s",numberOne, operator, numberTwo, result, evenOrOdd);
        } else if (operator == '/' && !isZero) {
            System.out.printf("%d %c %d = %.2f",numberOne, operator, numberTwo, result);
        } else if (operator == '%' && !isZero) {
            System.out.printf("%d %c %d = %.0f",numberOne, operator, numberTwo, result );
        } else {
            System.out.printf("Cannot divide %d by zero", numberOne);
        }
    }
}