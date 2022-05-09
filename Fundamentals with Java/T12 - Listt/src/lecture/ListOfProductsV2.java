package lecture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ListOfProductsV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List <String> listOfProduct = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            listOfProduct.add(scanner.nextLine());
        }
        Collections.sort(listOfProduct);
        IntStream.range(0, listOfProduct.size()).forEach(i -> System.out.printf("%d.%s%n", i + 1, listOfProduct.get(i)));
    }
}