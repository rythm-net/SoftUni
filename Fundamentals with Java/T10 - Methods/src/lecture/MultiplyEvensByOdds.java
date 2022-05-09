package lecture;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(getMultipleOfEvensAndOdds(number));
    }

    private static int getMultipleOfEvensAndOdds(int number) {
        int evensSum = getSumOfEvenDigits(number);
        int odsSum = getSumOfOddDigits(number);
        return evensSum * odsSum;
    }

    private static int getSumOfOddDigits(int number) {
        int odsSum = 0;
        while (number > 0) {
            int count = number % 10;
            if (count % 2 != 0) {
                odsSum += count;
            }
            number /= 10;
        }
        return odsSum;
    }

    private static int getSumOfEvenDigits(int number) {
        int evensSum = 0;
        while (number > 0) {
            int count = number % 10;
            if (count % 2 == 0) {
                evensSum += count;
            }
            number /= 10;
        }
        return evensSum;
    }
}