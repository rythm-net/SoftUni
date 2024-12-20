﻿using System;
using System.Collections.Generic;
using System.Linq;

namespace _10._SoftUni_Course_Planning
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<string> lessons = Console.ReadLine().Split(", ", StringSplitOptions.RemoveEmptyEntries).ToList();

            string command = Console.ReadLine();

            while (command != "course start")
            {
                string[] givenComamnd = command.Split(':');
                string currCommand = givenComamnd[0];
                string lessonsTitle = givenComamnd[1];

                if (currCommand == "Add")
                {
                    if (!lessons.Contains(lessonsTitle))
                    {
                        lessons.Add(lessonsTitle);
                    }
                }
                else if (currCommand == "Insert")
                {
                    int index = int.Parse(givenComamnd[2]);

                    if (!lessons.Contains(lessonsTitle))
                    {
                        if (index >= 0 && index < lessons.Count)
                        {
                            lessons.Insert(index, lessonsTitle);
                        }
                    }
                }
                else if (currCommand == "Remove")
                {
                    lessons.Remove(lessonsTitle);
                    lessons.Remove($"{lessonsTitle}-Exercise");
                }
                else if (currCommand == "Swap")
                {
                    string secondTitle = givenComamnd[2];

                    if (lessons.Contains(lessonsTitle) && lessons.Contains(secondTitle))
                    {
                        int indexOfLesson1 = lessons.IndexOf(lessonsTitle);
                        int indexOfLesson2 = lessons.IndexOf(secondTitle);

                        lessons[indexOfLesson1] = secondTitle;
                        lessons[indexOfLesson2] = lessonsTitle;

                        if (indexOfLesson1 + 1 < lessons.Count && lessons.Contains($"{lessonsTitle}-Exercise"))
                        {
                            lessons.Remove($"{lessonsTitle}-Exercise");
                            lessons.Insert(indexOfLesson2 + 1, $"{lessonsTitle}-Exercise");
                        }
                        if (indexOfLesson2 + 1 < lessons.Count && lessons.Contains($"{secondTitle}-Exercise"))
                        {
                            lessons.Remove($"{secondTitle}-Exercise");
                            lessons.Insert(indexOfLesson1 + 1, $"{secondTitle}-Exercise");
                        }
                    }
                }
                else if (currCommand == "Exercise")
                {
                    if (lessons.Contains(lessonsTitle) && !lessons.Contains($"{lessonsTitle}-Exercise"))
                    {
                        int indexOfLesson1 = lessons.IndexOf(lessonsTitle);
                        lessons.Insert(indexOfLesson1 + 1, $"{lessonsTitle}-Exercise");
                    }
                    else if (!lessons.Contains(lessonsTitle))
                    {
                        lessons.Add(lessonsTitle);
                        lessons.Add($"{lessonsTitle}-Exercise");
                    }
                }
                command = Console.ReadLine();
            }
            for (int i = 0; i < lessons.Count; i++)
            {
                Console.WriteLine($"{i + 1}.{lessons[i]}");
            }
        }
    }
}