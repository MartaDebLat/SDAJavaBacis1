package Lesson9_10;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;

public class Person implements Comparable <Person>{
    String firstName, lastName, peselNumber;
    LocalDate yearOfBirth;

    public Person(String firstName, String lastName, String peselNumber, LocalDate yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.peselNumber = peselNumber;
        this.yearOfBirth = yearOfBirth;
    }

    public Person(Object o) {
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

    public int compareTo(Person otherPerson) {
        return otherPerson.yearOfBirth.compareTo(this.yearOfBirth);
 //       if (new Person(null))
 //           return "NO DATA";
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", peselNumber='" + peselNumber + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}



