using System;
using System.Text;

namespace _04._Caesar_Cipher
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string text = Console.ReadLine();

            StringBuilder sb = new StringBuilder();

            foreach (char currLetter in text)
            {
                char letter = ((char)(currLetter + 3));
                sb.Append(letter);
            }
            Console.WriteLine(sb);
        }
    }
}