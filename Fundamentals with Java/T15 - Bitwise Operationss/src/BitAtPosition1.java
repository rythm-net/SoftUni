import java.util.Scanner;

public class BitAtPosition1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int p = 1;
        int bitAtPosition1 = (n >> p) & 1;

        System.out.println(bitAtPosition1);
    }
}