package ch.bbw.formel1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {

    @Autowired
    private DriverRepository repository;

    public List<Driver> getAllDrivers() {
        return repository.getAllDrivers();
    }
    public void addDriver(Driver driver){
        repository.addDriver(driver);
    }
}
