package lecture;

import java.util.Scanner;

public class RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n   = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int odd = 2 * i + 1;
            System.out.println(odd);
            sum += odd;
        }
        System.out.printf("Sum: %d%n", sum);
    }
}