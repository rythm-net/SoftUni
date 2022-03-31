package exercise;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int musala      = 0;
        int monblan     = 0;
        int kilimanjaro = 0;
        int k2          = 0;
        int everest     = 0;
        int totalPeople = 0;

        for (int i = 0; i < n; i++) {
            int people = Integer.parseInt(scanner.nextLine());

            if(people <= 5) {
                musala = musala + people;
            } else if (people <= 12) {
                monblan = monblan + people;
            } else if (people <= 25) {
                kilimanjaro = kilimanjaro + people;
            } else if (people <= 40) {
                k2 = k2 + people;
            } else {
                everest = everest + people;
            }
            totalPeople += people;
        }
        System.out.printf("%.2f%%%n", musala * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n", monblan * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n", kilimanjaro * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n", k2 * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%", everest * 1.0 / totalPeople * 100);
    }
}