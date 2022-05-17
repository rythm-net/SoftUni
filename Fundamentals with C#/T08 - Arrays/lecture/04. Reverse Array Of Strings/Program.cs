using System;
using System.Linq;

namespace _04._Reverse_Array_Of_Strings
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().Split(' ', StringSplitOptions.RemoveEmptyEntries);

            Console.WriteLine(string.Join(' ', input.Reverse()));
        }
    }
}