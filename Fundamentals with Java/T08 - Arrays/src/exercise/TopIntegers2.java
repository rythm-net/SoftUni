package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numbers.length; i++) {
            boolean isBigger = true;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {

                } else {
                    isBigger = false;
                }
            }
            if (isBigger) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}