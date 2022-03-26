import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int graphicCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double graphicCardsPrice = graphicCards * 250;
        double processorsPrice = graphicCardsPrice * 0.35 * processors;
        double ramPrice = graphicCardsPrice * 0.10 * ram;

        double totalSum = graphicCardsPrice + processorsPrice + ramPrice;

        if (graphicCards > processors) {
            totalSum = totalSum - (totalSum * 0.15);
        }

        if (totalSum <= budget) {
            System.out.printf("You have %.2f leva left!", budget - totalSum);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalSum - budget);
        }
    }
}
