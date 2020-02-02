package Lesson13;


import Lesson9_10.Person;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 4 ;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("No data");
        else
            System.out.println(" Element have index: " + result);
    }
}

//        SoftDrink[] arrDrinks = {
//                new SoftDrink("Coca Cola", "Coca Cola Inc", 4.5),
//                new SoftDrink("Pepsi", "PepsiCo", 4.2),
//                new SoftDrink("Mirinda", "PepsiCo", 3.5),
//                new SoftDrink("Fanta", "Coca Cola Inc", 4.35),
//                new SoftDrink("Cola Zero", "Coca Cola Inc", 4.35),
//                new SoftDrink("Polo Cola", "PoloCocta", 2.35),
//                new SoftDrink("Kompot teściowej", "Teściowa", Double.MAX_VALUE),
//                new SoftDrink("3 cytryny", "Zbyszko", 0.0),
//        };
//        SoftDrink searchSoftDrink = new SoftDrink("Fanta", "Coca Cola inc", 4.2);
//        int indexPosition = LinearSearchUtil.findFirstSoftDrink(searchSoftDrink, arrDrinks);
//        System.out.println("Searched drink is on: " + indexPosition);
//    }}

//
//        Person personOne = new Person("John", "Smith", "123", LocalDate.of(1987, 12, 1));
//        Person personTwo = new Person("Ann", "Smith", "324", LocalDate.of(2002, 6, 28));
//        Person personThree = new Person("Zusa", "Args", "444", LocalDate.of(1985, 5, 11));
//        Person personFourth = new Person("Caroline", "Koy", "432", LocalDate.of(1988, 1, 1));
//        Person personFive = new Person("Abdullah", "Ali", "256", LocalDate.of(1958, 1, 12));
//        Person personSix = new Person("Big", "O", "521", LocalDate.of(1984, 1, 15));
//        Person personSeven = new Person("Gertruda", "Shmidt", "332", LocalDate.of(2000, 1, 1));
//        Person personEight = new Person("TEST", "ACTOR", "312", null);
//
//        Person[] people = {personOne, personTwo, personThree, personFourth, personFive, personSix, personSeven};
//        Arrays.sort(people);
//        System.out.println(Arrays.toString(people));
//
//    }
//
//    public static void quickSortTest() {
//        int[] arrOne = {12, 5, 3, 5, 6, 3, 353, 42};
//        int[] arrTwo = {12, -5, 3, 5, 2332, 13, 353, 0, 42, 55, 6666, 34};
//        System.out.println("arrOne");
//        System.out.println(Arrays.toString(arrOne));
//        QuickSort.sort(arrOne);
//        System.out.println(Arrays.toString(arrOne));
//
//        System.out.println("arrTwo");
//        System.out.println(Arrays.toString(arrTwo));
//        QuickSort.sort(arrTwo);
//        System.out.println(Arrays.toString(arrTwo));
//
//    }
//}
