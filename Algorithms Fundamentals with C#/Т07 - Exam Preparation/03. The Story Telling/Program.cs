using System;
using System.Collections.Generic;
using System.Linq;

namespace _03._The_Story_Telling
{
    internal class Program
    {
        private static Dictionary<string, List<string>> graphStories;
        private static HashSet<string> passedNodes;

        static void Main(string[] args)
        {
            ReadInputAndFillTheGraph();
            passedNodes = new HashSet<string>();

            foreach (var parenhtNode in graphStories.Keys)
            {
                DFSGraph(parenhtNode);
            }
            Console.WriteLine(string.Join(" ", passedNodes.Reverse()));
        }

        private static void ReadInputAndFillTheGraph()
        {
            graphStories = new Dictionary<string, List<string>>();
            string command;

            while ((command = Console.ReadLine()) != "End")
            {
                string[] cmdArgs = command.Split("->", StringSplitOptions.RemoveEmptyEntries);
                string preStory = cmdArgs[0].Trim();

                if (!graphStories.ContainsKey(preStory))
                {
                    graphStories[preStory] = new List<string>();
                }

                if (cmdArgs.Length < 2)
                {
                    continue;
                }
                string[] postStories = cmdArgs[1].Split(" ", StringSplitOptions.RemoveEmptyEntries);
                graphStories[preStory].AddRange(postStories);
            }
        }

        private static void DFSGraph(string parentNode)
        {
            if (passedNodes.Contains(parentNode))
            {
                return;
            }

            foreach (string childNode in graphStories[parentNode])
            {
                DFSGraph(childNode);
            }
            passedNodes.Add(parentNode);
        }
    }
}