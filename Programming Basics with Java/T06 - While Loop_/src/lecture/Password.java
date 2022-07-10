package lecture;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String regPass = scanner.nextLine();
        String currentPass = scanner.nextLine();

        while (!currentPass.equals(regPass)) {
            currentPass = scanner.nextLine();
        }

        System.out.println("Welcome " + username + "!");
    }
}