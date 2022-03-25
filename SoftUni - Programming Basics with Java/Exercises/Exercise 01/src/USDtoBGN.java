import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //четем дробно число от конзолата
        double usd = Double.parseDouble(scanner.nextLine());
        //изчисляваме USD -> BGN
        double bgn = usd * 1.79549;
        //притираме резултата
        System.out.println(bgn);
    }
}