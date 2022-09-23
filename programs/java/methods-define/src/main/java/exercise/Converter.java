package exercise;

class Converter {
    // BEGIN
    public static int convert (int number, String direction ) {
        if (direction.equals("b")) {
            return number * 1024;
        } else if (direction.equals("Kb")) {
            return number / 1024;
        } else {
            return 0;
        }
    }

    public static void main (String[] args) {
        System.out.println("10 Kb = " + convert(10, "b") + " b");
    }
    // END
}
