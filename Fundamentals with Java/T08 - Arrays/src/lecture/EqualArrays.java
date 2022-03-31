package lecture;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstNumbers  = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] secondNumbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        boolean equals = true;
        int sum        = 0;

        for (int i = 0; i < firstNumbers.length; i++) {

            if (!(firstNumbers[i] == secondNumbers[i])) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                equals = false;
                break;
            } else {
                sum += firstNumbers[i];
            }
        }
        if (equals) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}