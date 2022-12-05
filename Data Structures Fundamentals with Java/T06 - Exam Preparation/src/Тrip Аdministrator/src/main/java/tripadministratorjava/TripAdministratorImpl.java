package tripadministratorjava;

import java.util.Collection;

public class TripAdministratorImpl implements TripAdministrator {

    @Override
    public void addCompany(Company c) {

    }

    @Override
    public void addTrip(Company c, Trip t) {

    }

    @Override
    public boolean exist(Company c) {
        return false;
    }

    @Override
    public boolean exist(Trip t) {
        return false;
    }

    @Override
    public void removeCompany(Company c) {

    }

    @Override
    public Collection<Company> getCompanies() {
        return null;
    }

    @Override
    public Collection<Trip> getTrips() {
        return null;
    }

    @Override
    public void executeTrip(Company c, Trip t) {

    }

    @Override
    public Collection<Company> getCompaniesWithMoreThatNTrips(int n) {
        return null;
    }

    @Override
    public Collection<Trip> getTripsWithTransportationType(Transportation t) {
        return null;
    }

    @Override
    public Collection<Trip> getAllTripsInPriceRange(int lo, int hi) {
        return null;
    }
}
