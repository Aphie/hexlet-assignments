package hexlet.hw.pr7;

public class Example {
    public static void main(String[] args) {
    //     /**
    //         * while loop.
    //         */
    //     int i = 0;
    //     while (i < 10) {
    //         System.out.println("Счётчик равен = " + i);
    //         i = i + 1;
    //     }

    //     String str = "abc";
    //     int len = str.length();
    //     int i = 0;
    //     String modifiedStr = "";
    //     char symbol;
    //     while (i < len) {
    //         symbol = str.charAt(i);
    //         modifiedStr = modifiedStr + Character.toUpperCase(symbol);
    //         i = i + 1;
    //     }
    //     System.out.println(modifiedStr);


    //     /**
    //         * do-while loop.
    //         */
    //     // попробовать i = 11
    //     int i = 0;
    //     do {
    //         System.out.println("Счётчик равен = " + i);
    //         i+=1;
    //     } while (i < 10);

    //     String str = "abc";
    //     int len = str.length();
    //     int i = 0;
    //     char symbol;
    //     String modifiedStr = "";
    //     //строка не может быть пустой - иначе сломается цикл
    //     do {
    //     symbol = str.charAt(i);
    //         modifiedStr = modifiedStr + Character.toUpperCase(symbol);
    //         i+=1;
    //     } while (i < len);
    //     System.out.println(modifiedStr);

    //     for (int i = 0; i < 10; i++) {
    //         System.out.println("Счётчик равен = " + i);
    //     }

    //     /**
    //         * For loop.
    //         */
    //     String str = "abc";
    //     String modifiedStr = "";
    //     char symbol;
    //     for (int i = 0; i < str.length(); i++) {
    //         symbol = str.charAt(i);
    //         modifiedStr = modifiedStr + Character.toUpperCase(symbol);
    //     }
    //     System.out.println(str);

    //     /**
    //     * Возврат из цикла
    //     */
    //     int number = 7;
    //     System.out.println("Является ли число " + number + " простым? - " + isPrime(number));

    //     /**
    //      * Синтаксический сахар
    //      */

    //     int a = 1;
    //     a*=2;
    //     System.out.println(a);

    //     int b = 2;
    //     b/=2;
    //     System.out.println(b);

    //     int i1 = 0;
    //     System.out.println(i1--);
    //     System.out.println(i1);

    //     int i2 = 0;
    //     System.out.println(++i2);
    //     System.out.println(i2);

    //     /**
    //      * Break/Continue.
    //      */

    //     int i = 0;
    //     while (true) {
    //         if (i >= 10) {
    //             break;
    //         }
    //         System.out.println(++i);
    //     }

    //     int i = 0;
    //     while (true) {
    //         if (i >= 20) {
    //             break;
    //         }
    //         i++;
    //         if (i < 10) {
    //             continue;
    //         }
    //         System.out.println(i);
    //     }
    }

    // static boolean isPrime(int number) {
    //     for (int i = 2; i < number; i++) {
    //         if (number % i == 0) {
    //             // дальнейшие проверки не нужны
    //             return false;
    //         }
    //     }
    //     return true;
    // }
}
