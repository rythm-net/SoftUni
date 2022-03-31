package lecture;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double income = Double.parseDouble(scanner.nextLine());

        boolean isInvalid = false;
        double commission = 0;
        switch (town){
            case "Sofia":
                if (income >= 0 && income <= 500) {
                    commission = income * 0.05;
                } else if (income > 500 && income <= 1000) {
                    commission = income * 0.07;
                }  else if (income > 1000 && income <= 10000) {
                    commission = income * 0.08;
                }  else if (income > 10000) {
                    commission = income * 0.12;
                } else {
                    isInvalid = true;
                }
                break;
            case "Varna":
                if (income >= 0 && income <= 500) {
                    commission = income * 0.045;
                } else if (income > 500 && income <= 1000) {
                    commission = income * 0.075;
                }  else if (income > 1000 && income <= 10000) {
                    commission = income * 0.10;
                }  else if (income > 10000) {
                    commission = income * 0.13;
                } else {
                    isInvalid = true;
                }
                break;
            case "Plovdiv":
                if (income >= 0 && income <= 500) {
                    commission = income * 0.055;
                } else if (income > 500 && income <= 1000) {
                    commission = income * 0.08;
                }  else if (income > 1000 && income <= 10000) {
                    commission = income * 0.12;
                }  else if (income > 10000) {
                    commission = income * 0.145;
                } else {
                    isInvalid = true;
                }
                break;
            default:
                isInvalid = true;
        }

        if (isInvalid) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", commission);
        }
    }
}