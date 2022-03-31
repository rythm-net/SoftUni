package moreExercise;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        if (a >= b && b >= c) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } else if (b >= a && a >= c) {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        } else if (b >= c && c >= a) {
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        } else if (c >= b && b >= a) {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        } else if (c >= a && a >= b) {
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        } else if (a >= c && c >= b) {
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        }
    }
}