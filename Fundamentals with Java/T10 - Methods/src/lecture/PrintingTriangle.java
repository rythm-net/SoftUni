package lecture;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printTopHalf(n);
        printMiddleLine(n);
        printBottomHalf(n);
    }

    public static void printLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printTopHalf(int n) {
        for (int i = 0; i < n; i++) {
            printLine(1, i);
        }
    }

    public static void printMiddleLine(int n) {
        printLine(1, n);
    }

    public static void printBottomHalf(int n) {
        for (int i = n - 1; i >= 1; i--) {
            printLine(1, i);
        }
    }
}