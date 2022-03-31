package exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationMoney  = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());
        double totalMoney = availableMoney;

        int spendStreak = 0;
        int totalDays   = 0;

        boolean cantSaveMoney = false;

        while (totalMoney < vacationMoney) {
            totalDays++;
            String command = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());

            switch (command) {
                case "save":
                    spendStreak = 0;
                    totalMoney = totalMoney + money;
                    break;
                case "spend":
                    spendStreak++;
                    totalMoney = totalMoney - money;
                    if (totalMoney < 0) {
                        totalMoney = 0;
                    }
                    break;
            }

            if (spendStreak == 5) {
                cantSaveMoney = true;
                break;
            }
        }

        if (cantSaveMoney) {
            System.out.println("You can't save the money.");
            System.out.println(totalDays);
        } else {
            System.out.printf("You saved the money for %d days.", totalDays);
        }
    }
}