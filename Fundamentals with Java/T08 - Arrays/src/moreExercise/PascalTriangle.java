package moreExercise;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PascalTriangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        long[] numbers = new long[n];
        numbers[0] = 1;

        for (int i = 0; i < n; i++) {
            IntStream.iterate(i, k -> k > 0, k -> k - 1).forEach(k -> numbers[k] = numbers[k - 1] + numbers[k]);
            String[] output = new String[i + 1];

            IntStream.iterate(0, m -> m < output.length, k -> k + 1).forEach(m -> output[m] = String.valueOf(numbers[m]));
            System.out.print("\n" + String.join(" ", output));
        }
    }
}