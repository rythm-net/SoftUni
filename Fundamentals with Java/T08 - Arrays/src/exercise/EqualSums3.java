package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int rightSum     = 0;
        int leftSum      = 0;
        boolean isEquals = false;

        for (int number = 0; number < numbers.length; number++) {
            if (number == 0) {
                for (int i = number + 1; i < numbers.length; i++) {
                    rightSum += numbers[i];
                }
            } else if (number == numbers.length - 1) {
                rightSum = 0;
                leftSum = 0;
                for (int i = 0; i < numbers.length - 1; i++) {
                    leftSum += numbers[i];
                }
            } else {
                rightSum = 0;
                leftSum = 0;
                for (int i = 0; i < number; i++) {
                    leftSum += numbers[i];
                }
                for (int i = number + 1; i < numbers.length; i++) {
                    rightSum += numbers[i];
                }
            }
            if (leftSum == rightSum) {
                System.out.print(number);
                isEquals = true;
            }
        }
        if (!isEquals) {
            System.out.print("no");
        }
    }
}