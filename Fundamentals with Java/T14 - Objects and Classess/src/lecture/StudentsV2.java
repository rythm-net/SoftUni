package lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Student> students = new ArrayList<>();

        String line = scanner.nextLine();
        while (!line.equals("end")){
            Student s = Student.parseStudent(line);

            int existingIndex = findStudentIndex(students, s.getFirstName(), s.getLastName());

            if (existingIndex != -1){
                students.get(existingIndex).setHometown(s.hometown);
                students.get(existingIndex).setAge(s.age);
            } else {
                students.add(s);
            }
            line = scanner.nextLine();
        }

        String searchTownName = scanner.nextLine();

        for (Student student : students) {
            if (student.getHometown().equals(searchTownName)){

                System.out.println(student);
            }
        }
    }

    static int findStudentIndex(List<Student> students, String firstName, String lastName){
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getFirstName().equals(firstName)
                    && students.get(i).getLastName().equals(lastName)){
                return i;
            }
        }
        return -1;
    }

    public static class Student{
        private String firstName;
        private String lastName;
        private int age;
        private String hometown;

        Student(String firstName, String lastName, int age, String hometown){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }

        public static Student parseStudent(String text) {
            String[] studentParameters = text.split(" ");
            return new Student(studentParameters[0],
                    studentParameters[1],
                    Integer.parseInt(studentParameters[2]),
                    studentParameters[3]);
        }

        public String getFirstName(){
            return firstName;
        }
        public String getLastName(){
            return lastName;
        }
        public int getAge(){
            return age;
        }
        public String getHometown(){
            return hometown;
        }

        public void setFirstName(String firstName){
            this.firstName = firstName;
        }
        public void setLastName(String lastName){
            this.lastName = lastName;
        }
        public void setAge(int age){
            this.age = age;
        }
        public void setHometown(String hometown){
            this.hometown = hometown;
        }

        @Override
        public String toString() {
            return String.format("%s %s is %d years old",
                    this.getFirstName(),
                    this.getLastName(),
                    this.getAge());
        }
    }
}