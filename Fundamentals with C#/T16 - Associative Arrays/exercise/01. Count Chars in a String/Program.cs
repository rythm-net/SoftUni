using System;
using System.Collections.Generic;

namespace _01._Count_Chars_in_a_String
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().Split();

            Dictionary<char, int> lettersOccurrences = new Dictionary<char, int>();

            foreach (var word in input)
            {
                for (int i = 0; i < word.Length; i++)
                {
                    if (!lettersOccurrences.ContainsKey(word[i]))
                    {
                        lettersOccurrences[word[i]] = 0;
                    }
                    lettersOccurrences[word[i]]++;
                }
            }
            foreach (var currLetter in lettersOccurrences)
            {
                Console.WriteLine($"{currLetter.Key} -> {currLetter.Value}");
            }
        }
    }
}