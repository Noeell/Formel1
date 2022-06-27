package ch.bbw.formel1;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.util.Date;

public class Driver {

    @NotNull
    @Size(min = 2, max = 25)
    private String firstName;

    @NotNull
    @Size(min = 2, max = 25)
    private String lastName;

    @NotNull
    @Min(18)
    private int age;

    @NotNull
    @Email
    private String email;

    @NotNull
    @Size(min = 2, max = 25)
    private String street;

    @NotNull
    @Past(message="muss in der Verganganheit sein")
    @DateTimeFormat(pattern="yyyy-MM-dd")   // für html 5 date!
    private Date birthdate;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}
