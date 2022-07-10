import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        double totalDaysSum    = 0;
        int totalCountDaysWin  = 0;
        int totalCountDaysLost = 0;

        for (int i = 1; i <= days; i++) {
            double dayProfit = 0;

            int dayCountWin  = 0;
            int dayCountLost = 0;

            String input = scanner.nextLine();

            while (!input.equals("Finish")) {
                String status = scanner.nextLine();
                if (status.equals("win")) {
                    dayProfit = dayProfit + 20;
                    dayCountWin++;
                } else if (status.equals("lose")) {
                    dayCountLost++;
                }
                input = scanner.nextLine();
            }

            if (dayCountWin > dayCountLost) {
                totalCountDaysWin++;
                dayProfit = dayProfit * 1.10;
            } else {
                totalCountDaysLost++;
            }
            totalDaysSum = totalDaysSum + dayProfit;
        }

        if (totalCountDaysWin > totalCountDaysLost) {
            totalDaysSum = totalDaysSum * 1.20;
            System.out.print("You won the tournament! ");
            System.out.printf("Total raised money: %.2f", totalDaysSum);
        } else {
            System.out.print("You lost the tournament! ");
            System.out.printf("Total raised money: %.2f", totalDaysSum);
        }
    }
}