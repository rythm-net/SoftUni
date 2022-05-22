using System;
using System.Collections.Generic;
using System.Linq;

namespace _05._Bomb_Numbers
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> numbers  = Console.ReadLine().Split
                (' ', StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToList();
            List<int> elements = Console.ReadLine().Split
                (' ', StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToList();

            int bombNumber = elements[0];
            int power = elements[1];

            for (int i = 0; i < numbers.Count; i++)
            {
                //1 2 2 4 2 2 2 9
                if (numbers[i] == bombNumber)
                {
                    int start = i - power;

                    if (start < 0)
                    {
                        start = 0;
                    }

                    int finish = i + power + 1;

                    if (finish > numbers.Count)
                    {
                        finish = numbers.Count;
                    }

                    for (int j = start; j < finish; j++)
                    {
                        numbers.RemoveAt(start);
                    }
                    i--;
                }
            }
            Console.WriteLine(numbers.Sum());
        }
    }
}