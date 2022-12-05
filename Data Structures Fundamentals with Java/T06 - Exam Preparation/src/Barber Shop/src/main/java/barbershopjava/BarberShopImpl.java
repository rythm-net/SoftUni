package barbershopjava;

import java.util.Collection;

public class BarberShopImpl implements BarberShop {

    @Override
    public void addBarber(Barber b) {

    }

    @Override
    public void addClient(Client c) {

    }

    @Override
    public boolean exist(Barber b) {
        return false;
    }

    @Override
    public boolean exist(Client c) {
        return false;
    }

    @Override
    public Collection<Barber> getBarbers() {
        return null;
    }

    @Override
    public Collection<Client> getClients() {
        return null;
    }

    @Override
    public void assignClient(Barber b, Client c) {

    }

    @Override
    public void deleteAllClientsFrom(Barber b) {

    }

    @Override
    public Collection<Client> getClientsWithNoBarber() {
        return null;
    }

    @Override
    public Collection<Barber> getAllBarbersSortedWithClientsCountDesc() {
        return null;
    }

    @Override
    public Collection<Barber> getAllBarbersSortedWithStarsDescendingAndHaircutPriceAsc() {
        return null;
    }

    @Override
    public Collection<Client> getClientsSortedByAgeDescAndBarbersStarsDesc() {
        return null;
    }
}
