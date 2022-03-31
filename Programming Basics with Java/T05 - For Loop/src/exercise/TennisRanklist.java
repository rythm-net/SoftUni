package exercise;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int points = Integer.parseInt(scanner.nextLine());

        int winCount = 0;
        double pointsFromTour = 0;

        for (int i = 1; i <= n ; i++) {

            String stage = scanner.nextLine();

            switch (stage) {
                case "W":
                    points = points + 2000;
                    winCount++;
                    pointsFromTour = pointsFromTour + 2000;
                    break;
                case "F":
                    points = points + 1200;
                    pointsFromTour = pointsFromTour + 1200;
                    break;
                case "SF":
                    points = points + 720;
                    pointsFromTour = pointsFromTour + 720;
                    break;
            }
        }
        double averageWinningPoints = Math.floor(pointsFromTour / n);
        double winInPercent = winCount * 1.0 / n * 100;

        System.out.printf("Final points: %d%n", points);
        System.out.printf("Average points: %.0f%n", averageWinningPoints);
        System.out.printf("%.2f%%", winInPercent);
    }
}