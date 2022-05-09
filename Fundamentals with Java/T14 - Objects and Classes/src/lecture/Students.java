package lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Student> students = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            String[] tokens  = input.split(" ");
            String firstName = tokens[0];
            String lastName  = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String hometown  = tokens[3];
            Student student  = new Student(firstName, lastName, age, hometown);

            students.add(student);
        }

        String cityName = scanner.nextLine();

        for (Student student : students) {
            if (student.getHometown().equals(cityName)) {
                System.out.printf("%s %s is %d years old%n",
                        student.getFirstName(),
                        student.getLastName(),
                        student.getAge(),
                        student.getHometown());
            }
        }
    }

    public static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String hometown;

        Student(String firstName, String lastName, int age, String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getHometown() {
            return hometown;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
        }
    }
}