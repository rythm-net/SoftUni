using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace _05._Longest_Increasing_Subsequence
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] arrOfNumbers = Console.ReadLine().Split(' ', StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToArray();

            List<int> list = new List<int>();

            int startIndex = 0;
            int endIndex = 0;
            int longestSubsequence = -1;
            StringBuilder finalListResult = new StringBuilder();

            if (arrOfNumbers.Length == 1)
            {
                Console.WriteLine(arrOfNumbers[0]);
                return;
            }

            for (int i = 0; i < arrOfNumbers.Length; i++)
            {

                startIndex = i;
                list = new List<int>();
                list.Add(arrOfNumbers[i]);

                for (int j = i + 1; j < arrOfNumbers.Length; j++)
                {
                    if (arrOfNumbers[i] < arrOfNumbers[j] && arrOfNumbers[j] > list[list.Count - 1])
                    {
                        endIndex = j;
                        list.Add(arrOfNumbers[j]);
                    }
                    else
                    {
                        if (list.Contains(arrOfNumbers[j]) || list[0] >= arrOfNumbers[j])
                        {
                            continue;
                        }

                        for (int k = list.Count - 1; k >= 0; k--)
                        {
                            if (list[k] > arrOfNumbers[j] && list.Count <= 1)
                            {
                                list.Remove(list[k]);
                            }

                            else if (list[k] > arrOfNumbers[j] && arrOfNumbers[j] > list[0])
                            {
                                list.Remove(list[k]);
                            }
                        }

                        if (list.Count < 1)
                        {
                            list.Add(arrOfNumbers[j]);
                            continue;
                        }

                        else if (list[list.Count - 1] >= arrOfNumbers[j] && arrOfNumbers[j] <= list.Count - 2)
                        {
                            continue;
                        }

                        list.Add(arrOfNumbers[j]);
                    }

                    if (list.Count > longestSubsequence)
                    {
                        finalListResult = new StringBuilder();
                        longestSubsequence = list.Count;

                        foreach (var item in list)
                        {
                            finalListResult.Append(item + " ");
                        }
                    }
                }
            }
            Console.WriteLine(finalListResult);
        }
    }
}