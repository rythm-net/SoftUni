using System;

namespace _02._Bit_At_Position_1
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int bitAtPos1 = (n >> 1) & 1;

            Console.WriteLine(bitAtPos1);
        }
    }
}