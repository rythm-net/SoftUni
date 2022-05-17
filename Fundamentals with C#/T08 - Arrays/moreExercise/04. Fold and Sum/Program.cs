using System;
using System.Linq;

namespace _04._Fold_and_Sum
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] arr = Console.ReadLine().Split(' ', StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToArray();

            int coreSize = arr.Length / 2;
            int foldingSidesLenght = coreSize / 2;

            int[] secondRowLeft = new int[foldingSidesLenght];
            int[] secondRowRight = new int[foldingSidesLenght];
            int[] core = new int[coreSize];

            int coreIndex = 0;

            for (int arrIndex = foldingSidesLenght; arrIndex < arr.Length - foldingSidesLenght; arrIndex++, coreIndex++)
            {
                core[coreIndex] = arr[arrIndex];
            }

            for (int i = 0; i < secondRowLeft.Length; i++)
            {
                secondRowLeft[i] = arr[i];
            }
            Array.Reverse(secondRowLeft);

            for (int i = 0; i < foldingSidesLenght; i++)
            {
                secondRowRight[i] = arr[arr.Length - (i + 1)];
            }

            int[] secondRow = secondRowLeft.Concat(secondRowRight).ToArray();
            int[] results = new int[coreSize];

            for (int i = 0; i < coreSize; i++)
            {
                results[i] = core[i] + secondRow[i];
            }

            Console.WriteLine(string.Join(" ", results));
        }
    }
}