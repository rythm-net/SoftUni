using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace _03._Post_Office
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().Split('|', StringSplitOptions.RemoveEmptyEntries);
            string capitalPattern = @"([#|\$|%|\*|&])(?<letters>[A-Z]+)\1";

            char[] letters = Regex.Match(input[0], capitalPattern).Groups["letters"].Value.ToArray();

            string wordLenghtPattern = @"((?<code>\d{2}):(?<lenght>\d{2}))";

            MatchCollection codes = Regex.Matches(input[1], wordLenghtPattern);
            Dictionary<char, int> wordsLenght = new Dictionary<char, int>();

            foreach (char letter in letters)
            {
                foreach (Match item in codes)
                {
                    int currCode = int.Parse(item.Groups["code"].Value);

                    if (letter == currCode)
                    {
                        int lenght = int.Parse(item.Groups["lenght"].Value);

                        if (!wordsLenght.ContainsKey(letter))
                        {
                            wordsLenght.Add(letter, lenght);
                            break;
                        }

                    }
                }
            }

            foreach (var item in wordsLenght)
            {
                string wordPattern = $@"(?<=\s|^){item.Key}[^\s]{{{item.Value}}}(?=\s|$)";
                string result = Regex.Match(input[2], wordPattern).Value;

                Console.WriteLine(result);
            }
        }
    }
}