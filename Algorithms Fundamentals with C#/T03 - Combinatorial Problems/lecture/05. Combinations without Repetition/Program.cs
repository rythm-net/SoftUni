using System;

namespace _05._Combinations_without_Repetition
{
    internal class Program
    {
        private static int k;
        private static string[] elements;
        private static string[] combinations;

        static void Main(string[] args)
        {
            elements = Console.ReadLine().Split();
            k = int.Parse(Console.ReadLine());
            combinations = new string[k];

            Combinations(0, 0);
        }

        private static void Combinations(int idx, int elementsStartIndex)
        {
            if (idx >= combinations.Length)
            {
                Console.WriteLine(String.Join(" ", combinations));
                return;
            }

            for (int i = elementsStartIndex; i < elements.Length; i++)
            {
                combinations[idx] = elements[i];
                Combinations(idx + 1, i + 1);
            }
        }
    }
}