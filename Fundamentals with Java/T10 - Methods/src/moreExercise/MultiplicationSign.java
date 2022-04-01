package moreExercise;

import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum  = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum  = Integer.parseInt(scanner.nextLine());

        getSigh(firstNum, secondNum, thirdNum);
    }

    private static void getSigh(int firstNum, int secondNum, int thirdNum) {

        if (firstNum == 0 || secondNum == 0 || thirdNum == 0) {
            System.out.println("zero");
        } else if ((firstNum > 0 && secondNum > 0 && thirdNum > 0)
                || (firstNum < 0 && secondNum < 0 && thirdNum > 0)
                || (firstNum < 0 && secondNum > 0 && thirdNum < 0)
                || (firstNum > 0 && secondNum < 0 && thirdNum < 0)) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }
}