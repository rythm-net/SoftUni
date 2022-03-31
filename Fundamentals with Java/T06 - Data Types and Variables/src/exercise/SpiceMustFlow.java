package exercise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startYield = Integer.parseInt(scanner.nextLine());
        int total      = 0;
        int countDays  = 0;

        while (startYield >= 100) {
            total += startYield;

            if (total > 26) {
                total -= 26;
            }
            startYield -= 10;
            countDays++;
        }

        if (total > 26) {
            total -= 26;
        }
        System.out.println(countDays);
        System.out.println(total);
    }
}