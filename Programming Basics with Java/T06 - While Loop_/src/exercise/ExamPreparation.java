package exercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxPoorGrades = Integer.parseInt(scanner.nextLine());

        int countBadGrades   = 0;
        int countAllProblems = 0;

        double totalGrades = 0;

        boolean needBreak = false;
        String lastProblem = "";

        String command = scanner.nextLine();
        while (!command.equals("Enough")) {
            String currentProblem = command;
            double grade = Double.parseDouble(scanner.nextLine());
            lastProblem = currentProblem;
            countAllProblems++;

            if (grade <= 4) {
                countBadGrades++;
            }
            totalGrades = totalGrades + grade;

            if (countBadGrades >= maxPoorGrades) {
                needBreak = true;
                break;
            }
            command = scanner.nextLine();
        }

        if (needBreak) {
            System.out.printf("You need a break, %d poor grades.", countBadGrades);
        } else {
            System.out.printf("Average score: %.2f%n", totalGrades / countAllProblems);
            System.out.printf("Number of problems: %d%n", countAllProblems);
            System.out.printf("Last problem: %s%n", lastProblem);
        }
    }
}