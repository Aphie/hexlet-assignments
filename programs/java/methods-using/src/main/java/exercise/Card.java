package exercise;

class Card {
    public static void printHiddenCard(String cardNumber, int starsCount) {
        // BEGIN
        String str = "*";
        Integer cardLength = cardNumber.length();
        System.out.println(str.repeat(starsCount) + cardNumber.substring((cardLength - 4)));
        // END
    }
}
