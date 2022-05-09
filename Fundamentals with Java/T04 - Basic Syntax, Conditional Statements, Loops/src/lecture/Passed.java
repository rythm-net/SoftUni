package lecture;

import java.util.Scanner;

public class Passed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());
        if (n >= 3) {
            System.out.println("lecture.Passed!");
        }
    }
}