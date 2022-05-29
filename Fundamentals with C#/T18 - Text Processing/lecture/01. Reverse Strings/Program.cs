using System;
using System.Linq;

namespace _01._Reverse_Strings
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string command = Console.ReadLine();

            while (command != "end")
            {
                string reversedWord = string.Empty;

                for (int i = command.Length - 1; i >= 0; i--)
                {
                    reversedWord += command[i];
                }
                Console.WriteLine($"{command} = {reversedWord}");
                command = Console.ReadLine();
            }
        }
    }
}