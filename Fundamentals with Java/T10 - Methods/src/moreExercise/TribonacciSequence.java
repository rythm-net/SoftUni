package moreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printSequenceToNum(number);
    }

    private static void printSequenceToNum(int number) {
        int[] arrNumbers = new int[number];
        if (number == 1) {
            arrNumbers[0] = 1;
        } else if (number == 2) {
            arrNumbers[0] = 1;
            arrNumbers[1] = 1;
        } else if (number == 3) {
            arrNumbers[0] = 1;
            arrNumbers[1] = 1;
            arrNumbers[2] = 2;
        } else {
            arrNumbers[0] = 1;
            arrNumbers[1] = 1;
            arrNumbers[2] = 2;
            for (int i = 3; i < number; i++) {
                arrNumbers[i] = arrNumbers[i - 1] + arrNumbers[i - 2] + arrNumbers[i - 3];
            }
        }
        System.out.print(Arrays.toString(arrNumbers).replaceAll("[\\[\\]]", "").replaceAll(", ", " "));
    }
}