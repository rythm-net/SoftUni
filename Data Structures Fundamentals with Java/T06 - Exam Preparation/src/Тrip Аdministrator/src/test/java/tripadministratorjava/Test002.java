package tripadministratorjava;

import tripadministratorjava.Company;
import tripadministratorjava.Transportation;
import tripadministratorjava.Trip;
import tripadministratorjava.TripAdministratorImpl;

import org.junit.Before;
import org.junit.Test;

public class Test002 {

    private TripAdministratorImpl tripAdministrations;

    private Company c1 = new Company("a", 2);

    @Before
    public void Setup() {
        this.tripAdministrations = new TripAdministratorImpl();
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestAddCompanyTwiceThrowException() {
        this.tripAdministrations.addCompany(c1);
        this.tripAdministrations.addCompany(c1);
    }
}