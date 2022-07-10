package lecture;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sqMeters = Double.parseDouble(scanner.nextLine());

        double totalPrice = sqMeters * 7.61;

        double discount = totalPrice * 0.18;

        double finalPriceWithoutDiscount = totalPrice - discount;

        System.out.printf("The final price is: %f lv.%n", finalPriceWithoutDiscount);
        System.out.printf("The discount is: %f lv.", discount);
    }
}