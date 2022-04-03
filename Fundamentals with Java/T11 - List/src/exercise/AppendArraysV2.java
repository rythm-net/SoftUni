package exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArraysV2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List <String> numbers= Arrays.stream((scanner.nextLine().split("\\|"))).collect(Collectors.toList());
        Collections.reverse(numbers);

        StringBuilder output= new StringBuilder();

        for (String number : numbers) {
            output.append(number).append(" ");
        }
        System.out.println(output.toString().trim().replaceAll("\\s+"," "));
    }
}