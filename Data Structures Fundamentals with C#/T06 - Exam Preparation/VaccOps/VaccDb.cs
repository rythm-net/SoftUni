namespace VaccOps
{
    using Models;
    using Interfaces;
    using System;
    using System.Collections.Generic;

    public class VaccDb : IVaccOps
    {
        public void AddDoctor(Doctor doctor)
        {
            throw new NotImplementedException();
        }

        public void AddPatient(Doctor doctor, Patient patient)
        {
            throw new NotImplementedException();
        }

        public void ChangeDoctor(Doctor oldDoctor, Doctor newDoctor, Patient patient)
        {
            throw new NotImplementedException();
        }

        public bool Exist(Doctor doctor)
        {
            throw new NotImplementedException();
        }

        public bool Exist(Patient patient)
        {
            throw new NotImplementedException();
        }

        public IEnumerable<Doctor> GetDoctors()
        {
            throw new NotImplementedException();
        }

        public IEnumerable<Doctor> GetDoctorsByPopularity(int populariry)
        {
            throw new NotImplementedException();
        }

        public IEnumerable<Doctor> GetDoctorsSortedByPatientsCountDescAndNameAsc()
        {
            throw new NotImplementedException();
        }

        public IEnumerable<Patient> GetPatients()
        {
            throw new NotImplementedException();
        }

        public IEnumerable<Patient> GetPatientsByTown(string town)
        {
            throw new NotImplementedException();
        }

        public IEnumerable<Patient> GetPatientsInAgeRange(int lo, int hi)
        {
            throw new NotImplementedException();
        }

        public IEnumerable<Patient> GetPatientsSortedByDoctorsPopularityAscThenByHeightDescThenByAge()
        {
            throw new NotImplementedException();
        }

        public Doctor RemoveDoctor(string name)
        {
            throw new NotImplementedException();
        }
    }
}
