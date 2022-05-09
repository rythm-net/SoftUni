package exercise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum  = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum  = Integer.parseInt(scanner.nextLine());

        int sum = getSum(firstNum, secondNum);
        int result = getSubtraction(sum, thirdNum);

        System.out.println(result);

    }

    public static Integer getSum(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    public static Integer getSubtraction(int secondNum, int thirdNum) {
        return secondNum - thirdNum;
    }
}