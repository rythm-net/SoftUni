using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04._Raw_Data
{
    public class Cargo
    {
        public Cargo(int cargoWeight, string cargoType)
        {
            this.Weight = cargoWeight;
            this.Type = cargoType;
        }

        public int Weight { get; set; }
        public string Type { get; set; }
    }
}