package lecture;

import java.util.Scanner;

public class GreaterOfTwoValuesV3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if(input.equals("int")) {
            int firstNumber = Integer.parseInt(scanner.nextLine());
            int secondNumber = Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(firstNumber,secondNumber));

        } else if (input.equals("char")) {
            char firstSymbol = scanner.nextLine().charAt(0);
            char secondSymbol = scanner.nextLine().charAt(0);
            System.out.println(getMax(firstSymbol,secondSymbol));

        } else if (input.equals("string")) {
            String firstString = scanner.nextLine();
            String secondString = scanner.nextLine();
            System.out.println(getMax(firstString,secondString));
        }
    }
    public static Integer getMax(int firstNumber, int secondNumber){
        if(firstNumber > secondNumber){
            return firstNumber;
        }
        return secondNumber;
    }
    public static Character getMax(char firstSymbol, char secondSymbol){
        if(firstSymbol > secondSymbol){
            return firstSymbol;
        }
        return secondSymbol;
    }
    public static String getMax(String firstString, String secondString){
        if(firstString.compareTo(secondString) >= 0){
            return firstString;
        }
        return secondString;
    }
}