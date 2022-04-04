package lecture;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> inputList = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandLine = command.split(" ");

            switch (commandLine[0]) {
                case "Add":
                    inputList.add(Integer.parseInt(commandLine[1]));
                    break;
                case "Remove":
                    inputList.remove(Integer.valueOf(Integer.parseInt(commandLine[1])));
                    break;
                case "RemoveAt":
                    inputList.remove(Integer.parseInt(commandLine[1]));
                    break;
                case "Insert":
                    inputList.add(Integer.parseInt(commandLine[2]), Integer.parseInt(commandLine[1]));
                    break;
            }
            command = scanner.nextLine();
        }
        for (int items :
                inputList) {
            System.out.print(items + " ");
        }
    }
}