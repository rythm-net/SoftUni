using System;
using System.Collections.Generic;
using System.Linq;

namespace _02._Change_List
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> numbers = Console.ReadLine().Split
                (' ', StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToList();

            string input = Console.ReadLine();

            while (input != "end")
            {
                string[] command = input.Split();

                if (command[0] == "Delete")
                {
                    int number = int.Parse(command[1]);
                    numbers.RemoveAll(n => n == number);
                }
                else if (command[0] == "Insert")
                {
                    int number = int.Parse(command[1]);
                    int index = int.Parse(command[2]);
                    numbers.Insert(index, number);
                }
                input = Console.ReadLine();
            }
            Console.WriteLine(string.Join(' ', numbers));
        }
    }
}