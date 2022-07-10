package exercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double wasMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int toysCount = 0;

        double money = 0;
        double allMoney = 0;
        int brother = 0;

        for (int i = 1; i <= age ; i++) {

            if (i % 2 == 0) {
                money = money + 10;
                allMoney = allMoney + money;
                brother += 1; // brother++
            } else {
                toysCount += 1; // toysCount++;
            }
        }

        double toySum = toyPrice * toysCount;
        double totalMoney = allMoney - brother + toySum;
        double diff = Math.abs(wasMachinePrice - totalMoney);

        if (totalMoney >= wasMachinePrice) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }
    }
}