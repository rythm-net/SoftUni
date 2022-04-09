package exercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        double allGradesSum = 0;
        int countAllGrades  = 0;

        while (!command.equals("Finish")) {
            String presentation = command;

            double sumCurrentGrade = 0;
            for (int i = 1; i <= n ; i++) {
                double currentGrade = Double.parseDouble(scanner.nextLine());
                sumCurrentGrade = sumCurrentGrade + currentGrade;
                countAllGrades++;
            }

            allGradesSum = allGradesSum + sumCurrentGrade;

            double avgCurrentGrade = sumCurrentGrade / n;
            System.out.printf("%s - %.2f.%n", presentation, avgCurrentGrade);

            command = scanner.nextLine();
        }
        double finalGrade = allGradesSum / countAllGrades;
        System.out.printf("Student's final assessment is %.2f.", finalGrade);
    }
}