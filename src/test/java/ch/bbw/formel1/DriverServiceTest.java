package ch.bbw.formel1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class DriverServiceTest {
    @InjectMocks
    private DriverRepository repository;
    @Mock
    private DriverService service;

    @BeforeEach
    void setUp() {
        service = new DriverService(repository);
    }

    @Test
    void getAllDrivers() {
        List<Driver> newList = List.of(new Driver("Noel", "Gebhardt", 20, "noel.gebhardt@gmail.com", "testStreet", new Date(2000)), new Driver("testFirstName", "testLastName", 22, "test.test@test.com", "testStreet", new Date(2000)));
        assertEquals(service.getAllDrivers().get(0).getFirstName(), newList.get(0).getFirstName());
        assertEquals(service.getAllDrivers().get(0).getLastName(), newList.get(0).getLastName());
        assertEquals(service.getAllDrivers().get(0).getAge(), newList.get(0).getAge());
        assertEquals(service.getAllDrivers().get(0).getBirthdate(), newList.get(0).getBirthdate());
        assertEquals(service.getAllDrivers().get(0).getEmail(), newList.get(0).getEmail());
        assertEquals(service.getAllDrivers().get(0).getStreet(), newList.get(0).getStreet());
    }

    @Test
    void addDriver() {
        service.addDriver(new Driver("testFirstName", "testLastName", 22, "test.test@test.com", "testStreet", new Date(2000)));
        List<Driver> newList = List.of(new Driver("Noel", "Gebhardt", 20, "noel.gebhardt@gmail.com", "testStreet", new Date(2000)), new Driver("testFirstName", "testLastName", 22, "test.test@test.com", "testStreet", new Date(2000)));

        assertEquals(service.getAllDrivers().get(0).getFirstName(), newList.get(0).getFirstName());
        assertEquals(service.getAllDrivers().get(0).getLastName(), newList.get(0).getLastName());
        assertEquals(service.getAllDrivers().get(0).getAge(), newList.get(0).getAge());
        assertEquals(service.getAllDrivers().get(0).getBirthdate(), newList.get(0).getBirthdate());
        assertEquals(service.getAllDrivers().get(0).getEmail(), newList.get(0).getEmail());
        assertEquals(service.getAllDrivers().get(0).getStreet(), newList.get(0).getStreet());

        assertEquals(service.getAllDrivers().get(1).getFirstName(), newList.get(1).getFirstName());
        assertEquals(service.getAllDrivers().get(1).getLastName(), newList.get(1).getLastName());
        assertEquals(service.getAllDrivers().get(1).getAge(), newList.get(1).getAge());
        assertEquals(service.getAllDrivers().get(1).getBirthdate(), newList.get(1).getBirthdate());
        assertEquals(service.getAllDrivers().get(1).getEmail(), newList.get(1).getEmail());
        assertEquals(service.getAllDrivers().get(1).getStreet(), newList.get(1).getStreet());
    }
}