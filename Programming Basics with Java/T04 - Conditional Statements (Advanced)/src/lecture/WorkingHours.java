package lecture;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

        if (hour >= 10 && hour <= 18) {
            if (dayOfWeek.equals("Monday") ||
                    dayOfWeek.equals("Tuesday") ||
                    dayOfWeek.equals("Wednesday") ||
                    dayOfWeek.equals("Thursday") ||
                    dayOfWeek.equals("Friday") ||
                    dayOfWeek.equals("Saturday")) {
                System.out.println("open");
            } else {
                System.out.println("closed");
            }
        } else {
            System.out.println("closed");
        }
    }
}