package exercise;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double pointsFromAcademy =Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            String judge = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());

            int length = judge.length();
            double calculatedPoints = length * points / 2;

            pointsFromAcademy = pointsFromAcademy + calculatedPoints;

            if (pointsFromAcademy > 1250.5) {
                break;
            }
        }

        if ( pointsFromAcademy > 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, pointsFromAcademy);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - pointsFromAcademy);
        }
    }
}