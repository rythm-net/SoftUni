package moreExercise;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String game = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        boolean flag = true;
        double spentMoney = 0;

        while (!game.equals("Game Time")) {

            switch (game) {
                case "OutFall 4":
                    if (budget >= 39.99) {
                        budget -= 39.99;
                        spentMoney += 39.99;
                        System.out.println("Bought OutFall 4");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
//---------------------------------------------------------------------------------
                case "CS: OG":
                    if (budget >= 15.99) {
                        budget -= 15.99;
                        spentMoney += 15.99;
                        System.out.println("Bought CS: OG");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
//---------------------------------------------------------------------------------
                case "Zplinter Zell":
                    if (budget >= 19.99) {
                        budget -= 19.99;
                        spentMoney += 19.99;
                        System.out.println("Bought Zplinter Zell");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
//---------------------------------------------------------------------------------
                case "Honored 2":
                    if (budget >= 59.99) {
                        budget -= 59.99;
                        spentMoney += 59.99;
                        System.out.println("Bought Honored 2");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
//---------------------------------------------------------------------------------
                case "RoverWatch":
                    if (budget >= 29.99) {
                        budget -= 29.99;
                        spentMoney += 29.99;
                        System.out.println("Bought RoverWatch");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
//---------------------------------------------------------------------------------
                case "RoverWatch Origins Edition":
                    if (budget >= 39.99) {
                        budget -= 39.99;
                        spentMoney += 39.99;
                        System.out.println("Bought RoverWatch Origins Edition");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
//---------------------------------------------------------------------------------
                default:
                    System.out.println("Not Found");
                    break;
            }
            game = scanner.nextLine();
        }

        if (budget == 0) {
            System.out.println("Out of money!");
            flag = false;
        }

        if (flag) {
            System.out.printf("Total spent: $%.2f. ", spentMoney);
            System.out.printf("Remaining: $%.2f", budget);
        }
    }
}