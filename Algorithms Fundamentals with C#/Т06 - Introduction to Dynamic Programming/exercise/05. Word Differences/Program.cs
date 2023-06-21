using System;

namespace _05._Word_Differences
{
    internal class Program
    {
        static void Main(string[] args)
        {
            var str1 = Console.ReadLine();
            var str2 = Console.ReadLine();
            var dp = new int[str1.Length + 1, str2.Length + 1];

            for (int row = 1; row < dp.GetLength(0); row++)
            {
                dp[row, 0] = row;
            }

            for (int col = 1; col < dp.GetLength(1); col++)
            {
                dp[0, col] = col;
            }

            for (int row = 1; row < dp.GetLength(0); row++)
            {
                for (int col = 1; col < dp.GetLength(1); col++)
                {
                    if (str1[row - 1] == str2[col - 1])
                    {
                        dp[row, col] = dp[row - 1, col - 1];
                    }
                    else
                    {
                        dp[row, col] = Math.Min(dp[row - 1, col], dp[row, col - 1]) + 1;
                    }
                }
            }
            Console.WriteLine($"Deletions and Insertions: {dp[str1.Length, str2.Length]}");
        }
    }
}