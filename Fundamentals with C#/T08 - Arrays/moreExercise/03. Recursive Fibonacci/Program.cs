using System;

namespace _03._Recursive_Fibonacci
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int fib = int.Parse(Console.ReadLine());
            Console.WriteLine(CalculateFibbonacci(fib));
        }

        private static int CalculateFibbonacci(int fib)
        {
            if (fib == 0)
            {
                return 0;
            }

            if (fib == 1 || fib == 2)
            {
                return 1;
            }

            int first = CalculateFibbonacci(fib - 1);
            int second = CalculateFibbonacci(fib - 2);

            return first + second;
        }
    }
}