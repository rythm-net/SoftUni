import java.util.Scanner;

public class EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sweetBreadCount = Integer.parseInt(scanner.nextLine());
        int eggsCount       = Integer.parseInt(scanner.nextLine());
        int cookiesCount    = Integer.parseInt(scanner.nextLine());

        double priceSweetBread = sweetBreadCount * 3.20;
        double eggsPrice       = eggsCount * 4.35;
        double cookiesPrice    = cookiesCount * 5.40;
        double paintEgsPrice   = eggsCount * 12 * 0.15;

        double totalPrice = priceSweetBread + eggsPrice + cookiesPrice + paintEgsPrice;

        System.out.printf("%.2f", totalPrice);
    }
}