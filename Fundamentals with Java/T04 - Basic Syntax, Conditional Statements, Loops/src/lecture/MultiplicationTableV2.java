package lecture;

import java.util.Scanner;

public class MultiplicationTableV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int times  = Integer.parseInt(scanner.nextLine());

        do {
            System.out.printf("%d X %d = %d%n", number, times, number * times);
            times++;
        } while (times <= 10);
    }
}