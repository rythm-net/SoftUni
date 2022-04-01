package moreExercise;

import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        printTheClosestPoint(x1, y1, x2, y2);
    }

    private static void printTheClosestPoint(int x1, int y1, int x2, int y2) {
        double firstCenterPoint = Math.sqrt(Math.abs(Math.pow(x1, 2) + Math.pow(y1, 2)));
        double secondCenterPoint = Math.sqrt(Math.abs(Math.pow(x2, 2) + Math.pow(y2, 2)));

        if (firstCenterPoint < secondCenterPoint) {
            System.out.printf("(%d, %d)", x1, y1);
        } else if (firstCenterPoint > secondCenterPoint) {
            System.out.printf("(%d, %d)", x2, y2);
        } else {
            System.out.printf("(%d, %d)", x1, y1);
        }
    }
}