using System;
using System.Collections.Generic;
using System.Linq;

namespace _05._Find_All_Paths_in_a_Labyrinth
{
    internal class Program
    {
        static void Main(string[] args)
        {
            var rows = int.Parse(Console.ReadLine());
            var cols = int.Parse(Console.ReadLine());
            var lab = new char[rows, cols];

            for (int r = 0; r < rows; r++)
            {
                var colElements = Console.ReadLine();

                for (int c = 0; c < colElements.Length; c++)
                {
                    lab[r, c] = colElements[c];
                }
            }
            FindPaths(lab, 0, 0, new List<string>(), string.Empty);
        }

        private static void FindPaths(char[,] lab, int row, int col, List<string> directions, string direction)
        {

            if (row < 0 || row >= lab.GetLength(0) || col < 0 || col >= lab.GetLength(1))
            {
                return;
            }

            if (lab[row, col] == '*' || lab[row, col] == 'v')
            {
                return;
            }

            directions.Add(direction);

            if (lab[row, col] == 'e')
            {
                Console.WriteLine(String.Join(string.Empty, directions));
                directions.RemoveAt(directions.Count - 1);
                return;
            }

            lab[row, col] = 'v';

            FindPaths(lab, row - 1, col, directions, "U"); //Up
            FindPaths(lab, row + 1, col, directions, "D"); //Down
            FindPaths(lab, row, col + 1, directions, "R"); //Right
            FindPaths(lab, row, col - 1, directions, "L"); //Left

            lab[row, col] = '-';
            directions.RemoveAt(directions.Count - 1);
        }
    }
}