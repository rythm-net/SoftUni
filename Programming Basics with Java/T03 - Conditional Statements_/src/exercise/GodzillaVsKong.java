package exercise;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //четем бюджета
        double budget = Double.parseDouble(scanner.nextLine());
        //четем броя статисти
        int statists = Integer.parseInt(scanner.nextLine());
        //четем цената за облекло за 1 статист
        double clothesPrice = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10; // намираме цената на декора
        double allPriceClothes = clothesPrice * statists; // цената за дрехите на статистите
        //проверка дали статистите са повече от 150 за отстъпка на дрехите
        if (statists >= 150){
            allPriceClothes = allPriceClothes - (allPriceClothes * 0.1);
        }
        //намираме общо колко ще ни струват снимките
        double totalSum = allPriceClothes + decor;
        //проверка дали бюджета е достатъчен
        if (totalSum > budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", totalSum - budget);
        }else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - totalSum);
        }
    }
}