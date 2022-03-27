import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //таксата за една година
        int tax = Integer.parseInt(scanner.nextLine());

        //цената на кецовете
        double sneakersPrice = tax - (tax * 0.40);
        //цената на екипа
        double uniformPrice = sneakersPrice - (sneakersPrice * 0.20);
        //цената на топката
        double ballPrice = uniformPrice / 4;
        //цената на аксесоарите
        double accessories = ballPrice / 5;

        //нужна сума
        double totalPrice = tax + sneakersPrice + uniformPrice + ballPrice + accessories;

        System.out.printf("%.2f", totalPrice);
        //System.out.println(totalPrice);
    }
}