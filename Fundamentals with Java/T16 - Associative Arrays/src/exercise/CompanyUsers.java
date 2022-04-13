package exercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map <String, List<String>> companies = new LinkedHashMap<>();
        String[] tokens = scanner.nextLine().split(" -> ");

        while (!tokens[0].equals("End")) {

            String companyName = tokens[0];
            String employeeID  = tokens[1];

            companies.putIfAbsent(companyName, new ArrayList<>());
            if (!companies.get(companyName).contains(employeeID)) {
                companies.get(companyName).add(employeeID);
            }
            tokens = scanner.nextLine().split(" -> ");
        }
        companies.entrySet().forEach(k -> {
            System.out.println(k.getKey());k.getValue().forEach(v -> System.out.printf("-- %s%n", v));
        });
    }
}