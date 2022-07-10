import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double trunkCapacity = Double.parseDouble(scanner.nextLine());

        boolean isFull = false;
        double copyTrunkCapacity = trunkCapacity;
        int countSuitcase = 0;

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            double volumeSuitcase = Double.parseDouble(input);
            countSuitcase++;
            if (countSuitcase % 3 == 0) {
                volumeSuitcase = volumeSuitcase * 1.10;
            }

            copyTrunkCapacity = copyTrunkCapacity - volumeSuitcase;
            if (copyTrunkCapacity <= 0) {
                isFull = true;
                countSuitcase--;
                break;
            }
            input = scanner.nextLine();
        }

        if (isFull) {
            System.out.println("No more space!");
        } else {
            System.out.println("Congratulations! All suitcases are loaded!");
        }
        System.out.printf("Statistic: %d suitcases loaded.%n", countSuitcase);
    }
}