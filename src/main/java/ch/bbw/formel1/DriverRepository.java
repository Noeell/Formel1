package ch.bbw.formel1;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class DriverRepository {
    private final List<Driver> drivers;

    public DriverRepository() {
        super();
        this.drivers = new ArrayList<Driver>();

        drivers.add(new Driver("Noel", "Gebhardt", 20, "noel.gebhardt@gmail.com", "testStreet", new Date(2000)));
    }

    public List<Driver> getAllDrivers() {
        return drivers;
    }

    public void addDriver(Driver driver){
        drivers.add(driver);
    }
}
