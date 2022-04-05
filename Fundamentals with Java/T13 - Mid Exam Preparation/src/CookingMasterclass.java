import java.util.Scanner;

public class CookingMasterclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students  = Integer.parseInt(scanner.nextLine());

        double pricePackageOfFlor = Double.parseDouble(scanner.nextLine());
        double priceSingleEgg     = Double.parseDouble(scanner.nextLine());
        double priceSingleApron   = Double.parseDouble(scanner.nextLine());

        double freePackageOfFlour = Math.floor(students / 5.00);

        double itemsCosts = priceSingleApron * (students + Math.ceil(students * 0.2))
                + priceSingleEgg * 10 * students + pricePackageOfFlor * (students - freePackageOfFlour);

        if (itemsCosts <= budget) {
            System.out.printf("Items purchased for %.2f$.", itemsCosts);
        } else {
            System.out.printf("%.2f$ more needed.", itemsCosts - budget);
        }
    }
}