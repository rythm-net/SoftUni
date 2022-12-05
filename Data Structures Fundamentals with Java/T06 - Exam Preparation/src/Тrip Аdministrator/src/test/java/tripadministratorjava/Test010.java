package tripadministratorjava;

import tripadministratorjava.Company;
import tripadministratorjava.Transportation;
import tripadministratorjava.Trip;
import tripadministratorjava.TripAdministratorImpl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test010 {

    private TripAdministratorImpl tripAdministrations;
    private Trip t1 = new Trip("a", 1, Transportation.NONE, 1);

    @Before
    public void Setup() {
        this.tripAdministrations = new TripAdministratorImpl();
    }

    @Test
    public void TestAddTripPerf() {
        var nc = new Company("0", 100000);
        this.tripAdministrations.addCompany(nc);
        for (int i = 0; i < 10000; i++) {
            this.tripAdministrations.addTrip(nc, new Trip(i + "", i, Transportation.NONE, i));
        }

        long start = System.currentTimeMillis();
        this.tripAdministrations.addTrip(nc, t1);
        long stop = System.currentTimeMillis();
        assertTrue(stop - start <= 20);
    }
}