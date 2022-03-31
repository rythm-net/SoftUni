package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int maxCount   = 0;
        int maxElement = 0;
        int count      = 0;

        for (int number = 0; number < numbers.length - 1; number++) {
            if (numbers[number] == numbers[number + 1]) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                    maxElement = numbers[number];
                }
            } else {
                count = 0;
            }
        }
        for (int i = 1; i <= maxCount + 1; i++) {
            System.out.print(maxElement + " ");
        }
    }
}