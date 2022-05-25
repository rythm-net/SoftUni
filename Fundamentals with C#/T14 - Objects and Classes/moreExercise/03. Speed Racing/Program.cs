using System;
using System.Collections.Generic;

namespace _03._Speed_Racing
{
    class Program
    {
        static void Main(string[] args)
        {
            List<Car> cars = new List<Car>();
            int n = int.Parse(Console.ReadLine());

            PopulateListCars(cars, n);

            ProcessCarsInfo(cars);

            foreach (var car in cars)
            {
                Console.WriteLine($"{car.Model} {car.FuelAmount:F2} {car.DistanceTraveled}");
            }
        }

        static void PopulateListCars(List<Car> cars, int n)
        {
            for (int i = 0; i < n; i++)
            {
                string[] carArgs = Console.ReadLine().Split(' ', StringSplitOptions.RemoveEmptyEntries);
                string model = carArgs[0];
                double fuelAmount = double.Parse(carArgs[1]);
                double fuelConsumption = double.Parse(carArgs[2]);

                var newCar = new Car(model, fuelAmount, fuelConsumption);
                cars.Add(newCar);
            }
        }

        static void ProcessCarsInfo(List<Car> cars)
        {
            string input;

            while ((input = Console.ReadLine()) != "End")
            {
                string[] comandArgs = input.Split(' ', StringSplitOptions.RemoveEmptyEntries);
                string selectModel = comandArgs[1];
                int distance = int.Parse(comandArgs[2]);

                var selectedCar = cars.Find(c => c.Model == selectModel);

                selectedCar.Drive(distance);
            }
        }
    }
}