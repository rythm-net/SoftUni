package exercise;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            if(input.equals("Facebook")) {
                salary = salary - 150;
            } else if (input.equals("Instagram")) {
                salary = salary - 100;
            } else if (input.equals("Reddit")) {
                salary = salary - 50;
            }

            if (salary <= 0) {
                break;
            }
        }

        if(salary > 0) {
            System.out.println(salary);
        } else {
            System.out.println("You have lost your salary.");
        }
    }
}