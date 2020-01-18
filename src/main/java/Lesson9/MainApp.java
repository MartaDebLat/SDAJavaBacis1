package Lesson9;


import java.sql.SQLOutput;
import java.time.LocalDate;

public class MainApp {
    public static void main(String[] args) {

//        UnitConverter.celciusToFahrenhrit(12);
//        UnitConverter.kilometresToMiles(12);
//        UnitConverter.milesTokilometres(12);
//        UnitConverter.kilosToPounds(12);
//        UnitConverter.PoundsToKilos(12);

//        Person person = new Person("Jan", "Kowalski", "89021476971", LocalDate.of(1989, 2, 14));
//        Person person2 = new Person("Brajan", "Janowski", "10221476971", LocalDate.of(2010, 2, 14));
//        Person person3 = new Person("Brajan", "Janowski", "10221476971", LocalDate.of(1989, 2, 14));
//        AgeValidator.isAdult(person);
//        AgeValidator.isAdult(person2);
//        AgeValidator.isAdult(person3);
//        System.out.println(PseudoCodeExerciseImpl.HighValue(1, 3, 4, 6, 8, 9, 10));

        System.out.println(GCD.GCd(12, 36));

         System.out.println(GCD.factorial(19));  //powyżej 19 wynik niewiarygodny!

        String first = "Hi, I'm first";
        String second = "Hi, I'm second";
        String third = "Hi, I'm third";
        StackImpl stack = new StackImpl();
        StackImpl secondStack = new StackImpl();
        stack.push(first);
        stack.push(second);
        stack.push(third);

        Object peakResult = stack.peak();
        System.out.println((String) peakResult);

       Object popResult = stack.pop ();
        Object popResultTwo = stack.pop();

        System.out.println((String) popResult);
        System.out.println((String) popResultTwo);


        stack.push(100);
        stack.push(102);
        stack.push(103);

    }
}
