namespace CouponOps
{
    using System;
    using System.Collections.Generic;
    using CouponOps.Models;
    using Interfaces;

    public class CouponOperations : ICouponOperations
    {
        public void AddCoupon(Website website, Coupon coupon)
        {
            throw new NotImplementedException();
        }

        public bool Exist(Website website)
        {
            throw new NotImplementedException();
        }

        public bool Exist(Coupon coupon)
        {
            throw new NotImplementedException();
        }

        public IEnumerable<Coupon> GetCouponsForWebsite(Website website)
        {
            throw new NotImplementedException();
        }

        public IEnumerable<Coupon> GetCouponsOrderedByValidityDescAndDiscountPercentageDesc()
        {
            throw new NotImplementedException();
        }

        public IEnumerable<Website> GetSites()
        {
            throw new NotImplementedException();
        }

        public IEnumerable<Website> GetWebsitesOrderedByUserCountAndCouponsCountDesc()
        {
            throw new NotImplementedException();
        }

        public void RegisterSite(Website website)
        {
            throw new NotImplementedException();
        }

        public Coupon RemoveCoupon(string code)
        {
            throw new NotImplementedException();
        }

        public Website RemoveWebsite(string domain)
        {
            throw new NotImplementedException();
        }

        public void UseCoupon(Website website, Coupon coupon)
        {
            throw new NotImplementedException();
        }
    }
}
