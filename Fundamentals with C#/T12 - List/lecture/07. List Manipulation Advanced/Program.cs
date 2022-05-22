using System;
using System.Collections.Generic;
using System.Linq;

namespace _07._List_Manipulation_Advanced
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> numbers = Console.ReadLine().Split
                (' ', StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToList();

            string elements = string.Empty;
            bool isGetChanges = false;

            while ((elements = Console.ReadLine()) != "end")
            {
                string[] command = elements.Split(' ', StringSplitOptions.RemoveEmptyEntries);

                if (command[0] == "Contains")
                {
                    int number = int.Parse(command[1]);

                    if (Contains(numbers, number))
                    {
                        Console.WriteLine("Yes");
                    }
                    else
                    {
                        Console.WriteLine("No such number");
                    }
                }
                else if (command[0] == "PrintEven")
                {
                    List<int> result = GetEvenNumbers(numbers);
                    Console.WriteLine(string.Join(' ', result));
                }
                else if (command[0] == "PrintOdd")
                {
                    List<int> result = GetOddNumbers(numbers);
                    Console.WriteLine(string.Join(' ', result));
                }
                else if (command[0] == "GetSum")
                {
                    int result = GetSum(numbers);

                    Console.WriteLine(result);
                }
                else if (command[0] == "Filter")
                {
                    string condition = command[1];
                    int number = int.Parse(command[2]);

                    List<int> result = GetFilteredList(numbers, condition, number);

                    Console.WriteLine(string.Join(' ', result));
                }
                else if (command[0] == "Add")
                {
                    int number = int.Parse(command[1]);

                    numbers.Add(number);
                    isGetChanges = true;
                }
                else if (command[0] == "Remove")
                {
                    int number = int.Parse(command[1]);

                    numbers.Remove(number);
                    isGetChanges = true;
                }
                else if (command[0] == "RemoveAt")
                {
                    int index = int.Parse(command[1]);
                    numbers.RemoveAt(index);
                    isGetChanges = true;
                }
                else if (command[0] == "Insert")
                {
                    int index = int.Parse(command[2]);
                    int number = int.Parse(command[1]);
                    numbers.Insert(index, number);
                    isGetChanges = true;
                }

                if (isGetChanges)
                {
                    Console.WriteLine(string.Join(' ', numbers));
                }
            }
        }

        static bool Contains(List<int> numbers, int number)
        {
            return numbers.Contains(number);
        }

        static List<int> GetEvenNumbers(List<int> numbers)
        {
            List<int> evenNumbers = new List<int>();

            for (int i = 0; i < numbers.Count; i++)
            {
                if (numbers[i] % 2 == 0)
                {
                    evenNumbers.Add(numbers[i]);
                }
            }
            return evenNumbers;
        }

        static List<int> GetOddNumbers(List<int> numbers)
        {
            List<int> oddNumbers = new List<int>();

            for (int i = 0; i < numbers.Count; i++)
            {
                if (numbers[i] % 2 != 0)
                {
                    oddNumbers.Add(numbers[i]);
                }
            }
            return oddNumbers;
        }

        static int GetSum(List<int> numbers)
        {
            int sum = 0;

            for (int i = 0; i < numbers.Count; i++)
            {
                sum += numbers[i];
            }
            return sum;
        }

        static List<int> GetFilteredList(List<int> numbers, string condition, int number)
        {
            List<int> result = new List<int>();

            if (condition == "<")
            {
                result = numbers.FindAll(n => n < number);
            }
            else if (condition == ">")
            {
                result = numbers.FindAll(n => n > number);
            }
            else if (condition == "<=")
            {
                result = numbers.FindAll(n => n <= number);
            }
            else if (condition == ">=")
            {
                result = numbers.FindAll(n => n >= number);
            }
            return result;
        }
    }
}