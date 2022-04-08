import java.util.Scanner;

public class BinaryDigitsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        String binaryN = Integer.toBinaryString(n);

        int count = 0;

        for (int i = 0; i < binaryN.length(); i++) {
            if (Integer.parseInt(String.valueOf(binaryN.charAt(i))) == b) {
                count++;
            }
        }

        System.out.println(count);
    }
}