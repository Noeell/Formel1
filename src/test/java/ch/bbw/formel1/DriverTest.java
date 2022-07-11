package ch.bbw.formel1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DriverTest {
    private Driver driver;

    @BeforeEach
    void setUp() {
        driver = new Driver("testName", "testLastName", 20, "test.test@test.com", "testStreet", new Date(2000));
    }

    @Test
    void getFirstName() {
        assertEquals(driver.getFirstName(), "testName");
    }

    @Test
    void setFirstName() {
        driver.setFirstName("paul");
        assertEquals(driver.getFirstName(), "paul");
    }

    @Test
    void getAge() {
        assertEquals(driver.getAge(), 20);
    }

    @Test
    void setAge() {
        driver.setAge(33);
        assertEquals(driver.getAge(), 33);
    }

    @Test
    void getEmail() {
        assertEquals(driver.getEmail(), "test.test@test.com");
    }

    @Test
    void setEmail() {
        driver.setEmail("newEmail.mail@mail.com");
        assertEquals(driver.getEmail(), "newEmail.mail@mail.com");
    }

    @Test
    void getBirthdate() {
        assertEquals(driver.getBirthdate(), new Date(2000));

    }

    @Test
    void setBirthdate() {
        driver.setBirthdate(new Date(1999));
        assertEquals(driver.getBirthdate(), new Date(1999));
    }
}