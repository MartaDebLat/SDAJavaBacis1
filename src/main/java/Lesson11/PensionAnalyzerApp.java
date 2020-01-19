package Lesson11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PensionAnalyzerApp {

    public static void main(String[] args) {

        Employee kristoff = new Employee("Kristof", "123", 15000);
        Employee kasia = new Employee("Kasia", "324", 25000);
        Employee grazynka = new Employee("Grażynka", "456", 3500);
        Employee karol = new Employee("Karol", "433", 13000);
        Employee zbigniew = new Employee("Zbigniew", "555", 13000);
        Employee joanna = new Employee("Joanna", "322", 1500);
        Employee aziz = new Employee("Aziz", "333", 4999);

        List<Employee> AllEmployees = new ArrayList<>();
        AllEmployees.add(kristoff);
        AllEmployees.add(kasia);
        AllEmployees.add(grazynka);
        AllEmployees.add(karol);
        AllEmployees.add(zbigniew);
        AllEmployees.add(joanna);
        AllEmployees.add(aziz);

        List<Employee> employeesToFired = new ArrayList<>();
        for (Employee employee : AllEmployees) {
            if (employee.getSalary() < 10000)
                employeesToFired.add(employee);
        }
        System.out.println(employeesToFired.get(employeeDismissalApplication(employeesToFired)).getName());
    }
        public static int employeeDismissalApplication(List<Employee> employeesToFired) {
            Random i = new Random();
            return i.nextInt(employeesToFired.size());
        }

    }

