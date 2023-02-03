package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SchoolTeams {

    private static StringBuilder out = new StringBuilder();

    private static String[] girls;
    private static String[] girlsCombinations = new String[3];
    private static String[] boys;
    private static String[] boysCombinations = new String[2];

    private static List<String> allGirls = new ArrayList<>();
    private static List<String> allBoys = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        girls = rd.readLine().split(", ");
        boys = rd.readLine().split(", ");
        rd.close();

        combineGirls(0, 0);
        combineBoys(0, 0);

        for (String girls : allGirls) {
            for (String boys : allBoys) {
                out.append(girls).append(", ").append(boys).append(System.lineSeparator());
            }
        }
        System.out.print(out);
    }

    private static void combineGirls(int index, int start) {

        if (index == 3) {
            allGirls.add(String.join(", ", girlsCombinations));
        } else {
            for (int i = start; i < girls.length; i++) {
                girlsCombinations[index] = girls[i];
                combineGirls(index + 1, i + 1);
            }
        }
    }

    private static void combineBoys(int index, int start) {

        if (index == 2) {
            allBoys.add(String.join(", ", boysCombinations));
        } else {
            for (int i = start; i < boys.length; i++) {
                boysCombinations[index] = boys[i];
                combineBoys(index + 1, i + 1);
            }
        }
    }
}