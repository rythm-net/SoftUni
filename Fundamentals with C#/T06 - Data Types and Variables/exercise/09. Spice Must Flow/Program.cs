using System;

namespace _09._Spice_Must_Flow
{
    class Program
    {
        static void Main(string[] args)
        {
            const int CONSUMED_BY_WORKERS = 26;

            int spices      = int.Parse(Console.ReadLine());
            int days        = 0;
            int totalSpices = 0;

            while (spices >= 100)
            {
                totalSpices += spices - CONSUMED_BY_WORKERS;
                spices -= 10;
                days++;

                if (spices < 100)
                {
                    totalSpices -= CONSUMED_BY_WORKERS;
                }
            }
            Console.WriteLine(days);
            Console.WriteLine(totalSpices);
        }
    }
}