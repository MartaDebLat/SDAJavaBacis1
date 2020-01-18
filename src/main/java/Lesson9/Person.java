package Lesson9;

import java.time.LocalDate;

public class Person {
    String firstName, lastName, peselNumber;
    LocalDate yearOfBirth;

    Person(String firstName, String lastName, String peselNumber, LocalDate yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.peselNumber = peselNumber;
        this.yearOfBirth = yearOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPeselNumber() {
        return peselNumber;
    }

    public LocalDate getYearOfBirth() {
        return yearOfBirth;
    }
}



