package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String symbols, String word) {
        String[] symbolsToArray = symbols.split("");
        String[] wordToArray = word.split("");
        List<String> symbolsList = new ArrayList<>(Arrays.asList(symbolsToArray));
        List<String> wordList = new ArrayList<>(Arrays.asList(wordToArray));

        boolean isTrasformable = false;

        if (symbolsList.size() < wordList.size()) {
            return isTrasformable;
        }

        int matchCount = 0;

        for (String w : wordList) {
            if (!symbolsList.remove(w.toLowerCase())) {
                isTrasformable = false;
                return isTrasformable;
            } else {
                isTrasformable = true;
            }
        }

        return isTrasformable;
    }

    public static void main (String[] args) {
        App.scrabble("rkqodlw", "world"); // true
        App.scrabble("ajv", "java"); // false
        App.scrabble("avjafff", "JaVa"); // true
        App.scrabble("", "hexlet"); // false

        System.out.println(App.scrabble("rkqodlw", "world"));
        System.out.println(App.scrabble("ajv", "java"));
        System.out.println(App.scrabble("avjafff", "JaVa"));
        System.out.println(App.scrabble("", "hexlet"));

    }
}
//END
