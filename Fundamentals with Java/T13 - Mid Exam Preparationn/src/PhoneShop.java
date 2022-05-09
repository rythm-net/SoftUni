import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PhoneShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <String> phonesList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] commandsArr = command.split(" - ");
            String input = commandsArr[0];
            String item = commandsArr[1];

            switch (input) {
                case "Add":
                    if (!phonesList.contains(item)) {
                        phonesList.add(item);
                    }
                    break;

                case "Remove":
                    if (phonesList.contains(item)) {
                        phonesList.remove(item);
                    }
                    break;

                case "Bonus phone":
                    String[] split = item.split(":");
                    String oldItem = split[0];
                    String newItem = split[1];

                    int index = phonesList.indexOf(oldItem) + 1;

                    if (phonesList.contains(oldItem)) {
                        phonesList.add(index, newItem);
                    }
                    break;

                case "Last":
                    if (phonesList.contains(item)) {
                        index = phonesList.indexOf(item);
                        phonesList.remove(item);
                        phonesList.add(item);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(", ", phonesList));
    }
}