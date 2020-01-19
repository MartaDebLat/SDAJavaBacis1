package Lesson11;

import java.util.*;

public class App {


    public static void main(String[] args) {
        Map<String, Employee> mapOfEmployee = new HashMap<>();
        Employee Cris = new Employee("Cris", 15000);
        Employee Kate = new Employee("Kate", 25000);
        Employee Sam = new Employee("Sam", 20000);
        mapOfEmployee.put("70kg",Cris);
        mapOfEmployee.put("20s", Kate);
        mapOfEmployee.put("54x", Sam);

        Employee employee = mapOfEmployee.get("20s");
        System.out.println(employee);


    }

    public static void setExample (String[] args) {
        Set<Employee> setOfEmployees = new HashSet<>();
        Employee kristoff = new Employee("Kristof", 15000);
        Employee kristoff2 = new Employee("Kristof", 15000);
        setOfEmployees.add(kristoff);
        setOfEmployees.add(kristoff);
        setOfEmployees.add(kristoff2);
        for (Employee singleEmployee : setOfEmployees) {
            System.out.println(singleEmployee);
        }
    }
    public static void arrayListExample () {

        String name = "Anna";
        Employee Cris = new Employee("Cris", 15000);
        Employee Kate = new Employee("Kate", 25000);
        Employee Sam = new Employee("Sam", 20000);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(Cris);
        employeeList.add(Kate);
        employeeList.add(Sam);
        employeeList.add(Sam);
        Employee employee = employeeList.get(0);

        for (Employee singleEmployee : employeeList) {
            singleEmployee.giveRaise(1000);

        }
        for (Employee singleEmloyee : employeeList) {
            System.out.println(singleEmloyee);
        }
    }
}

//        employeeList.add(name);
//        employeeList.add(Cris);
//        Object o = employeeList.get(0);
//        Object o1 = employeeList.get(1);
//        Employee copyOfCris = (Employee) o;
//        copyOfCris.giveRaise(5000);




//        int someRandomNumber = 4;
//        Employee anna = new Employee("anna", 20000);
//        Employee cris = new Employee("cris", 15000);
//        Employee[] workers = {anna, cris};
//
//        for (Employee singleEmployee : workers) {
//            singleEmployee.giveRaise(5000);
//        }
//
//        String cristofAsString = cris.toString();
//        System.out.println(anna);
//        System.out.println(cris);
//
//        anna.giveRaise(4000);
//        System.out.println(anna);
//
//        PrintUtil printer = new PrintUtil();
//        PrintUtil.printAsterixes();

//        superLinkedList list = new superLinkedList();
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//        list.add(60);
//        list.add(70);
//        list.add(80);
//        list.add(90);
//
//        list.printAll();
//    }
//
//}
