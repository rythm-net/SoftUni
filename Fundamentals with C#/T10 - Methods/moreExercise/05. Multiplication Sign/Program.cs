using System;
using System.Linq;

namespace _05._Multiplication_Sign
{
    class Program
    {
        static void Main(string[] args)
        {
            int num1 = int.Parse(Console.ReadLine());
            int num2 = int.Parse(Console.ReadLine());
            int num3 = int.Parse(Console.ReadLine());

            MultiplicationSign(num1, num2, num3);
        }

        static void MultiplicationSign(int num1, int num2, int num3)
        {
            bool hasNegative = num1 < 0 || num2 < 0 || num3 < 0;
            int[] numbers = new int[] { num1, num2, num3 };

            if (num1 == 0 || num2 == 0 || num3 == 0)
            {
                Console.WriteLine("zero");
            }
            else if (hasNegative == true)
            {
                int negativeCount = numbers.Count(n => n < 0);

                if (negativeCount == 1 || negativeCount == 3)
                {
                    Console.WriteLine("negative");
                }
                else
                {
                    Console.WriteLine("positive");
                }
            }
            else
            {
                Console.WriteLine("positive");
            }
        }
    }
}