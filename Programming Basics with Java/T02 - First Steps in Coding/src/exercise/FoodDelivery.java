package exercise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //брой пилешки менюта
        int chickenMenu = Integer.parseInt(scanner.nextLine());
        //брой рибешки менюта
        int fishMenu = Integer.parseInt(scanner.nextLine());
        //брой вегетариански менюта
        int vegetarianMenu = Integer.parseInt(scanner.nextLine());

        //Пилешко меню –  10.35 лв.
        //Рибешко меню – 12.40 лв.
        //Вегетарианско меню  – 8.15 лв.

        double chickenPrice = chickenMenu * 10.35;
        double fishPrice = fishMenu * 12.40;
        double vegetarianPrice = vegetarianMenu * 8.15;

        double priceAllMenus = chickenPrice + fishPrice + vegetarianPrice;
        double priceDesert = priceAllMenus * 0.20;
        double totalPrice = priceAllMenus + priceDesert + 2.50;

        System.out.printf("%.2f",totalPrice);
    }
}