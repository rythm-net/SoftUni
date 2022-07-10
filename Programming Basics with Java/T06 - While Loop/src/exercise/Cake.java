package exercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width  = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int cakePeaces = width * length;

        String command = scanner.nextLine();
        boolean noMoreCake = false;
        while (!command.equals("STOP")) {
            int peaces = Integer.parseInt(command);
            cakePeaces = cakePeaces - peaces;

            if(cakePeaces <= 0) {
                noMoreCake = true;
                break;
            }
            command = scanner.nextLine();
        }

        if (noMoreCake) {
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(cakePeaces));
        } else {
            System.out.printf("%d pieces are left.", cakePeaces);
        }
    }
}