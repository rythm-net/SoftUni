package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean isEqual = false;
        int number = 0;

        for (int i = 0; i < numbers.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += numbers[j];
            }
            for (int j = i + 1; j < numbers.length; j++) {
                rightSum += numbers[j];
            }

            if (leftSum == rightSum) {
                isEqual = true;
                number = i;
                break;
            }
        }
        if (isEqual) {
            System.out.println(number);
        } else {
            System.out.println("no");
        }
    }
}