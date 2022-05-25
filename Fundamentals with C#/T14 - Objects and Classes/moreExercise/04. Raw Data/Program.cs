using System;
using System.Collections.Generic;

namespace _04._Raw_Data
{
    class Program
    {
        static void Main(string[] args)
        {
            List<Car> couriers = new List<Car>();

            int n = int.Parse(Console.ReadLine());

            for (int i = 0; i < n; i++)
            {
                string[] carArgs = Console.ReadLine().Split(' ', StringSplitOptions.RemoveEmptyEntries);
                string model = carArgs[0];

                int engineSpeed = int.Parse(carArgs[1]);
                int enginePower = int.Parse(carArgs[2]);
                int cargoWeight = int.Parse(carArgs[3]);

                string cargoType = carArgs[4];

                Car newCar = new Car(model,
                    engineSpeed,
                    enginePower,
                    cargoWeight,
                    cargoType);

                couriers.Add(newCar);
            }

            string outputCommand = Console.ReadLine();

            if (outputCommand == "fragile")
            {
                couriers = couriers.FindAll(c => c.Cargo.Type == "fragile" && c.Cargo.Weight < 1000);

                foreach (var car in couriers)
                {
                    Console.WriteLine(car.Model);
                }
            }
            else if (outputCommand == "flamable")
            {
                couriers = couriers.FindAll(c => c.Cargo.Type == "flamable" && c.Engine.Power > 250);

                foreach (var car in couriers)
                {
                    Console.WriteLine(car.Model);
                }
            }
        }
    }
}