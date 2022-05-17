using System;
using System.Linq;

namespace _03._ZigZag_Arrays
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[] array1 = new int[n];
            int[] array2 = new int[n];

            for (int i = 0; i < n; i++)
            {
                int[] currentLine = Console.ReadLine().Split(' ', StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToArray();

                if (i % 2 == 0)
                {
                    array2[i] = currentLine[0];
                    array1[i] = currentLine[1];
                }
                else
                {
                    array2[i] = currentLine[1];
                    array1[i] = currentLine[0];
                }
            }

            Console.WriteLine(string.Join(' ', array2));
            Console.WriteLine(string.Join(' ', array1));
        }
    }
}