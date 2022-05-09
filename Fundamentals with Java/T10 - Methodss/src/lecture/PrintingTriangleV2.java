package lecture;

import java.util.Scanner;

public class PrintingTriangleV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < input; i++) {
            printLine(i);
        }
        printLine(input);
        for (int i = input - 1; i >= 1; i--) {
            printLine(i);
        }
    }

    private static void printLine(int end) {
        for (int i = 1; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}