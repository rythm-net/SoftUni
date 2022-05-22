using System;
using System.Collections.Generic;
using System.Linq;

namespace _04._List_Operations
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> numbers = Console.ReadLine().Split
                (' ', StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToList();

            string input = string.Empty;

            while ((input = Console.ReadLine()) != "End")
            {
                string[] command = input.Split();

                if (command[0] == "Add")
                {
                    int number = int.Parse(command[1]);
                    numbers.Add(number);
                }
                else if (command[0] == "Insert")
                {
                    int number = int.Parse(command[1]);
                    int index = int.Parse(command[2]);

                    if (index < 0 || index >= numbers.Count)
                    {
                        Console.WriteLine("Invalid index");
                        continue;
                    }

                    numbers.Insert(index, number);
                }
                else if (command[0] == "Remove")
                {
                    int index = int.Parse(command[1]);
                    if (index < 0 || index >= numbers.Count)
                    {
                        Console.WriteLine("Invalid index");
                        continue;
                    }

                    numbers.RemoveAt(index);
                }
                else if (command[0] == "Shift")
                {
                    int count = int.Parse(command[2]);

                    if (command[1] == "left")
                    {
                        for (int i = 0; i < count; i++)
                        {
                            int firstElement = numbers[0];

                            numbers.RemoveAt(0);
                            numbers.Add(firstElement);
                        }
                    }
                    else
                    {
                        for (int i = 0; i < count; i++)
                        {
                            int lastElement = numbers[numbers.Count - 1];

                            numbers.RemoveAt(numbers.Count - 1);
                            numbers.Insert(0, lastElement);
                        }
                    }
                }
            }
            Console.WriteLine(string.Join(' ', numbers));
        }
    }
}