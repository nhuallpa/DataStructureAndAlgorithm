package com.nhuallpa.computing.utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Strings {

    public static boolean hasDuplicateChars(String s) {

        List<String> characters = Arrays.asList(s.split(""));
        Collections.sort(characters);

        var hasDuplicates = false;

        for (int i = 0; i < characters.size() - 1; i++) {
            var currentValue = characters.get(i);
            var nextValue = characters.get(i+1);
            if (currentValue.equals(nextValue)) hasDuplicates = true;
        }
        return hasDuplicates;

    }

    public static boolean areAnagram(String word, String otherWord) {

        var letters = Arrays.asList(word.split("")).stream()
                .collect(Collectors.groupingBy(String::toString,
                        Collectors.counting()));
        var otherLetters = Arrays.asList(otherWord.split("")).stream()
                .collect(Collectors.groupingBy(String::toString,
                        Collectors.counting()));

        return letters.equals(otherLetters);
    }
}
