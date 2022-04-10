import java.util.Scanner;

public class PcGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int hearthstoneCount = 0;
        int forniteCount     = 0;
        int overWatchCount   = 0;
        int otherCount       = 0;

        for (int i = 1; i <= n; i++) {
            String nameGame = scanner.nextLine();

            switch (nameGame) {
                case "Hearthstone":
                    hearthstoneCount++;
                    break;
                case "Fornite":
                    forniteCount++;
                    break;
                case "Overwatch":
                    overWatchCount++;
                    break;
                default:
                    otherCount++;
                    break;
            }
        }

        System.out.printf("Hearthstone - %.2f%%%n", hearthstoneCount * 1.0 / n * 100);
        System.out.printf("Fornite - %.2f%%%n", forniteCount * 1.0 / n * 100);
        System.out.printf("Overwatch - %.2f%%%n", overWatchCount * 1.0 / n * 100);
        System.out.printf("Others - %.2f%%%n", otherCount * 1.0 / n * 100);
    }
}