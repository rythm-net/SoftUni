package lecture;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int countProjects = Integer.parseInt(scanner.nextLine());

        int allHours = countProjects * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.%n",
                name, allHours, countProjects);
    }
}