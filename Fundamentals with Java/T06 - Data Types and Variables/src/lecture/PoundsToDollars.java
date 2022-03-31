package lecture;

import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money  = Double.parseDouble(scanner.nextLine());
        double result = money * 1.36;

        System.out.printf("%.3f", result);
    }
}