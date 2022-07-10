package exercise;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        double sumInCoins = Math.round(sum * 100);

        int countCoins = 0;

        while (sumInCoins > 0.01) {

            if (sumInCoins >= 200) { // - 2лева
                countCoins++;
                sumInCoins = sumInCoins - 200;
            } else if (sumInCoins >= 100) { // 1 лев
                countCoins++;
                sumInCoins = sumInCoins - 100;
            } else if (sumInCoins >= 50) { // 50 стотинки
                countCoins++;
                sumInCoins = sumInCoins - 50;
            } else if (sumInCoins >= 20) { // 20 стотинки
                countCoins++;
                sumInCoins = sumInCoins - 20;
            } else if (sumInCoins >= 10) { // 10 стотинки
                countCoins++;
                sumInCoins = sumInCoins - 10;
            } else if (sumInCoins >= 5) { // 5 стотинки
                countCoins++;
                sumInCoins = sumInCoins - 5;
            } else if (sumInCoins >= 2) { // 2 стотинки
                countCoins++;
                sumInCoins = sumInCoins - 2;
            } else if (sumInCoins >= 1) { // 1 стотинка
                countCoins++;
                sumInCoins = sumInCoins - 1;
            }
        }
        System.out.println(countCoins);
    }
}