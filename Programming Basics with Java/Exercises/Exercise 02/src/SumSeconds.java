import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstTime  = Integer.parseInt(scanner.nextLine());
        int secondTime = Integer.parseInt(scanner.nextLine());
        int thirdTime  = Integer.parseInt(scanner.nextLine());

        int totalTime  = firstTime + secondTime + thirdTime;

        int minutes = totalTime / 60;
        int seconds = totalTime % 60;

        if(seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}