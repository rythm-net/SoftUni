using System;

namespace _04._Bit_Destroyer
{
    class Program
    {
        static void Main(string[] args)
        {
            int num = int.Parse(Console.ReadLine());
            int position = int.Parse(Console.ReadLine());
            int mask = ~(1 << position);
            int newNum = num & mask | (0 << position);

            Console.WriteLine(newNum);
        }
    }
}