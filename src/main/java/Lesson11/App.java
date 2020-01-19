package Lesson11;

public class App {
    public static void main(String[] args) {

        int someRandomNumber = 4;
        Employee anna = new Employee("anna", 20000);
        Employee cris = new Employee("cris", 15000);
        Employee[] workers = {anna, cris};

        for (Employee singleEmployee : workers) {
            singleEmployee.giveRaise(5000);
        }

        String cristofAsString = cris.toString();
        System.out.println(anna);
        System.out.println(cris);

        anna.giveRaise(4000);
        System.out.println(anna);

    }

}
