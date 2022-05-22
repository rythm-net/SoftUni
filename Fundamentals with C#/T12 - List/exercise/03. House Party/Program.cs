using System;
using System.Collections.Generic;

namespace _04._House_Party
{
    class Program
    {
        static void Main(string[] args)
        {
            int commandsNumber = int.Parse(Console.ReadLine());

            List<string> peopleNames = new List<string>();

            for (int i = 0; i < commandsNumber; i++)
            {
                string[] command = Console.ReadLine().Split(' ', StringSplitOptions.RemoveEmptyEntries);

                string name = command[0];

                if (command[2] == "going!")
                {
                    if (!(peopleNames.Contains(name)))
                    {
                        peopleNames.Add(name);
                    }
                    else
                    {
                        Console.WriteLine($"{name} is already in the list!");
                    }
                }
                else
                {
                    if (!(peopleNames.Contains(name)))
                    {
                        Console.WriteLine($"{name} is not in the list!");
                    }
                    else
                    {
                        peopleNames.Remove(name);
                    }
                }
            }
            Console.WriteLine(string.Join('\n', peopleNames));
        }
    }
}