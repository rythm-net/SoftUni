﻿using System;

namespace _01._USD_to_BGN
{
    internal class Program
    {
        static void Main()
        {
            double usd = double.Parse(Console.ReadLine());
            double bgn = usd * 1.79549;

            Console.WriteLine(bgn);
        }
    }
}