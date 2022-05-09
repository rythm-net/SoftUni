package lecture;

import java.util.Scanner;

public class MathOperationsV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum    = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNum   = Integer.parseInt(scanner.nextLine());

        switch (operator) {
            case "+":
                System.out.printf("%.0f", Sum(firstNum, secondNum));
                break;

            case "-":
                System.out.printf("%.0f", Subtract(firstNum, secondNum));
                break;

            case "*":
                System.out.printf("%.0f", Multiply(firstNum, secondNum));
                break;

            case "/":
                System.out.printf("%.0f", Divide(firstNum, secondNum));
        }
    }

    public static double Sum(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    public static double Subtract(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    public static double Multiply(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    public static double Divide(int fistNum, int secondNum) {
        return fistNum / secondNum;
    }
}