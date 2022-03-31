package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] bugPositions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] field = new int[fieldSize];

        for (int i = 0; i < bugPositions.length; i++) {
            int index = bugPositions[i];
            if (index >= 0 && index < field.length) {
                field[index] = 1;
            }
        }

        String line = scanner.nextLine();

        while (!line.equals("end")) {
            String[] data = line.split(" ");
            int index = Integer.parseInt(data[0]);
            String direction = data[1];
            int flyLength = Integer.parseInt(data[2]);

            if (index < 0 || index >= field.length || field[index] != 1) {
                line = scanner.nextLine();
                continue;
            }

            field[index] = 0;
            switch (direction) {
                case "right":
                    index += flyLength;

                    while (index < fieldSize && field[index] == 1) {
                        index += flyLength;
                    }

                    if (index < fieldSize) {
                        field[index] = 1;
                    }
                    break;
                case "left":
                    index -= flyLength;

                    while (index >= 0 && field[index] == 1) {
                        index -= flyLength;
                    }

                    if (index >= 0) {
                        field[index] = 1;
                    }
                    break;
            }
            line = scanner.nextLine();
        }
        Arrays.stream(field).forEach(e -> System.out.print(e + " "));
    }
}