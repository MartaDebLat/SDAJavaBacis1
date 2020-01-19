package Lesson11;

import java.util.Objects;

public class Employee {
    private String name;
    private String peselNumber;
    private int salary;

    public Employee(String name, String peselNumber, int salary) {
        this.name = name;
        this.peselNumber = peselNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPeselNumber() {
        return peselNumber;
    }

    public void setPeselNumber(String peselNumber) {
        this.peselNumber = peselNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void giveRaise(int amount) {
        salary = salary + amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary &&
                name.equals(employee.name) &&
                peselNumber.equals(employee.peselNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, peselNumber, salary);
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", peselNumber='" + peselNumber + '\'' +
                ", salary=" + salary +
                '}';

    }
}

