package tripadministratorjava;

import tripadministratorjava.Company;
import tripadministratorjava.Transportation;
import tripadministratorjava.Trip;
import tripadministratorjava.TripAdministratorImpl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test001 {

    private TripAdministratorImpl tripAdministrations;

    private Company c1 = new Company("a", 2);

    @Before
    public void Setup() {
        this.tripAdministrations = new TripAdministratorImpl();
    }

    @Test
    public void TestAddCompany() {
        this.tripAdministrations.addCompany(c1);
        assertTrue(this.tripAdministrations.exist(c1));
    }
}