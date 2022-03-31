package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int index = 0; index < numbers.length; index++) {
            int number = numbers[index];

            if(index == numbers.length - 1){
                System.out.println(number);
                break;
            }
            boolean isBigger = false;

            for (int i = index + 1; i < numbers.length; i++) {
                if(number > numbers[i]){
                    isBigger = true;
                }else{
                    isBigger = false;
                    break;
                }
            }
            if(isBigger){
                System.out.print(number + " ");
            }
        }
    }
}