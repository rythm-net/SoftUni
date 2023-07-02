using System;
using System.Collections.Generic;
using System.Linq;

namespace _02._Time
{
    internal class Program
    {
        private static int[][] tableLcs;
        static void Main(string[] args)
        {
            int[] firstSequence = Console.ReadLine().Split().Select(int.Parse).ToArray();
            int[] secondSequence = Console.ReadLine().Split().Select(int.Parse).ToArray();

            InitializeTable(firstSequence, secondSequence);
            Stack<int> longestCommonSubsequence = new Stack<int>();

            int row = firstSequence.Length;
            int col = secondSequence.Length;

            while (row > 0 && col > 0)
            {
                if (firstSequence[row - 1] == secondSequence[col - 1])
                {
                    longestCommonSubsequence.Push(firstSequence[row - 1]);
                    row--;
                    col--;
                }
                else if (tableLcs[row][col - 1] >= tableLcs[row - 1][col])
                {
                    col--;
                }
                else
                {
                    row--;
                }
            }
            int lcsLength = tableLcs[^1][^1];
            Console.WriteLine(String.Join(" ", longestCommonSubsequence));
            Console.WriteLine(lcsLength);
        }

        private static void InitializeTable(int[] firstSequence, int[] secondSequence)
        {
            tableLcs = new int[firstSequence.Length + 1][];

            for (int row = 0; row < tableLcs.Length; row++)
            {
                tableLcs[row] = new int[secondSequence.Length + 1];
            }

            for (int row = 1; row < tableLcs.Length; row++)
            {
                for (int col = 1; col < tableLcs[row].Length; col++)
                {
                    if (firstSequence[row - 1] == secondSequence[col - 1])
                    {
                        tableLcs[row][col] = tableLcs[row - 1][col - 1] + 1;
                    }
                    else
                    {
                        tableLcs[row][col] = Math.Max(tableLcs[row][col - 1], tableLcs[row - 1][col]);
                    }
                }
            }
        }
    }
}