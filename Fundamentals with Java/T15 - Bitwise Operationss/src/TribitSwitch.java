import java.util.Scanner;

public class TribitSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = Long.parseLong(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());

        long mask = (long) 7 << p;
        long result = n ^ mask;

        System.out.println(result);
    }
}