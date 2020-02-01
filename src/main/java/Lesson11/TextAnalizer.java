package Lesson11;

import java.util.*;

public class TextAnalizer {

    public static void main(String[] args) {
        Map<Character, List<String>> mapofWords = groupWordsByFirstCharacter("Alice has two cats.");
        System.out.println(mapofWords);
    }

    public static Map<Character, List<String>> groupWordsByFirstCharacter(String texttoAnalize) {
        Map<Character, List<String>> characterStringMap = new HashMap<>();

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for (int i = 0; i <splitText().length; i++) {

        }

        for (char letter : alphabet
        ) {
            characterStringMap.put(letter, new ArrayList<>());
            characterStringMap.put('a', Collections.singletonList("Alice"));
            characterStringMap.put('h', Collections.singletonList("has"));
   //         characterStringMap.put('t', "two");
   //         characterStringMap.put('c', "cats.");
        }
        return characterStringMap;
    }

    private static String[] splitText () {
        String texttoanalize = "Alice has two cats.";
        return texttoanalize.split(" ");
    }
}