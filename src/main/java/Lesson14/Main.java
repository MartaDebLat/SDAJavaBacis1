package Lesson14;

import kotlin.collections.UCollectionsKt;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {

    private static List<Integer> listIntigers;

    public static void main(String[] args) {
        List<String>words = WordsProvider.provide();

//        List<String> wordsOnLettedD = words.stream()
//        .filter(singleWord -> singleWord.startsWith("d"))
//                .collect(Collectors.toList());
//        System.out.println(wordsOnLettedD);
//
//       List<String> shortWordsonAwith4letters = words.stream()
//                .filter( word -> word.startsWith("a")&& word.length()<=4)
//                .collect(Collectors.toList());
//
//        System.out.println(shortWordsonAwith4letters);
//
//        List<String> upperCaseWords = words.stream().map(s ->s.substring(0,1).toUpperCase()+s.substring(1))
//                .collect(Collectors.toList());
//
//        System.out.println(upperCaseWords);

        listIntigers = IntList.intsToStream();

    int sum = listIntigers.stream()
            .mapToInt(i->i)
            .sum();
        System.out.println("Sum of elements is "+ sum);
        OptionalDouble average = listIntigers.stream()
                .mapToInt ( i->i)
                .average();

        double averageAsDouble = average.getAsDouble() ;
        System.out.println( "average of elements is: " + averageAsDouble);



    }

}

