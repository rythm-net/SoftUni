import java.util.Scanner;

public class FootballResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstGameResult  = scanner.nextLine();
        String secondGameResult = scanner.nextLine();
        String thirdGameResult  = scanner.nextLine();

        int countWon   = 0;
        int countLost  = 0;
        int countDrawn = 0;

        char firstGameHost =  firstGameResult.charAt(0);
        char firstGameGuest =  firstGameResult.charAt(2);

        if (firstGameHost > firstGameGuest) {
            countWon++;
        } else if (firstGameGuest > firstGameHost) {
            countLost++;
        } else {
            countDrawn++;
        }

        char secondGameHost =  secondGameResult.charAt(0);
        char secondGameGuest =  secondGameResult.charAt(2);

        if (secondGameHost > secondGameGuest) {
            countWon++;
        } else if (secondGameGuest > secondGameHost) {
            countLost++;
        } else {
            countDrawn++;
        }

        char thirdGameHost =  thirdGameResult.charAt(0);
        char thirdGameGuest =  thirdGameResult.charAt(2);

        if (thirdGameHost > thirdGameGuest) {
            countWon++;
        } else if (thirdGameGuest > thirdGameHost) {
            countLost++;
        } else {
            countDrawn++;
        }

        System.out.printf("Team won %d games.%n", countWon);
        System.out.printf("Team lost %d games.%n", countLost);
        System.out.printf("Drawn games: %d%n", countDrawn);
    }
}