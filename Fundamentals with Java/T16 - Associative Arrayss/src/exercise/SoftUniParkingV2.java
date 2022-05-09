package exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class SoftUniParkingV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap <String, String> users = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String command  = tokens[0];
            String userName = tokens[1];

            switch (command) {
                case "register":
                    String plateNumber = tokens[2];

                    if (users.containsKey(userName)) {
                        System.out.println("ERROR: already registered with plate number " +
                                users.get(userName));
                    } else {
                        users.put(userName, plateNumber);
                        System.out.printf("%s registered %s successfully%n", userName, plateNumber);
                    }
                    break;
                case "unregister":
                    if (users.containsKey(userName)) {
                        users.remove(userName);
                        System.out.printf("%s unregistered successfully%n", userName);
                    } else {
                        System.out.printf("ERROR: user %s not found%n", userName);
                    }
                    break;
            }
        }
        users.forEach((k, v) -> System.out.println(k + " => " + v));
    }
}