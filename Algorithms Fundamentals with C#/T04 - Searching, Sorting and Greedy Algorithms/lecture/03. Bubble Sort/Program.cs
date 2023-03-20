using System;
using System.Linq;

namespace _03._Bubble_Sort
{
    internal class Program
    {
        static void Main(string[] args)
        {
            var numbers = Console.ReadLine().Split().Select(int.Parse).ToArray();

            BubbleSort(numbers);

            Console.WriteLine(String.Join(" ", numbers));
        }

        private static void BubbleSort(int[] numbers)
        {
            var sortedCount = 0;
            var isSorted = false;

            while (!isSorted)
            {
                isSorted = true;

                for (int j = 1; j < numbers.Length - sortedCount; j++)
                {
                    var i = j - 1;

                    if (numbers[i] > numbers[j])
                    {
                        Swap(numbers, i, j);
                        isSorted = false;
                    }
                }
                sortedCount += 1;
            }
        }

        private static void Swap(int[] numbers, int first, int second)
        {
            var temp = numbers[first];
            numbers[first] = numbers[second];
            numbers[second] = temp;
        }
    }
}