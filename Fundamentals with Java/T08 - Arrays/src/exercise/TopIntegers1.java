package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            boolean isBigger = true;

            for (int j = i + 1; j < numbers.length; j++) {
                if (!(numbers[i] > numbers[j])) {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger) {
                output.append(numbers[i]).append(" ");
            }
        }
        System.out.println(String.join(" ", output));
    }
}