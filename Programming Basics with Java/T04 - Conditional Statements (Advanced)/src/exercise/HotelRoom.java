package exercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0;
        double apartmentPrice = 0;

        switch (month) {
            case "May":
            case "October":
                studioPrice = nights * 50;
                apartmentPrice = nights * 65;
                if (nights > 14) {
                    studioPrice = studioPrice * 0.70;
                    apartmentPrice = apartmentPrice * 0.90;
                }else  if (nights > 7) {
                    studioPrice = studioPrice * 0.95;
                }
                break;
            case "June":
            case "September":
                studioPrice = nights * 75.20;
                apartmentPrice = nights * 68.70;
                if (nights > 14) {
                    apartmentPrice = apartmentPrice * 0.90;
                    studioPrice = studioPrice * 0.80;
                }
                break;
            case "July":
            case "August":
                studioPrice = nights * 76;
                apartmentPrice = nights * 77;
                if (nights >14) {
                    apartmentPrice = apartmentPrice * 0.90;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.%n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);
    }
}