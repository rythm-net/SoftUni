using System;
using System.Collections.Generic;

namespace _01._Fibonacci
{
    internal class Program
    {
        private static Dictionary<int, long> cache = new Dictionary<int, long>();

        static void Main(string[] args)
        {
            var n = int.Parse(Console.ReadLine());

            Console.WriteLine(CalcFib(n));
        }

        private static long CalcFib(int n)
        {
            if (cache.ContainsKey(n))
            {
                return cache[n];
            }

            if (n < 2)
            {
                return n;
            }

            var result = CalcFib(n - 1) + CalcFib(n - 2);
            cache[n] = result;

            return result;
        }
    }
}