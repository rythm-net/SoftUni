import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //дължината
        int length = Integer.parseInt(scanner.nextLine());
        //широчина
        int width = Integer.parseInt(scanner.nextLine());
        //височина
        int height = Integer.parseInt(scanner.nextLine());
        //процент аксесоари
        double percent = Double.parseDouble(scanner.nextLine());

        int litersInCm = length * width * height;
        double litersInDm = litersInCm * 0.001;
        double litersNeeded = litersInDm - (litersInDm * percent / 100);

        System.out.println(litersNeeded);
    }
}