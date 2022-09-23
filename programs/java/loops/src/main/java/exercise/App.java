package exercise;

class App {
    // BEGIN
    public static String getAbbreviation (String phrase) {
        String newPhrase = phrase.trim();
        String modifiedPhrase = "" + newPhrase.charAt(0);
        for (int i = 1; i < newPhrase.length(); i++) {
            if (newPhrase.charAt(i) == ' ' && newPhrase.charAt(i+1)!= ' ') {
                    modifiedPhrase += Character.toUpperCase(newPhrase.charAt(i + 1));
                }
            }
        return modifiedPhrase;
    }

    public static void main (String[] args) {
        System.out.println("Аббревиатура: " + getAbbreviation("Portable   Network Graphics")); // "PNG"
        System.out.println("Аббревиатура: " + getAbbreviation("Complementary metal oxide semiconductor")); // "CMOS"
    }
    // END
}
