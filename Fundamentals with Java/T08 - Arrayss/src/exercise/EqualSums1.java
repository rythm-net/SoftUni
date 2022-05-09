package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numbers.length; i++) {
            int leftSum  = 0;
            int rightSum = 0;

            for (int k = i - 1; k >= 0; k--) {
                leftSum += numbers[k];
            }
            for (int j = i + 1; j < numbers.length; j++) {
                rightSum += numbers[j];
            }
            if (leftSum == rightSum) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("no");
    }
}