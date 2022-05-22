using System;
using System.Collections.Generic;
using System.Linq;

namespace _01._Train
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> wagons = Console.ReadLine().Split
                (' ', StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToList();

            int wagonsCapasity = int.Parse(Console.ReadLine());

            string input = Console.ReadLine();

            while (input != "end")
            {
                string[] command = input.Split();

                if (command[0] == "Add")
                {
                    int passengers = int.Parse(command[1]);
                    wagons.Add(passengers);
                }
                else
                {
                    int passengers = int.Parse(command[0]);

                    for (int i = 0; i < wagons.Count; i++)
                    {
                        if (wagons[i] + passengers <= wagonsCapasity)
                        {
                            wagons[i] += passengers;
                            break;
                        }
                    }
                }
                input = Console.ReadLine();
            }
            Console.WriteLine(string.Join(' ', wagons));
        }
    }
}