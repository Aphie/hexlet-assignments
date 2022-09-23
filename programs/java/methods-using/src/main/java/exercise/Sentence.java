package exercise;

class Sentence {
    public static void printSentence(String sentence) {
        // BEGIN
        int index = sentence.indexOf("!");
        if (index == -1) {
            System.out.println(sentence.toLowerCase());
        } else
        {
            System.out.println(sentence.toUpperCase());
        }
        // END
    }
}
