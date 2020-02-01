package Lesson12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){ //throws InterruptedException {

//        TimeCalculator timeCalculator = new TimeCalculator();
//        TimeCalculator.daysToChrist(LocalDate.of(2020, 7, 22));
//        TimeCalculator.daysToChrist(LocalDate.of(2023, 12, 22));
//        TimeCalculator.daysToChristmasEveInfo();

//        timeCalculator.minutesToEndOfClass();
//        LocalDateTime dateTime = LocalDateTime.now();
//        System.out.println(dateTime.getDayOfWeek());

//        List<Programmer> listOfProgrammers = new ArrayList<>();
//        listOfProgrammers.add(new Programmer(1, "John", "Smith", Gender.MALE));
//        listOfProgrammers.add(new Programmer(2, "Sebastian", "Kowalski", Gender.MALE));
//        listOfProgrammers.add(new Programmer(3, "Ann", "Goodman", Gender.FEMALE));
//        listOfProgrammers.add(new Programmer(4, "Abdullah", "Mohammed", Gender.MALE));
//        listOfProgrammers.add(new Programmer(5, "Gertruda", "Schmidt", Gender.FEMALE));
//        listOfProgrammers.add(new Programmer(6, "Pink", "Unicorn", Gender.OTHER));
//        listOfProgrammers.add(new Programmer(7, "Jozin", "Z Bazin", Gender.MALE));
//        listOfProgrammers.add(new Programmer(8, "Matrix", "Matrix", Gender.OTHER));
//
//        LifeSimulator.simulate(listOfProgrammers, 5);


//        MyQueue <String> myStringQueue = new MyQueue();
//        myStringQueue.offer("Hello");
//        myStringQueue.offer(23); - rozpoznaje ze to nie string
//        MyQueue <Integer> myIntigerQueue = new MyQueue<>();
//        myStringQueue.offer("Hello");
//        myStringQueue.offer(" is it me");
//        myStringQueue.offer("you are looking for?");
//        myStringQueue.offer("NO!");
//        myStringQueue.printAll();
//        myStringQueue.pool();
//        myStringQueue.pool();
//        System.out.println("Object that had been removed: ");
//        myStringQueue.printAll();
//

        int [] sortTab = {3,2,4,4,1,9};
BubbleSort.sort(sortTab);
        System.out.println(Arrays.toString(sortTab));

    }
}
