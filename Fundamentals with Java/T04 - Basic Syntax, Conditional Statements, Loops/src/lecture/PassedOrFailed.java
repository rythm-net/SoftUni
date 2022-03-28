package lecture;

import java.util.Scanner;

public class PassedOrFailed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());
        if (n < 3) {
            System.out.println("Failed!");
        } else {
            System.out.println("lecture.Passed!");
        }
    }
}