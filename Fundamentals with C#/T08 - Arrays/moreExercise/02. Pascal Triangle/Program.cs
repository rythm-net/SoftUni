using System;
using System.Collections.Generic;
using System.Linq;

namespace _02._Pascal_Triangle
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int numberOfLine = int.Parse(Console.ReadLine());

            int[] currLineToCalculate = new int[numberOfLine];
            List<int> nextLine = new List<int>(numberOfLine);

            currLineToCalculate[0] = 1;
            nextLine.Add(currLineToCalculate[0]);
            nextLine = currLineToCalculate.ToList();

            for (int row = 0; row < numberOfLine; row++)
            {
                Console.Write(currLineToCalculate[0] + " ");

                for (int col = 0; col < row; col++)
                {
                    int currNumberToPrint = currLineToCalculate[col] + currLineToCalculate[col + 1];
                    Console.Write(currNumberToPrint + " ");
                    nextLine[col + 1] = currNumberToPrint;
                }

                currLineToCalculate = nextLine.ToArray();
                Console.WriteLine();
            }
        }
    }
}