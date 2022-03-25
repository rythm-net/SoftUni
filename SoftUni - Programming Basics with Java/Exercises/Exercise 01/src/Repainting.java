import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());   //найлон
        int paint = Integer.parseInt(scanner.nextLine());   //боя
        int thinner = Integer.parseInt(scanner.nextLine()); //разредител
        int hours = Integer.parseInt(scanner.nextLine());   // часовете работа

        //цена за найлон
        double priceForNylon = (nylon + 2) * 1.50;
        //цена за боя
        double priceForPaint = (paint + paint * 10 * 0.01) * 14.50;
        //цена за разредител
        double priceForThinner = thinner * 5.00;

        //цената за материалите
        double materialsPrice = priceForNylon + priceForPaint + priceForThinner + 0.40;
        //намираме цената която трябва да платим на работниците
        double workersPrice = (materialsPrice * 30 * 0.01) * hours;
        //обща цена на всички разходи
        double totalSum = materialsPrice + workersPrice;

        System.out.printf("%.2f", totalSum);//принтираме като форматираме цената до втория знак след запетаята
    }
}