import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //четем депозираната сума
        double deposit = Double.parseDouble(scanner.nextLine());

        //четем месеците
        int month = Integer.parseInt(scanner.nextLine());

        //четем процент депозит
        double percent = Double.parseDouble(scanner.nextLine());

        //депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        double sum = deposit + month * ((deposit * percent / 100) / 12);

        System.out.println(sum);
    }
}