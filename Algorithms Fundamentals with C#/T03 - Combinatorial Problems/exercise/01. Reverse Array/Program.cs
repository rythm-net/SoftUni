using System;

namespace _01._Reverse_Array
{
    internal class Program
    {
        static void Main(string[] args)
        {
            var elements = Console.ReadLine().Split();

            Reverse(elements, 0);

            Console.WriteLine(String.Join(" ", elements));
        }

        private static void Reverse(string[] elements, int idx)
        {
            if (idx == elements.Length / 2)
            {
                return;
            }

            var temp = elements[idx];
            elements[idx] = elements[elements.Length - idx - 1];
            elements[elements.Length - idx - 1] = temp;

            Reverse(elements, idx + 1);
        }
    }
}