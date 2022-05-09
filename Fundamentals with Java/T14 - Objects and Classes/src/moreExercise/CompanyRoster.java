package moreExercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CompanyRoster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List <Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            Employee employee = Employee.parseEmployee(line);
            employees.add(employee);
        }

        List <String> uniqueDepartments = employees.stream()
                .map(Employee::getDepartment)
                    .distinct()
                        .collect(Collectors.toList());

        List <Department> departments   = new ArrayList<>();
        for (String department : uniqueDepartments) {
            departments.add(new Department(department, employees.stream()
                    .filter(employee -> employee.getDepartment()
                            .equals(department))
                                .collect(Collectors.toList())));
        }

        departments.sort(Comparator.comparingDouble(Department::getAvgSalary).reversed());
        Department department = departments.get(0);
        department.getEmployees().sort(Comparator.comparingDouble(Employee::getSalary).reversed());

        System.out.printf("Highest Average Salary: %s%n", department.getName());
        for (Employee employee : department.getEmployees()) {
            System.out.printf("%s %.2f %s %d%n", employee.getName(), employee.getSalary(),
                    employee.getEmail(), employee.getAge());
        }
    }

    public static class Department {
        List <Employee> employees;
        String departmentName;
        double avgSalary;

        Department(String name, List<Employee> employees) {
            this.departmentName = name;
            this.employees = employees;
            this.avgSalary = employees.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
        }

        double getAvgSalary() {
            return avgSalary;
        }

        String getName() {
            return departmentName;
        }

        List<Employee> getEmployees() {
            return employees;
        }
    }


    public static class Employee {
        String name;
        double salary;
        String position;
        String department;
        String email;
        int age;

        public Employee(String name, double salary, String position, String department) {
            this.name = name;
            this.salary = salary;
            this.position = position;
            this.department = department;
            this.email = "n/a";
            this.age = -1;
        }

        double getSalary() {
            return salary;
        }

        String getDepartment() {
            return department;
        }

        String getName() {
            return name;
        }

        public String getPosition() {
            return position;
        }

        String getEmail() {
            return email;
        }

        int getAge() {
            return age;
        }

        void setName(String name) {
            this.name = name;
        }

        void setSalary(double salary) {
            this.salary = salary;
        }

        void setPosition(String position) {
            this.position = position;
        }

        void setDepartment(String department) {
            this.department = department;
        }

        void setEmail(String email) {
            this.email = email;
        }

        void setAge(int age) {
            this.age = age;
        }

        public static Employee parseEmployee(String line) {
            String[] employeeParameters = line.split(" ");
            Employee employee = new Employee(employeeParameters[0],
                    Double.parseDouble(employeeParameters[1]),
                    employeeParameters[2],
                    employeeParameters[3]);


            switch (employeeParameters.length) {
                case 5:
                    if (employeeParameters[4].contains("@")) {
                        employee.setEmail(employeeParameters[4]);
                    } else {
                        employee.setAge(Integer.parseInt(employeeParameters[4]));
                    }
                    break;
                case 6:
                    employee.setEmail(employeeParameters[4]);
                    employee.setAge(Integer.parseInt(employeeParameters[5]));
                    break;
            }
            return employee;
        }
    }
}