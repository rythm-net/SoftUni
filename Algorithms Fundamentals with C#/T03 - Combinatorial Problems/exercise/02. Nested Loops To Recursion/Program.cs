using System;

namespace _02._Nested_Loops
{
    internal class Program
    {
        private static int[] elements;

        static void Main(string[] args)
        {
            var n = int.Parse(Console.ReadLine());

            elements = new int[n];

            GenVectors(0);
        }

        private static void GenVectors(int idx)
        {
            if (idx >= elements.Length)
            {
                Console.WriteLine(String.Join(" ", elements));
                return;
            }

            for (int i = 1; i <= elements.Length; i++)
            {
                elements[idx] = i;
                GenVectors(idx + 1);
            }
        }
    }
}