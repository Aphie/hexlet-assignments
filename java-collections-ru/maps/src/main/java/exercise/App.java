package exercise;

import java.util.*;

// BEGIN
public class App {
    public static Map getWordCount(String sentence) {
        Map<String,Integer> wordCountMap = new HashMap<String,Integer>();

        if (sentence.isEmpty()) {
            return wordCountMap;
        }

        String[] sentenceToArray = sentence.split(" ");

        for (int i = 0; i < sentenceToArray.length; i++) {
            int count = wordCountMap.getOrDefault(sentenceToArray[i], 0);
            wordCountMap.put(sentenceToArray[i], count + 1);

        }
        return wordCountMap;
    }

    public static String toString(Map wordCountMap) {
        Set<String> keys = wordCountMap.keySet();
        String[] keysToArray = keys.toArray(new String[keys.size()]);
        if (wordCountMap.isEmpty()) {
            return "{}";
        }

        String result = "{\n";

        for (int i = 0; i < keys.size(); i++) {
            result += "  " + keysToArray[i] + ": " + wordCountMap.get(keysToArray[i]) + "\n";
        }
        return result + "}";
    }
    public static int generateRandom(int minNumber, int maxNumber) {
        Random random = new Random();
        return random.nextInt(maxNumber - minNumber + 1) + minNumber;
    }

    public static void main (String[] args) {
        String sentence = "the java is the best programming language java";
        Map wordsCount = App.getWordCount(sentence);
        String result = App.toString(wordsCount);
        System.out.println(result);

        Map wordsCount2 = App.getWordCount("");
        String result2 = App.toString(wordsCount2);
        System.out.println(result2); // => {}

        System.out.println("RandomNumber = " + generateRandom(5,10));

    }
}
//END
