using System;
using System.Collections.Generic;
using System.Linq;

namespace _06._List_Manipulation_Basics
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> numbers = Console.ReadLine().Split
                (' ', StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToList();

            string input = string.Empty;

            while ((input = Console.ReadLine()) != "end")
            {
                string[] command = input.Split(' ', StringSplitOptions.RemoveEmptyEntries);

                if (command[0] == "Add")
                {
                    int number = int.Parse(command[1]);

                    numbers.Add(number);
                }
                else if (command[0] == "Remove")
                {
                    int number = int.Parse(command[1]);

                    numbers.Remove(number);
                }
                else if (command[0] == "RemoveAt")
                {
                    int index = int.Parse(command[1]);
                    numbers.RemoveAt(index);
                }
                else if (command[0] == "Insert")
                {
                    int index = int.Parse(command[2]);
                    int number = int.Parse(command[1]);
                    numbers.Insert(index, number);
                }
            }
            Console.WriteLine(string.Join(' ', numbers));
        }
    }
}