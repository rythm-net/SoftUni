package moreExercise;

import java.util.Scanner;

public class DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int decryptChar = 0;
            char encryptChar = scanner.nextLine().charAt(0);
            decryptChar = encryptChar + key;

            System.out.printf("%c", decryptChar);
        }
    }
}