using System;
using System.Collections.Generic;
using System.Linq;

namespace _02._A_Miner_Task
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Dictionary<string, long> resources = new Dictionary<string, long>();

            string command = Console.ReadLine();

            while (command != "stop")
            {
                long count = long.Parse(Console.ReadLine());
                if (!resources.ContainsKey(command))
                {
                    resources[command] = 0;
                }
                resources[command] += count;
                command = Console.ReadLine();
            }
            foreach (var currItem in resources)
            {
                Console.WriteLine($"{currItem.Key} -> {currItem.Value}");
            }
        }
    }
}