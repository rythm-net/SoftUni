using System;
using System.Collections.Generic;
using System.Linq;

namespace _01._Company_Rooster
{
    class Program
    {
        static void Main(string[] args)
        {
            Dictionary<string, List<Employee>> rooster = new Dictionary<string, List<Employee>>();
            int n = int.Parse(Console.ReadLine());

            for (int i = 0; i < n; i++)
            {
                string[] commandArgs = Console.ReadLine().Split(' ', StringSplitOptions.RemoveEmptyEntries);

                AddEmployeeToRooster(commandArgs, rooster);
            }

            decimal highestAverageSalary = 0m;
            string highestEarningdepartment = string.Empty;

            foreach (var department in rooster)
            {
                int numberOfEmployees = department.Value.Count;

                decimal totalSalaryOfEmployees = department.Value.Sum(e => e.Salary);
                decimal departmentAverageSalary = totalSalaryOfEmployees / numberOfEmployees;

                if (departmentAverageSalary > highestAverageSalary)
                {
                    highestAverageSalary = departmentAverageSalary;
                    highestEarningdepartment = department.Key;
                }
            }

            rooster[highestEarningdepartment] = rooster[highestEarningdepartment].OrderByDescending(e => e.Salary).ToList();

            PrintOutput(highestEarningdepartment, rooster);
        }

        static void PrintOutput(string highestEarningdepartment, Dictionary<string, List<Employee>> rooster)
        {
            Console.WriteLine($"Highest Average Salary: {highestEarningdepartment}");

            foreach (var employee in rooster[highestEarningdepartment])
            {
                Console.WriteLine($"{employee.Name} {employee.Salary:F2}");
            }
        }

        static void AddEmployeeToRooster(string[] commandArgs, Dictionary<string, List<Employee>> rooster)
        {
            string name = commandArgs[0];
            decimal salary = decimal.Parse(commandArgs[1]);
            string department = commandArgs[2];

            Employee newEmployee = new Employee(name, salary, department);

            if (!rooster.ContainsKey(department))
            {
                rooster[department] = new List<Employee>();
            }
            rooster[department].Add(newEmployee);
        }
    }
}