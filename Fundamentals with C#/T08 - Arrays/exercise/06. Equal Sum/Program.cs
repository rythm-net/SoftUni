using System;
using System.Linq;

namespace _06._Equal_Sum
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] numbers = Console.ReadLine().Split(' ', StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToArray();

            for (int i = 0; i < numbers.Length; i++)
            {
                int leftSSum = 0;
                int rightSum = 0;

                for (int j = 0; j < i; j++)
                {
                    leftSSum += numbers[j];
                }

                for (int k = i + 1; k < numbers.Length; k++)
                {
                    rightSum += numbers[k];
                }

                if (leftSSum == rightSum)
                {
                    Console.WriteLine(i);
                    return;
                }
            }

            Console.WriteLine("no");
        }
    }
}