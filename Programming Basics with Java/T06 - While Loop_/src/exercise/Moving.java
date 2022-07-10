package exercise;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width  = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int space = width * length * height;

        boolean noMoreSpace = false;
        String command = scanner.nextLine();
        while (!command.equals("Done")) {
            int boxes = Integer.parseInt(command);

            space = space - boxes;

            if (space <= 0) {
                noMoreSpace = true;
                break;
            }
            command = scanner.nextLine();
        }

        if (noMoreSpace) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(space));
        } else {
            System.out.printf("%d Cubic meters left.", space);
        }
    }
}