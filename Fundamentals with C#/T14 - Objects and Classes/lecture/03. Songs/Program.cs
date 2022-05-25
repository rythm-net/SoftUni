using System;
using System.Collections.Generic;

namespace _03._Songs
{
    class Song
    {
        public Song(string typeList, string name, string time)
        {
            this.TypeList = typeList;
            this.Name = name;
            this.Time = time;
        }

        public string TypeList { get; set; }
        public string Name { get; set; }
        public string Time { get; set; }
    }

    class Program
    {
        static void Main(string[] args)
        {
            int numberOfSongs = int.Parse(Console.ReadLine());

            List<Song> songs = new List<Song>();

            for (int i = 0; i < numberOfSongs; i++)
            {
                string[] tokens = Console.ReadLine()
                    .Split('_', StringSplitOptions.RemoveEmptyEntries);

                string typeList = tokens[0];
                string name = tokens[1];
                string time = tokens[2];

                Song newSong = new Song(typeList, name, time);
                songs.Add(newSong);
            }

            string typeListOrAll = Console.ReadLine();

            if (typeListOrAll.ToLower() == "all")
            {
                foreach (Song song in songs)
                {
                    Console.WriteLine(song.Name);
                }
            }
            else
            {
                songs.RemoveAll(song => song.TypeList != typeListOrAll);

                foreach (Song song in songs)
                {
                    Console.WriteLine(song.Name);
                }
            }
        }
    }
}