package Lesson9_10;

import java.time.LocalDate;

public class AgeValidator {

    public static boolean isAdult(Person person) {

        LocalDate today = LocalDate.now();
        LocalDate adultAge = today.minusYears(18);
        System.out.println(adultAge);
        if (person.getYearOfBirth().isAfter(adultAge)) {

            System.out.println("Underage");
            return false;
        }

        String peselNumber = person.getPeselNumber();
        LocalDate localDateFromPeselNumber;
        String yearAsString, mothAsString, dayAsString;
        yearAsString = peselNumber.substring(0, 2);
        mothAsString = peselNumber.substring(2, 4);
        dayAsString = peselNumber.substring(5, 6);

        Integer yearAsInt, mothAsInt, dayAsInt;

        yearAsInt = Integer.valueOf(yearAsString);
        mothAsInt = Integer.valueOf(mothAsString);
        dayAsInt = Integer.valueOf(dayAsString);

        if (mothAsInt > 12) {
            yearAsInt = yearAsInt + 2000;
            mothAsInt = mothAsInt - 20;

        } else {
            yearAsInt = yearAsInt + 1900;

        }

        localDateFromPeselNumber = LocalDate.of(yearAsInt, mothAsInt, dayAsInt);
        if (localDateFromPeselNumber.isAfter(adultAge)) {

            System.out.println("False data");
            return false;
        } else {
            System.out.println("Access granted");
            return true;
        }
    }
}
