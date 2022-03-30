package moreExercise;

import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());

        double ets = 0.000001;
        double different = Math.abs(firstNumber - secondNumber);

        if (different < ets) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}