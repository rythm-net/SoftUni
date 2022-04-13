package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap <String, String> usersAndPlates = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String command  = tokens[0];
            String userName = tokens[1];

            switch (command) {
                case "register":
                    String plateNumber = tokens[2];

                    if (usersAndPlates.containsKey(userName)) {
                        System.out.printf("ERROR: already registered with plate number %s%n",
                                usersAndPlates.get(userName));
                    } else {
                        usersAndPlates.put(userName, plateNumber);
                        System.out.printf("%s registered %s successfully%n", userName, plateNumber);
                    }
                    break;
                case "unregister":
                    if (usersAndPlates.containsKey(userName)) {
                        usersAndPlates.remove(userName);
                        System.out.printf("%s unregistered successfully%n", userName);
                    } else {
                        System.out.printf("ERROR: user %s not found%n", userName);
                    }
                    break;
            }
        }
        for (Map.Entry<String, String> entry : usersAndPlates.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }
    }
}