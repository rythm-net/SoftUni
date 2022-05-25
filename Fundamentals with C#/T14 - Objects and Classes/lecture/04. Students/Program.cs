using System;
using System.Collections.Generic;

namespace _04._Students
{
    class Student
    {
        public Student(string firstName, string lastName, int age, string homeTown)
        {
            this.FirstName = firstName;
            this.LastName = lastName;
            this.Age = age;
            this.HomeTown = homeTown;
        }

        public string FirstName { get; set; }
        public string LastName { get; set; }
        public int Age { get; set; }
        public string HomeTown { get; set; }
    }

    class Program
    {
        static void Main(string[] args)
        {
            List<Student> students = new List<Student>();

            string rawInput;

            while ((rawInput = Console.ReadLine()) != "end")
            {
                string[] tokens = rawInput.Split(' ', StringSplitOptions.RemoveEmptyEntries);
                string firstName = tokens[0];
                string lastName = tokens[1];

                int age = int.Parse(tokens[2]);

                string homeTown = tokens[3];

                Student newStudent = new Student(firstName, lastName, age, homeTown);
                students.Add(newStudent);
            }
            string townToSearch = Console.ReadLine();

            List<Student> filteredStudentsList = students.FindAll(student => student.HomeTown == townToSearch);

            foreach (Student student in filteredStudentsList)
            {
                Console.WriteLine($"{student.FirstName} {student.LastName} is {student.Age} years old.");
            }
        }
    }
}