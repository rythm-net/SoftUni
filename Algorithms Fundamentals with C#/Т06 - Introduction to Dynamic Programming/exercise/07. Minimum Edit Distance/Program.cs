using System;

namespace _07._Minimum_Edit_Distance
{
    internal class Program
    {
        static void Main(string[] args)
        {
            var replaceCost = int.Parse(Console.ReadLine());
            var insertCost = int.Parse(Console.ReadLine());
            var deleteCost = int.Parse(Console.ReadLine());
            var str1 = Console.ReadLine();
            var str2 = Console.ReadLine();
            var dp = new int[str1.Length + 1, str2.Length + 1];

            for (int col = 1; col < dp.GetLength(1); col++)
            {
                dp[0, col] = dp[0, col - 1] + insertCost;
            }

            for (int row = 1; row < dp.GetLength(0); row++)
            {
                dp[row, 0] = dp[row - 1, 0] + deleteCost;
            }

            for (int row = 1; row < dp.GetLength(0); row++)
            {
                for (int col = 1; col < dp.GetLength(1); col++)
                {
                    if (str1[row - 1] == str2[col - 1])
                    {
                        dp[row, col] = dp[row - 1, col - 1]; // diagonal
                    }
                    else
                    {
                        var replace = dp[row - 1, col - 1] + replaceCost; // upper left diagonal + replace cost
                        var delete = dp[row - 1, col] + deleteCost;
                        var insert = dp[row, col - 1] + insertCost;

                        dp[row, col] = Math.Min(Math.Min(replace, delete), insert);
                    }
                }
            }
            Console.WriteLine($"Minimum edit distance: {dp[str1.Length, str2.Length]}");
        }
    }
}