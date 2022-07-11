package ch.bbw.formel1;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {
    private DriverRepository repository;

    public DriverService(DriverRepository repository) {
        this.repository = repository;
    }

    public List<Driver> getAllDrivers() {
        return repository.getAllDrivers();
    }

    public void addDriver(Driver driver) {
        repository.addDriver(driver);
    }
}
