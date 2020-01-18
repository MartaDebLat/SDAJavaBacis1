package Lesson9;


import java.time.LocalDate;

public class MainApp {
    public static void main(String[] args) {

//        UnitConverter.celciusToFahrenhrit(12);
//        UnitConverter.kilometresToMiles(12);
//        UnitConverter.milesTokilometres(12);
//        UnitConverter.kilosToPounds(12);
//        UnitConverter.PoundsToKilos(12);

        Person person = new Person("Jan", "Kowalski", "89021476971", LocalDate.of(1989, 2, 14));
        Person person2 = new Person("Brajan", "Janowski", "10221476971", LocalDate.of(2010, 2, 14));
        Person person3 = new Person("Brajan", "Janowski", "10221476971", LocalDate.of(1989, 2, 14));
        AgeValidator.isAdult(person);
        AgeValidator.isAdult(person2);
        AgeValidator.isAdult(person3);
    }

}
