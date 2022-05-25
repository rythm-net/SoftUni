using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02._Oldest_Family_Member
{
    public class Family
    {
        public Family()
        {
            this.People = new List<Person>();
        }

        public List<Person> People { get; set; }

        public void AddPerson(Person newPerson)
        {
            People.Add(newPerson);
        }

        public Person GetOldestMember()
        {
            int oldestAge = People.Max(p => p.Age);
            Person oldestPerson = People.Find(p => p.Age == oldestAge);

            return oldestPerson;
        }
    }
}
