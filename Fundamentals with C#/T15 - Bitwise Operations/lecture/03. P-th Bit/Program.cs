using System;

namespace _03.Pth_Bit
{
    class Program
    {
        static void Main(string[] args)
        {
            int number = int.Parse(Console.ReadLine()); 
            // we take the number

            int postionToSearch = int.Parse(Console.ReadLine()); 
            // we take the position of the digit in binary we'd like to see

            int bitAtPosition = number >> postionToSearch & 1; 
            // we shift the number p number of times so we can put it at the end of the
            // binary representation and we compare it with 1(0001) it either returns 0(0000) or 1(0001)

            Console.WriteLine(bitAtPosition);
        }
    }
}