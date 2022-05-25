using System;

namespace _01._Randomize_Words
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().Split(' ', StringSplitOptions.RemoveEmptyEntries);

            Random rnd = new Random();

            for (int i = 0; i < input.Length; i++)
            {
                int randomIndex = rnd.Next(0, input.Length);
                string currentWord = input[i];

                input[i] = input[randomIndex];
                input[randomIndex] = currentWord;
            }

            foreach (var word in input)
            {
                Console.WriteLine(word);
            }
        }
    }
}