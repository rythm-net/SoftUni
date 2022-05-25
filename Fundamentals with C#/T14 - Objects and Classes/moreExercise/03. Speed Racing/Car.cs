using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _03._Speed_Racing
{
    public class Car
    {
        public Car(string model, double fuelAmount, double fuelConsumptionPerKm)
        {
            this.Model = model;
            this.FuelAmount = fuelAmount;
            this.FuelConsumptionPerKM = fuelConsumptionPerKm;
            this.DistanceTraveled = 0;
        }

        public string Model { get; set; }
        public double FuelAmount { get; set; }
        public double FuelConsumptionPerKM { get; set; }
        public int DistanceTraveled { get; set; }

        public void Drive(int distance)
        {
            double consumedFuel = distance * this.FuelConsumptionPerKM;

            if (consumedFuel <= this.FuelAmount)
            {
                this.FuelAmount -= consumedFuel;
                this.DistanceTraveled += distance;
            }
            else
            {
                Console.WriteLine("Insufficient fuel for the drive");
            }
        }
    }
}
