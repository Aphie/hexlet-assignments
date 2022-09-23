package exercise;

public class Example {
    public static void main(String[] args) {

        //слои абстракции
        customCalculator();
    }

    /**
     * Вторая реализация метода logResult.
     *
     * @param result Результат, который нужно распечатать.
     */
//    static void logResult(int result) {
//        System.out.println("[CALCULATOR RESULT]: result = " + result);
//    }
    static void logResult(int result) {
        System.out.println("The result of expression = " + result);
    }

    static double division(double a, double b, boolean isReminder) {
        if (isReminder) {
            return a / b;
        } else {
            int aInt = (int) a;
            int bInt = (int) b;
            return aInt / bInt;
        }
    }

    static void customCalculator() {
        // получаем параметры
        int num1 = 1;
        int num2 = 3;
        char symbol = '+';

        int result = calculate(num1, num2, symbol);

        logResult(result);
    }

    static int calculate(int num1, int num2, char symbol) {
        switch (symbol) {
            case '+':
                return num1 + num2;

            case '-':
                return num1 - num2;

            case '*':
                return num1 * num2;

            default:
                return num1 / num2;
        }
    }
}
