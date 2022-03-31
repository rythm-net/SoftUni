package moreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxLength = 0;
        int lastIndex = -1;
        int[] len  = new int[nums.length];
        int[] prev = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            len[i] = 1;
            prev[i] = -1;
            for (int k = 0; k < i; k++) {
                if (nums[k] < nums[i] && len[k] + 1 > len[i]) {
                    len[i] = len[k] + 1;
                    prev[i] = k;
                }
            }
            if (len[i] > maxLength) {
                maxLength = len[i];
                lastIndex = i;
            }
        }
        int[] lis = new int[maxLength];
        int currentIndex = maxLength - 1;

        while (lastIndex != -1) {
            lis[currentIndex] = nums[lastIndex];
            currentIndex--;
            lastIndex = prev[lastIndex];
        }
        Arrays.stream(lis).mapToObj(li -> li + " ").forEach(System.out::print);
    }
}