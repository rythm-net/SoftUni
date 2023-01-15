namespace CouponOps.Models
{
    public class Website
    {
        public Website(string domain, int usersCount)
        {
            this.Domain = domain;
            this.UsersCount = usersCount;
        }

        public string Domain { get; set; }
        public int UsersCount { get; set; }
    }
}
