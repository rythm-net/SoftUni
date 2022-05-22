using System;
using System.Collections.Generic;
using System.Linq;

namespace _03._Merging_Lists
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> firstList  = Console.ReadLine().Split
                (' ', StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToList();
            List<int> secondList = Console.ReadLine().Split
                (' ', StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToList();

            List<int> finalList = new List<int>(firstList.Count + secondList.Count);
            int finalListCount = firstList.Count;

            int limit = Math.Min(firstList.Count, secondList.Count);

            for (int i = 0; i < limit; i++)
            {
                finalList.Add(firstList[i]);
                finalList.Add(secondList[i]);
            }

            if (firstList.Count != secondList.Count)
            {
                if (firstList.Count > secondList.Count)
                {
                    finalList.AddRange(GetRemindValues(firstList, secondList));
                }
                else
                {
                    finalList.AddRange(GetRemindValues(secondList, firstList));
                }
            }
            Console.WriteLine(string.Join(' ', finalList));
        }

        static List<int> GetRemindValues(List<int> longestList, List<int> shortestList)
        {
            List<int> result = new List<int>();

            for (int i = shortestList.Count; i < longestList.Count; i++)
            {
                result.Add(longestList[i]);
            }

            return result;
        }
    }
}