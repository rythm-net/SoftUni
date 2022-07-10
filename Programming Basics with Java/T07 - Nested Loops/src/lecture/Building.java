package lecture;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floors = Integer.parseInt(scanner.nextLine());
        int rooms  = Integer.parseInt(scanner.nextLine());

        for (int f = floors; f >= 1; f--) {
            for (int r = 0; r < rooms; r++) {
                String typeRoom = "";
                if (f == floors) {
                    typeRoom = "L";
                } else if (f % 2 != 0) {
                    typeRoom = "A";
                } else {
                    typeRoom = "O";
                }
                System.out.printf("%s%d%d ",typeRoom, f, r);
            }
            System.out.println();
        }
    }
}