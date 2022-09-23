class Example {

    // Methods define

    public static int multiply(int a, int b) {
        return a * b;
    }

    // public static void sayHello() {
    //     String greeting = "Hello";
    //     System.out.println(greeting);
    // }

    // Methods calling

    public static void main(String[] args) {
        int result = multiply(2, 3);
        System.out.println(result); // 6

        // sayHello(); // => "Hello!"

        // Computed arguments

        int result1 = multiply(1 + 2, 3 + 2); // 15
        System.out.println(result1);

        // System.out.println(multiply(3, 4)); // => 12
    }
}
